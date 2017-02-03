package patterns.behavior.interpreter;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 03.02.2017
 * @see patterns.behavior.interpreter
 * @since 03.02.2017 , 19:27:55
 *
 */
public class Parser {

	public TestdatenAusdruck parse(String ausdruckString) {
		if (ausdruckString.length() == 0) {
			throw new RuntimeException("Leerer Ausdruck");
		}

		ZusammengesetzterAusdruck ausdruck = new ZusammengesetzterAusdruck();
		StringBuilder literal = new StringBuilder();

		for (int i = 0; i < ausdruckString.length(); i++) {
			char c = ausdruckString.charAt(i);
			switch (c) {
			case '#':
				LiteralAusdruckHinzufuegen(literal, ausdruck);
				ausdruck.ausdruckHinzufuegen(new ZufallszahlAusdruck());
				break;
			case '<':
				LiteralAusdruckHinzufuegen(literal, ausdruck);
				String variable = delimitedString(ausdruckString.substring(i), '<', '>');
				ausdruck.ausdruckHinzufuegen(new VariableAusdruck(variable));
				i = i + variable.length() + 1;
				continue;
			case '[':
				LiteralAusdruckHinzufuegen(literal, ausdruck);
				String wdhString = delimitedString(ausdruckString.substring(i), '[', ']');
				int kommaPosition = wdhString.indexOf(',');
				if (kommaPosition == -1) {
					throw new RuntimeException("Kein Komma vorhanden, dass die Wiederholung des Ausdrucks trennt.");
				}
				int anzahlWiederholungen = Integer.parseInt(wdhString.substring(0, kommaPosition));
				String ausdruckWiederholung = wdhString.substring(kommaPosition + 1);
				ausdruck.ausdruckHinzufuegen(
						new WiederholungsAusdruck(parse(ausdruckWiederholung), anzahlWiederholungen));
				i = i + wdhString.length() + 1;
				break;

			default:
				literal.append(c);
				break;
			}
		}

		LiteralAusdruckHinzufuegen(literal, ausdruck);
		if (ausdruck.getAusdruecke().size() == 0) {
			return null;
		} else if (ausdruck.getAusdruecke().size() == 1) {
			return ausdruck.getAusdruecke().get(0);
		} else {
			return ausdruck;
		}
	}

	/**
	 * @param substring
	 * @param c
	 * @param d
	 * @return
	 */
	private String delimitedString(String ausdruckString, char startDelimiter, char endDelimiter) {
		int delimiterCount = 0;
		for (int i = 1; i < ausdruckString.length(); i++) {
			if (ausdruckString.charAt(i) == startDelimiter) {
				delimiterCount += 1;
				continue;
			}

			if (ausdruckString.charAt(i) == endDelimiter) {
				if (delimiterCount == 0) {
					return ausdruckString.substring(1, i);
				} else {
					delimiterCount = delimiterCount - 1;
				}
			}
		}
		throw new RuntimeException("Kein schließendes Element");
	}

	/**
	 * @param literal
	 * @param ausdruck
	 */
	private void LiteralAusdruckHinzufuegen(StringBuilder literal, ZusammengesetzterAusdruck ausdruck) {
		if (literal.length() > 0) {
			ausdruck.ausdruckHinzufuegen(new LiteralAusdruck(literal.toString()));
			literal.setLength(0);
		}

	}

}

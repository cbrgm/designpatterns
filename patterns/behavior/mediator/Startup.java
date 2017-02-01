package patterns.behavior.mediator;

/**
 * @author Christian Bargmann <christian.bargmann@haw-hamburg.de>
 * @version 01.02.2017
 * @see patterns.behavior.mediator
 * @since 01.02.2017 , 22:17:20
 *
 */
public class Startup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();

		Colleague colleagueA = new ConcreteColleagueA(mediator);
		Colleague colleagueB = new ConcreteColleagueB(mediator);

		mediator.addColleague(colleagueA);
		mediator.addColleague(colleagueB);
		
		colleagueA.send("Hello World!");
		colleagueB.send("Hi Friend!");
	}

}


/**
 * This is the Main class which calls both the fighter and battle class to let users simulate a fight between 2 fighters.
 * @author Tyler Caldwell
 * @version A Level 9/24/2025
 */
public class Main
{
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter( "Tylan", 100, 30, 15);

        Battle battle = new Battle(fighter1, fighter2);
        battle.printStartInfo();

        for (int i = 0; i < 4; i++) {
            battle.printRoundUpdate();
            battle.takeTurn();
            battle.swapFighters();
        }

        battle.printEndInfo();

    }
}


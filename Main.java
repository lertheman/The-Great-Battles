
/**
 * 
 */
public class Main
{
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter( "Tylan", 100, 30, 15);

        Battle battle = new Battle(fighter1, fighter2);
        battle.printStartInfo();
        
        
        while (!battle.getBattleOver()) {
            battle.printRoundUpdate();
            battle.takeTurn();
            battle.swapFighters();
        }
        
        
        battle.printEndInfo();
        
        
    }
}

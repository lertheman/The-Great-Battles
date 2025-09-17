
/**
 * 
 */
public class Main
{
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        
        Fighter fighter2 = new Fighter( "Tylan", 100, 30);
        
        Battle battle = new Battle(fighter1, fighter2);
        
        battle.takeTurn();
    }
}

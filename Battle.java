
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    private Fighter attacker;
    private Fighter defender;
    private int numRounds; 
    public Battle(Fighter initAttacker, Fighter initDefender){
        attacker = initAttacker;
        defender = initDefender;
        numRounds = 0;
    }

    public Fighter getAttacker() {
        return attacker;
    }

    public Fighter getDefender(){
        return defender;
    }

    public int getNumRounds(){
        return numRounds;
    }

    public void printRoundUpdate(){
        System.out.println("Round " + getNumRounds());
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + " " + defender.getName() + ": " + defender.getHealthPoints());
    }

    public void takeTurn() {
        int amount = attacker.dealDamage();
        defender.takeDamage(amount);
        numRounds++;

    }

    public void swapFighters() {
        Fighter temp = attacker;
        attacker = defender;
        defender = temp;

    }

}

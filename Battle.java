
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

    public Battle(Fighter initAttacker, Fighter initDefender){
        attacker = initAttacker;
        defender = initDefender;
    }

    public Fighter getAttacker() {
        return attacker;
    }

    public Fighter getDefender(){
        return defender;
    }

    public void takeTurn() {
        int amount = attacker.dealDamage();
        defender.takeDamage(amount);
    }
}

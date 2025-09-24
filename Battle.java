import java.util.Scanner;
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
    private Scanner scan;
    public Battle(Fighter initAttacker, Fighter initDefender){
        attacker = initAttacker;
        defender = initDefender;
        numRounds = 0;
        scan = new Scanner(System.in);
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
        System.out.println("Would you like to attack or heal? attack or heal?");
        String choice = scan.nextLine();
        if(choice.equals("attack")){
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);    
        } else if(choice.equals("heal")){
            attacker.heal();

        } else {
            System.out.println("Invalid choice, you lost your turn.");
        }
        numRounds++;
    }

    public void printStartInfo(){
        System.out.println("Welcome to a fight between " + attacker.getName() + " and " + defender.getName());
        System.out.println( attacker.toString() + " " + defender.toString());
        
    }
    
    public void printEndInfo(){
        System.out.println("The battle it over. " + "The attacker " + attacker.getName() + " has " + attacker.getHealthPoints() + " health left.");  
        System.out.println("The battle it over. " + "The attacker " + defender.getName() + " has " + defender.getHealthPoints() + " health left.");
        if(attacker.getHealthPoints() < defender.getHealthPoints()){
            System.out.println(defender.getName() + " has won the fight.");
        } else if(attacker.getHealthPoints() > defender.getHealthPoints()){
             System.out.println(attacker.getName() + " has won the fight.");
        }
    }

    public void swapFighters() {
        Fighter temp = attacker;
        attacker = defender;
        defender = temp;

    }

}

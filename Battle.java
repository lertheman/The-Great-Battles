import java.util.Scanner;
/**
 * This is the battle class, and it consists of constructors, methods, and accessors
 * that are meant to simulate a batlle between 2 fighters.
 * @author Tyler Caldwell
 * @version A Level 9/24/2025
 */
public class Battle
{
    private Fighter attacker;
    private Fighter defender;
    private int numRounds; 
    private Scanner scan;
    private boolean battleOver;

    /**
     * This is the battle constructor where the instance variables are initialized.
     */
    public Battle(Fighter initAttacker, Fighter initDefender){
        attacker = initAttacker;
        defender = initDefender;
        numRounds = 0;
        scan = new Scanner(System.in);
        battleOver = false;
    }

    /**
     * This is the getAttacker accesor which returns attacker.
     */

    public Fighter getAttacker() {
        return attacker;
    }

    /**
     * This is the getDefender accesor which returns defender.
     */
    public Fighter getDefender(){
        return defender;
    }

    /**
     * This is the getNumRounds accesor which returns NumRounds.
     */
    public int getNumRounds(){
        return numRounds;
    }

    /**
     * This is the getBattleOver accesor which returns battleOver.
     */
    public boolean getBattleOver() {
        return battleOver;
    }

    /**
     * This is the printRoundUpdate method, which gives a update every round by disclosing the defender and attacker health.
     */
    public void printRoundUpdate(){
        System.out.println("Round " + getNumRounds());
        System.out.println(attacker.getName() + ": " + attacker.getHealthPoints() + " " + defender.getName() + ": " + defender.getHealthPoints());
    }

    /**
     * This is the takeTurn method, which is used to determine what the fighter wants to do each round. It's also used to determine if the game will end
     * based on which fighter has 0 or less health.
     */
    public void takeTurn() {
        System.out.println("Would you like to attack or heal? attack or heal?");
        String choice = scan.nextLine();
        if(choice.equals("attack")){
            int amount = attacker.dealDamage();
            defender.takeDamage(amount);   
            if(defender.getHealthPoints() <= 0){
                battleOver = true;
                System.out.println("The battle has ended!");
            }
        } else if(choice.equals("heal")){
            attacker.heal();

        } else {
            System.out.println("Invalid choice, you lost your turn.");
        }
        numRounds++;
    }

    /**
     * This is the printStartInfo method, which prints the starting info calling the toString from the fighter class.
     * It gives us the starting information for each fighter.
     */
    public void printStartInfo(){
        System.out.println("Welcome to a fight between " + attacker.getName() + " and " + defender.getName());
        System.out.println( attacker.toString() + " " + defender.toString());

    }

    /**
     * This is the printEndInfo method, which prints the info of fighters at the end of the fight.
     * It also discloses who won the fight. 
     */
    public void printEndInfo(){
        System.out.println("The battle is over. " + "The attacker " + attacker.getName() + " has " + attacker.getHealthPoints() + " health left.");  
        System.out.println("The battle is over. " + "The defender " + defender.getName() + " has " + defender.getHealthPoints() + " health left.");
        if(attacker.getHealthPoints() < defender.getHealthPoints()){
            System.out.println(defender.getName() + " has won the fight.");
        } else if(attacker.getHealthPoints() > defender.getHealthPoints()){
            System.out.println(attacker.getName() + " has won the fight.");
        }
    }

    /**
     * This is the swapFighter method which is used to simulate the fighters switching between attacking and defending.
     */
    public void swapFighters() {
        Fighter temp = attacker;
        attacker = defender;
        defender = temp;

    }

}

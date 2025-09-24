import java.util.Random;
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter
{
    private String name;
    private int healthPoints;
    private int attackDamage;
    private Random rng;
    private int healAmount;

    public Fighter() {
        name = "Tyler";
        healthPoints = 100;
        attackDamage = 30;
        rng = new Random();
        healAmount = 15;
    }

    public Fighter(String initName,int initHealthPoints,int initAttackDamage, int initHealAmount){
        name = initName;   
        healthPoints = initHealthPoints;
        attackDamage = initAttackDamage;
        healAmount = initHealAmount;
        rng = new Random();
    }

    public String getName(){
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
    
    public int getHealAmount() {
        return healAmount;
    }

    public int dealDamage() {
        int damage = rng.nextInt(attackDamage) + 1;
        System.out.println(getName() + " deals " + damage + " damage");

        return damage;
    }

    public void takeDamage(int amount) { 
        healthPoints = healthPoints - amount;
        System.out.println(getName() + " was attacked and now has " + getHealthPoints() + " health.");

    }
    
    public void heal() {
        int healed = rng.nextInt(healthPoints) + 1;
        healthPoints = healthPoints + healed;
        System.out.println(getName() + " healed and now has " + getHealthPoints() + " health.");
    }
    
    public String toString() {
        return getName() + " has " + getHealthPoints() + " health and can deal " + getAttackDamage() + " damage, and can heal " + getHealAmount() + ".";
    }

}

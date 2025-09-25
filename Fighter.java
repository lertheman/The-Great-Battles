import java.util.Random;
/**
 * This is the Fighter class, and it consists of constructors, methods, and accessors
 * that are meant to give attributes of a fighter such the health, name, healing, and damage.
 * @author Tyler Caldwell
 * @version A Level 9/24/2025
 */
public class Fighter
{
    private String name;
    private int healthPoints;
    private int attackDamage;
    private Random rng;
    private int healAmount;
    /**
     * This is the fighter constructor without parameters that initializes the instance variables of a fighter.
     */
    public Fighter() {
        name = "Tyler";
        healthPoints = 100;
        attackDamage = 30;
        rng = new Random();
        healAmount = 15;
    }

    /**
     * This is the parameterized constructor that is also used to initialize a fighter, and where attributes (instance variables)
     * of the fighter can be set when creating a new fighter.
     */
    public Fighter(String initName,int initHealthPoints,int initAttackDamage){
        name = initName;   
        healthPoints = initHealthPoints;
        attackDamage = initAttackDamage;
        healAmount = 15;
        rng = new Random();
    }

    /**
     * This is the getName accessor and it returns a fighters name.
     */
    public String getName(){
        return name;
    }

    /**
     * This is the getHealthPoints accessor and it returns a fighters health.
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     * This is the getAttackDamage accessor and it returns a fighters attackDamage.
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    /**
     * This is the getHealAmount accessor and it returns the heal amount of a fighter.
     */
    public int getHealAmount() {
        return healAmount;
    }

    /**
     * This is the dealDamage method which simulates a fighter dealing damage to the other fighter.
     */
    public int dealDamage() {
        int damage = rng.nextInt(attackDamage) + 1;
        System.out.println(getName() + " deals " + damage + " damage");

        return damage;
    }

    /**
     * This is the takeDamage method which simulates a fighter taking damage from the other fighter.
     */
    public void takeDamage(int amount) { 
        healthPoints = healthPoints - amount;
        System.out.println(getName() + " was attacked and now has " + getHealthPoints() + " health.");

    }

    /**
     * This is theheal method which simulates a fighter healing to regain health.
     */
    public void heal() {
        healAmount = rng.nextInt(healAmount) + 1;
        healthPoints = healthPoints + healAmount;
        System.out.println(getName() + " healed and now has " + getHealthPoints() + " health.");
    }

    /**
     * This is the toString method which is used to print a statement that discloses the attritbutes of a fighter.
     */
    public String toString() {
        return getName() + " has " + getHealthPoints() + " health and can deal " + getAttackDamage() + " damage, and can heal " + getHealAmount() + ".";
    }

}

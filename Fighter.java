
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
    public Fighter() {
        name = "Tyler";
        healthPoints = 100;
        attackDamage = 30;
    }

    public Fighter(String initName,int initHealthPoints,int initAttackDamage){
        name = initName;   
        healthPoints = initHealthPoints;
        attackDamage = initAttackDamage;
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

    public int dealDamage() {
        System.out.println(name + " deals " + attackDamage + " damage");
        return attackDamage;
    }

    public void takeDamage(int amount) { 
        healthPoints = healthPoints - amount;
        System.out.println(name + " was attacked and now has " + healthPoints + " health.");

    }

}

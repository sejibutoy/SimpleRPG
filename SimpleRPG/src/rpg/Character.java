package rpg;

public class Character {

    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " attacks with power " + attackPower);
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attackPower);
    }
}
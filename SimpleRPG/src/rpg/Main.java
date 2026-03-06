package rpg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SIMPLE RPG BATTLE ===");
        System.out.println("Choose your character:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        System.out.println("4. Healer");

        int choice = input.nextInt();

        Character player;

        if (choice == 1) {
            player = new Warrior("Warrior");
        } 
        else if (choice == 2) {
            player = new Mage("Mage");
        } 
        else if (choice == 3) {
            player = new Archer("Archer");
        } 
        else {
            player = new Healer("Healer");
        }

        Character enemy = new Warrior("Enemy Warrior");

        System.out.println("\nBattle Start!");

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {

            System.out.println("\nYour Health: " + player.getHealth());
            System.out.println("Enemy Health: " + enemy.getHealth());

            System.out.println("1. Attack");
            if (player instanceof Healer) {
                System.out.println("2. Heal");
            }

            int action = input.nextInt();

            if (action == 1) {

                player.attack();

                int damage = (int)(Math.random() * player.getAttackPower()) + 1;

                enemy.setHealth(enemy.getHealth() - damage);

                System.out.println("You dealt " + damage + " damage!");
            }

            else if (action == 2 && player instanceof Healer) {

                ((Healer) player).heal();

                player.setHealth(player.getHealth() + 15);

                System.out.println("You recovered 15 health!");
            }

            if (enemy.getHealth() > 0) {

                System.out.println("\nEnemy attacks!");

                enemy.attack();

                int enemyDamage = (int)(Math.random() * enemy.getAttackPower()) + 1;

                player.setHealth(player.getHealth() - enemyDamage);

                System.out.println("Enemy dealt " + enemyDamage + " damage!");
            }
        }

        if (player.getHealth() > 0) {
            System.out.println("\nYou Win!");
        } else {
            System.out.println("\nYou Lose!");
        }

        input.close();
    }
}

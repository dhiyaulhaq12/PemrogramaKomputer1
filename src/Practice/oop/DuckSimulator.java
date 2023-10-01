/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.oop;

import java.util.Scanner;

/**
 *
 * @author hp
 */

public class DuckSimulator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih bebek yang ingin Anda lihat:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");

            int choice = scanner.nextInt();

            Duck duck = null;

            if (choice == 1) {
                duck = new MallardDuck();
            } else if (choice == 2) {
                FlyBehavior canFly = () -> System.out.println("I can't fly");
                QuackBehavior squeak = () -> System.out.println("Squeak");
                duck = new RubberDuck(canFly, squeak);
            } else if (choice == 3) {
                duck = new DecoyDuck();
            } else if (choice == 4) {
                duck = new ModelDuck();
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            if (duck != null) {
                duck.display();
                duck.performQuack();
                duck.performFly();
            }
        }
    }
}

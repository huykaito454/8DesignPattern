package TemplateMethod;

import java.util.Scanner;

public class Coffee extends PrepareTemplate {
    private Scanner scanner = new Scanner(System.in);
    private Integer choose = null;
    @Override
    void brew() {
        menuCoffee();
         choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Choose Espresso Coffee");
                    break;
                case 2:
                    System.out.println("Choose Latte Coffee");
                    break;
                case 3:
                    System.out.println("Choose Americano Coffee");
                    break;
            }
    }
    @Override
    void addCondiments() {
        menuCondiments();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Put Sugar in Cup");
                    break;
                case 2:
                    System.out.println("Put Milk in Cup");
                    break;
                case 3:
                    System.out.println(" ");
                    break;

            }
    }
    private void menuCoffee(){
        System.out.println("\n-----------Choose Coffee------------");
        System.out.println("1. Espresso Coffee");
        System.out.println("2. Latte Coffee");
        System.out.println("3. Americano Coffee");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    private void menuCondiments(){
        System.out.println("\n-----------Choose Condiments------------");
        System.out.println("1. Sugar");
        System.out.println("2. Milk");
        System.out.println("3. No Condiments");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

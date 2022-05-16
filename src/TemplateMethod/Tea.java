package TemplateMethod;

import java.util.Scanner;

public class Tea extends PrepareTemplate{
    private Scanner scanner = new Scanner(System.in);
    private Integer choose = null;
    @Override
    void brew() {
        menuTea();
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("Choose Green Tea");
                break;
            case 2:
                System.out.println("Choose Black Tea");
                break;
            case 3:
                System.out.println("Choose Oolong Tea");
                break;
        }
    }
    @Override
    void addCondiments() {
        menuTopping();
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println("Put Sugar in Cup");
                break;
            case 2:
                System.out.println("Put Honey in Cup");
                break;
            case 3:
                System.out.println("Put Ginger in Cup");
                break;
            case 4:
                System.out.println(" ");
                break;

        }
    }
    private void menuTea(){
        System.out.println("\n-----------Choose Tea------------");
        System.out.println("1. Green Tea");
        System.out.println("2. Black Tea");
        System.out.println("3. Oolong Tea");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    private void menuTopping(){
        System.out.println("\n-----------Choose Condiments------------");
        System.out.println("1. Sugar");
        System.out.println("2. Honey");
        System.out.println("3. Ginger");
        System.out.println("4. No Condiments");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}

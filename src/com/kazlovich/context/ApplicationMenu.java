package com.kazlovich.context;

import com.kazlovich.factory.CommandFactory;

import java.util.Scanner;

public class ApplicationMenu {
    private static final ApplicationMenu applicationMenu = new ApplicationMenu();
    private ApplicationMenu() { }

    public void printAvailableOptions(){
        System.out.println("Press 1 to create a product");
        System.out.println("Press 2 to see all products");
        System.out.println("Press 3 to finish the program");
        Scanner scanner = new Scanner(System.in);
        getUserInput(scanner.nextInt());
    }
    public void getUserInput(int choice){
        switch (choice){
            case 1: CommandFactory.defineCommand("CREATE").execute();break;
            case 2: CommandFactory.defineCommand("PRINT_ALL").execute();break;
            case 3:
                System.out.println("bye bye");
                System.exit(1);
            default: throw new IllegalArgumentException("Illegal input data");
        }
        printAvailableOptions();
    }
    public static ApplicationMenu getApplicationMenu(){
        return applicationMenu;
    }
}

package com.kazlovich.command;

import com.kazlovich.entity.ProductType;
import com.kazlovich.entity.UserRequest;
import com.kazlovich.factory.ProductFactory;
import java.util.Scanner;

public class CreateCommand implements Command{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of product(food or nonfood)");
        String strType = scanner.nextLine();
        ProductType type = null;
            if (strType.equalsIgnoreCase("food")){
                type = ProductType.Food;
            } else
            if(strType.equalsIgnoreCase("nonfood")){
                type = ProductType.NonFood;
            } else {
                throw new IllegalArgumentException("Illegal type of food");
            }
        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter price");
        int price  = scanner.nextInt();
            if (price <= 0){
                throw new IllegalArgumentException("Illegal price of food");
            }

        int calories = 0;
        if (type == ProductType.Food){
            System.out.println("Enter calories");
            calories = scanner.nextInt();
            if (calories < 0){
                throw new IllegalArgumentException("Illegal calories of food");
            }
        }
        ProductFactory.createProduct(UserRequest.getBuilder()
                .setType(type)
                .setName(name)
                .setPrice(price)
                .setCalories(calories)
                .complete());
    }
}

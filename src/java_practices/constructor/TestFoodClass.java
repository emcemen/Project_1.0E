package java_practices.constructor;

import java.util.ArrayList;

public class TestFoodClass {
    public static void main(String[] args) {

        Food food1 = new Food("Apple");
        Food food2 = new Food("Banana", 4);
        Food food3 = new Food("Apricot", 15, 2);
        Food food4 = new Food("Asparagus", 2, 4);
        Food food5 = new Food("Artichoke", 5, 10);


        //print all the Food information
        System.out.println("food1 = " + food1);
        System.out.println("food2 = " + food2);
        System.out.println("food3 = " + food3);
        System.out.println("food4 = " + food4);
        System.out.println("food5 = " + food5);

        //Create a separate class to create and test the Food objects try making an arrayList of Food objects
        ArrayList<String>foodNameList =new ArrayList<>();
        foodNameList.add(food1.name);
        foodNameList.add(food2.name);
        foodNameList.add(food3.name);
        foodNameList.add(food4.name);
        foodNameList.add(food5.name);

        //find all the Food objects that start with 'a' and print the whole information
        for(String each :foodNameList){
            if (each.toLowerCase().startsWith("a")){
                System.out.println("Food names that first letters start  with a "+each);
            }
        }

        //find all the Food objects that have a total price over 20$
        double Food1TotalPrice =food1.calculatePrice();
        double Food2TotalPrice =food2.calculatePrice();
        double Food3TotalPrice =food3.calculatePrice();
        double Food4TotalPrice =food4.calculatePrice();
        double Food5TotalPrice =food5.calculatePrice();

        ArrayList<Double>foodTotalPriceList =new ArrayList<>();
        foodTotalPriceList.add(Food1TotalPrice);
        foodTotalPriceList.add(Food2TotalPrice);
        foodTotalPriceList.add(Food3TotalPrice);
        foodTotalPriceList.add(Food4TotalPrice);
        foodTotalPriceList.add(Food5TotalPrice);

        for(Double each :foodTotalPriceList){
            if (each>20){
                System.out.println("Food objects that have a total price over 20$ "+each);

            }
        }



    }


}

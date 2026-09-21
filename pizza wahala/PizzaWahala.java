

import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int noOfPersons = input.nextInt();
        input.nextLine();

        System.out.print("Enter pizza type (Sapa size, Small Money, Big boys, Odogwu): ");
        String pizza = input.nextLine();

        int slices = 0;
        int price = 0;

        if (pizza.equals("Sapa size")) {
            slices = 4;
            price = 2500;
        }
        else if (pizza.equals("Small Money")) {
            slices = 6;
            price = 2900;
        }
        else if (pizza.equals("Big boys")) {
            slices = 8;
            price = 4000;
        }
        else if (pizza.equals("Odogwu")) {
            slices = 12;
            price = 5200;
        }
        else {
            System.out.println("Invalid pizza type.");
            input.close();
            return;
        }

        int boxes = noOfPersons / slices;

        if (noOfPersons % slices != 0) {
            boxes = boxes + 1;
        }

        int totalSlices = boxes * slices;
        int leftoverSlices = totalSlices - noOfPersons;
        int totalPrice = boxes * price;

        System.out.println("Boxes to buy: " + boxes);
        System.out.println("Leftover slices: " + leftoverSlices);
        System.out.println("Total price: ₦" + totalPrice);

        input.close();
    }
}

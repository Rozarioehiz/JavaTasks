package checkOut;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {

    static Scanner input = new Scanner(System.in);

    public static String customersName() {
        System.out.println("Enter your name");
        return input.nextLine();
    }


    public static String productName() {
        System.out.println("Enter name of product");
        String itemName = input.nextLine();
        return itemName;
    }

    public static int numberOfItem() {
        System.out.println("Enter number of pieces");
        int numberOfItems = input.nextInt();
        return numberOfItems;
    }

    public static double perUnit() {
        System.out.println("Enter amount per unit");
        int amountperUnit = input.nextInt();
        return amountperUnit;
    }

    public static String addMoreitems() {
        System.out.println("Do you want add more items?");
        String moreItems = input.nextLine();
        return moreItems;
    }

    public static String cashierName() {
        System.out.println("what is your name");
        String cashiername = input.nextLine();
        return cashiername;
    }

    public static double discount() {
        System.out.println("how much discount");
        double discountedAmount = input.nextDouble();
        return discountedAmount;

    }

    public static void main(String[] args) {

        ArrayList<String> itemName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();

        String userName = customersName();
        String response = "yes";

        while (response.equals("yes")) {
            itemName.add(productName());
            quantity.add(numberOfItem());
            price.add(perUnit());
            input.nextLine();
            response = addMoreitems();
        }
        String cashiersName = cashierName();
        double discount = discount();
        double subTotal = 0.0;
        for (int index = 0; index < quantity.size(); index++) {
            subTotal += quantity.get(index) * price.get(index);
        }
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discount + vat;


        String address = """
                semicolon stores
                main branch
                location:312, herbert macaulay way, sabo yaba, lagos
                tel: 3567890098678
                """;

        System.out.println(address);

        System.out.println("Cashier: " + cashiersName + "\nCustomer Name: " + userName);
        System.out.println("=".repeat(70));
        System.out.printf("%25s%10s%15s%20s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-".repeat(70));
        for (int count = 0; count < itemName.size(); count++) {
            System.out.printf("%25s%10d%15.2f%20.2f%n", itemName.get(count), quantity.get(count), price.get(count), quantity.get(count) * price.get(count));
        }

        System.out.println("-".repeat(70));
        System.out.printf("%50s%20.2f%n", "Sub Total:", subTotal);
        System.out.printf("%50s%20.2f%n", "Discount:", discount);
        System.out.printf("%50s%20.2f%n", "Vat @ 7.5%: ", vat);
        System.out.println("=".repeat(70));
        System.out.printf("%50s%20.2f%n", "Bill total:", billTotal);
        System.out.println("=".repeat(70));
        System.out.printf("%60S%n", "this is not a receipt pay: " + billTotal);
        System.out.println("=".repeat(70));

        System.out.println("How much did the customer give you?");
        double amountPaid = input.nextDouble();
        double balance = amountPaid - billTotal;


        address = """
                semicolon stores
                main branch
                location:312, herbert macaulay way, sabo yaba, lagos
                tel: 3567890098678
                """;

        System.out.println(address);

        System.out.println("Cashier: " + cashiersName + "\nCustomer Name: " + userName);
        System.out.println("=".repeat(70));
        System.out.printf("%25s%10s%15s%20s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-".repeat(70));
        for (int count = 0; count < itemName.size(); count++) {
            System.out.printf("%25s%10d%15.2f%20.2f%n", itemName.get(count), quantity.get(count), price.get(count), quantity.get(count) * price.get(count));
        }

        System.out.println("-".repeat(70));
        System.out.printf("%50s%20.2f%n", "Sub Total:", subTotal);
        System.out.printf("%50s%20.2f%n", "Discount:", discount);
        System.out.printf("%50s%20.2f%n", "Vat @ 7.5%:", vat);
        System.out.println("=".repeat(70));
        System.out.printf("%50s%20.2f%n", "Bill total:", billTotal);
        System.out.printf("%50s%20.2f%n", "Amount paid:", amountPaid);
        System.out.printf("%50s%20.2f%n", "Balance", balance);
        System.out.println("=".repeat(70));
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("=".repeat(70));

    }
}
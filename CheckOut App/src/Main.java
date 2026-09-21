//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}



//
//        package checkOut;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CheckOut {
//
//    static Scanner input = new Scanner(System.in);
//
//    public static String userName() {
//        System.out.println("Enter your name:");
//        return input.nextLine();
//    }
//
//    public static String productName() {
//        System.out.println("Enter item name:");
//        return input.nextLine();
//    }
//
//    public static int numberOfItem() {
//        System.out.println("Enter number of pieces:");
//        int numberOfItems = input.nextInt();
//        input.nextLine();
//        return numberOfItems;
//    }
//
//    public static double perUnit() {
//        System.out.println("Enter amount per unit:");
//        double amountperUnit = input.nextDouble();
//        input.nextLine();
//        return amountperUnit;
//    }
//
//    public static String addMoreitems() {
//        System.out.println("Do you want to add more items? (yes/no):");
//        return input.nextLine();
//    }
//
//    public static String cashierName() {
//        System.out.println("What is your name (Cashier)?");
//        return input.nextLine();
//    }
//
//    public static double discount() {
//        System.out.println("How much discount?");
//        double discountedAmount = input.nextDouble();
//        input.nextLine();
//        return discountedAmount;
//    }
//
//    public  static void main(String[] args) {
//        String response = "";
//        String nameOfProduct = "";
//        String customersName = "";
//        String cashiersName = "";
//        double amountPerUnit = 0;
//        double discounted = 0;
//        int itemSize = 0;
//        double totalAmount = 0;
//        double subTotal = 0;
//
//        ArrayList<String> name = new ArrayList<>();
//        ArrayList<Integer> quantity = new ArrayList<>();
//        ArrayList<Double> price = new ArrayList<>();
//        ArrayList<Double> total = new ArrayList<>();
//
//        customersName = userName();
//
//        while (!response.equalsIgnoreCase("no")) {
//            nameOfProduct = productName();
//            amountPerUnit = perUnit();
//            itemSize = numberOfItem();
//            totalAmount = itemSize * amountPerUnit;
//            subTotal += totalAmount;
//
//            name.add(nameOfProduct);
//            price.add(amountPerUnit);
//            quantity.add(itemSize);
//            total.add(totalAmount);
//
//            response = addMoreitems();
//        }
//
//        cashiersName = cashierName();
//        discounted = discount();

//        double vat = subTotal * 0.075;
//
//        String address = """
//========================================================
//SEMICOLON STORES
//MAIN BRANCH
//LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
//TEL: 3567890098678
//========================================================
//""";
//
//        System.out.println(address);
//
//        System.out.println("Cashier: " + cashiersName + "\nCustomer Name: " + customersName);
//        System.out.println("========================================================");
//        System.out.printf("%-15s%-10s%-10s%-10s%n", "ITEM", "QTY", "PRICE", "TOTAL");
//        System.out.println("========================================================");
//
//        for (int count = 0; count < name.size(); count++) {
//            System.out.printf("%-15s%-10d%-10.2f%-10.2f%n",
//                    name.get(count),
//                    quantity.get(count),
//                    price.get(count),
//                    total.get(count)
//            );
//        }
//
//        System.out.println("========================================================");
//        System.out.printf("Subtotal:     %.2f%n", subTotal);
//        System.out.printf("Discount:     %.2f%n", discounted);
//        System.out.printf("VAT @ 7.5%%:   %.2f%n", vat);
//        System.out.println("========================================================");
//        double billTotal = (subTotal - discounted) + vat;
//        System.out.printf("Bill Total:   %.2f%n", billTotal);
//        System.out.println("========================================================");
//        System.out.printf("THIS IS NOT A RECEIPT. PLEASE PAY: %.2f%n", billTotal);
//        System.out.println("========================================================");
//    }
//}


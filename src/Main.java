import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Goods milk = new Goods("Milk", new Date(), 30.05, 5, "135hr4");
        Goods bread = new Goods("Bread", new Date(), 20, 10, "73hfts");

        System.out.println("\t \t \t Java Lab 2 ");
        System.out.println("\t \t \t Task 1");

        System.out.println("\t \t \t Info about " + milk.getName());
        System.out.println(milk.toString());
        System.out.println();
        System.out.println("\t \t \t Info about " + bread.getName());
        System.out.println(bread.toString());

        System.out.println();
        System.out.print("Input new count for " + milk.getName() + ": ");
        int count = in.nextInt();
        milk.setCount(count);

        System.out.println();
        System.out.print("Input new price for " + milk.getName() + ": ");
        double price = in.nextDouble();
        milk.setPrice(price);

        System.out.println();
        System.out.println("\t \t \t New info about " + milk.getName());
        System.out.println(milk.toString());


        System.out.println();
        System.out.println("\t \t \t Price of products ");
        System.out.println(milk.calculationPriceProduct());

        System.out.println();
        System.out.println("\t \t \t Comparison of the " + milk.getName() + " and the " + milk.getName());
        System.out.println(milk.equals(milk));
        System.out.println("\t \t \t Comparison of the " + milk.getName() + " and the " + bread.getName());
        System.out.println(milk.equals(bread));


    }
}

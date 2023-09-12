import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\t \t \t Java Lab 2 ");
        System.out.println("\t \t \t Task 1");

        Goods milk = new Goods("Milk", new Date(), 30.05, 5, "135hr4");
        Goods bread = new Goods("Bread", new Date(), 20, 10, "73hfts");

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
        System.out.println();
        System.out.println();
        System.out.println();

        //------------------------------Task2----------------------------------------

        System.out.println("\t \t \t Task 2");
        Cone cone = new Cone(4,3);
        Cone cone1 = new Cone(7,8);


        System.out.println(cone.toString());
        System.out.println("Side Surface Area: " + cone.SideSurfaceArea());
        System.out.println("Volume: " + cone.Volume());

        System.out.println();
        System.out.print("Input new height: ");
        double height = in.nextDouble();
        cone.setHeight(height);

        System.out.print("Input new radius: ");
        double radius = in.nextDouble();
        cone.setRadius(radius);
        System.out.println();

        System.out.println(cone.toString());
        System.out.println("Side Surface Area: " + cone.SideSurfaceArea());
        System.out.println("Volume: " + cone.Volume());

        System.out.println("Comparison");
        System.out.println(cone.equals(cone));
        System.out.println(cone.equals(cone1));
        System.out.println();
        System.out.println();
        System.out.println();

        //------------------------------Task3----------------------------------------



    }
}

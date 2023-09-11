import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner;
public class Goods
{
    private String name;
    private Date date;
    private double price;
    private int count;
    private int invoice;

    public double changePrice()
    {
        return price;
    }
    public int changeCount(){return count;}
    public double calculationPriceProduct(){return 2;}
    public String toString() {return name;}
    public boolean equals(Object obj){return true;}
}

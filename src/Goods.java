import java.util.Date;
public class Goods
{
    private String name;
    private Date date;
    private double price;
    private int count;
    private String invoice;

    public Goods(String name, Date date, double price, int count, String invoice)
    {
        this.name = name;
        this.date = date;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }


    public String getName()
    {
        return name;
    }

    public Date getDate()
    {
        return date;
    }

    public double getPrice()
    {
        return price;
    }
    public double setPrice(double newPrice)
    {
        this.price = newPrice;
        return this.price;
    }

    public int getCount()
    {
        return count;
    }
    public int setCount(int newCount)
    {
        this.count = newCount;
        return this.count;
    }

    public String getInvoice()
    {
        return invoice;
    }


    public double calculationPriceProduct()
    {
        return this.price * this.count;
    }
    @Override
    public String toString()
    {
        String s;
        s = getName() + "\t" + getDate() + "\t" + getPrice() + "\t" + getCount() + "\t" + getInvoice();
        return s;
    }
    @Override
    public boolean equals(Object obj)
    {
        if ( obj instanceof Goods )
        {
            Goods obj1 = (Goods) obj;
            if ( name == obj1.getName() && date == obj1.getDate() && price == obj1.getPrice() && count == obj1.getCount() && invoice == obj1.getInvoice())
                return true;
        }
        return false;
    }

}

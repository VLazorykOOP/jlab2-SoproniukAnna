public class Cone
{
    private double height;
    private double radius;

    public Cone(double h, double r)
    {
        this.height=h;
        this.radius=r;
    }

    public double getHeight()
    {
        return this.height;
    }
    public double setHeight(double newHeight)
    {
        if (newHeight > 0)
            this.height = newHeight;
        return this.height;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double setRadius(double newRadius)
    {
        if (newRadius > 0)
            this.radius = newRadius;
        return this.radius;
    }


    public double SideSurfaceArea()
    {
        double PI = Math.PI;
        double l = Math.sqrt(this.radius * this.radius + this.height * this.height);
        return PI * this.radius * l;
    }
    public double Volume()
    {
        double PI = Math.PI;
        return (PI * (this.radius * this.radius) * this.height) / 3;
    }
    @Override
    public String toString()
    {
        String s;
        s = "h = " + getHeight() + "\t\t r = " + getRadius();
        return s;
    }
    @Override
    public boolean equals(Object obj)
    {
        if ( obj instanceof Cone )
        {
            Cone obj1 = (Cone) obj;
            if (height == obj1.getHeight() && radius == obj1.getRadius())
                return true;
        }
        return false;
    }
}

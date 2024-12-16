public class Dog
{
    private String breed;
    private String color;
    private String name;
    private double size;

    public Dog()
    {
        breed = "weiner dog";
        name = "schnitzel";
        color = "red";
        size = 1000;
    }

    public Dog1()
    {
        breed = "golden retreiver";
        name = "charlie";
        color = "golden";
        size = 1000;
    }

    public Dog(String iBreed, String iName, String iColor, double iSize)
    {
        breed = iBreed;
        name = iName;
        color = iColor;
        if (iSize < 0)
        {
            size = 0;
        }
        else
        {
            size = iSize;
        }
    }


    public void getBreed(String iBreed)
    {
       return breed;
    }

    public void getColor(String iColor)
    {
        return color;
    }

    public void double getSize(double iSize)
    {
        return size;
    }

    public void setBreed(String iBreed)
    {
       breed = iBreed;
    }

    public void setColor(String iColor)
    {
       color = iColor;
    }

public void setSize(double iSize)
    {
      size = iSize;
    }
}

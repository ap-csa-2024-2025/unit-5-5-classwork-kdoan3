public class Oven
{
    private int maxTemp;
    private int currentTemp;

    if (maxTemp > 500 || maxTemp < 0)
    {
        maxTemp = 500;
    }
    else
    {
        return maxTemp;
    }

    if (currentTemp > maxTemp)
    {
        currentTemp = maxTemp;
    }
    else if (currentTemp < 0)
    {
        currentTemp = 0;
    }
    else
    {
        return currentTemp;
    }

    public int getMaxTemp()
    {
        return maxTemp;
    }

    public int getCurrentTemp()
    {
        return currentTemp;
    }

    public void turnOff()
    {
        if (currentTemp > 0)
        {
            currentTemp = 0;
        }
    }

    public boolean isOn()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void preheat(int temp)
    {
        currentTemp = temp;
        if (temp > maxTemp)
        {
            currentTemp = maxTemp
        } 
    }

    public String toString()
    {
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
    }

}


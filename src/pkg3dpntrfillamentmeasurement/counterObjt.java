/*
 this will be what i use to handle the items in a array which will return:
number of items
average
max
min

 */
package pkg3dpntrfillamentmeasurement;

import java.util.Arrays;

/**
 *
 * @author Sparx
 */
public class counterObjt
{
    private float avg;
    private Double[] angrycat = new Double[0];
    public Double[] garbage = new Double[0];
    
    public void addItem(double x)
    {
        angrycat = Arrays.copyOf(angrycat, angrycat.length + 1);
        angrycat[angrycat.length -1] = x;
    }
    
    public int getLstLength ()
    {
        return angrycat.length;
    }
    
    public void removeLast()
    {
        angrycat = Arrays.copyOf(angrycat, angrycat.length - 1);
    }
    
    public Double getItem(int x)
    {
        return angrycat[x];
    }
    
    public void removeItem (int x)
    {
        for (int i=x-1;i < angrycat.length; i++)
        {
            angrycat[i] = angrycat[i+1];
        }
        angrycat = Arrays.copyOf(angrycat, angrycat.length -1);
    }
    
    public double getMin()
    {
        int x = 0;
        for (int i = 0; i < angrycat.length; i++)
        {
            if (angrycat[x] > angrycat[i])
            {
                x = i;
            }
        }
        return angrycat[x];
    }
    
    public double getMax()
    {
        int x = 0;
        for (int i = 0; i < angrycat.length; i++)
        {
            if (angrycat[x] < angrycat[i])
            {
                x = i;
            }
        }
        return angrycat[x];
    }
    
    public double getAvg()
    {
        Double x =0.0;
        for (int i = 0;i < angrycat.length; i++)
        {
            x += angrycat[i];
        }
        x = x / angrycat.length;
        
        return x;
    }
    
    public String getOutput()
    {
        String out = new String();
        //first want number of items
        out = "Number of items: " + this.getLstLength() + "\n";
        out += "------------------\n";
        //now add the counted items so far
        for (int i =0; i < angrycat.length; i++)
        {
            out += angrycat[i] + "\n";
        }
        //now finish this
        out += "------------------\n";
        out += "\nMin: " + this.getMin();
        out += "\nMax: " + this.getMax();
        out += "\nAverage: " + this.getAvg();
        
        return out;
    }
}

package Euler;
import java.io.*;
public class prime10001
{
    public static void main() throws IOException
    {
        final long startTime = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int ctr = 0;
        for(long i = 2; i <= 100000000; i++)
        {
            if(prime(i) == true)
        {
            ctr++;
        }
            if(ctr == 10001)
            {
                System.out.println(i);
                break;
            }
        }
        final long duration = System.nanoTime() - startTime;
        long dura = (duration/1000000000);
        System.out.println("Duration for the program to execute is: "+dura+" seconds");
    }
    public static boolean prime(long x)
    {
        int ctr1 = 0;
        boolean var = false;
        for(long i = 1; i < x; i++)
        {
            if(x % i == 0)
            ctr1++;    
        }
        if(ctr1 == 1)
        var = true;
        return var;
    }
}
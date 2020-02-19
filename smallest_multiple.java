package Euler;
import java.io.*;
public class smallest_multiple
{
    public static void main() throws IOException
    {
        final long startTime = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for(long i = 20; i <= 1000000000; i++)
        {
            if(prime(i) == true)
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
        int ctr = 0;
        boolean var = false;
        for(int j = 11; j <= 20; j++)
        {
            if(x % j == 0)
            ctr++;
            else 
            break;
        }
        if (ctr == 10)
        var = true;            
        return var;
    }
}
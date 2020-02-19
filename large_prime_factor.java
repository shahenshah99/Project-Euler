package Euler;
import java.io.*;
public class large_prime_factor
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        double x = 60085147514.3;
        double out;
        for(double i = 60085147514.2 ; i > 1; i--)
        {
            if(i % x == 0)
            {
                out = i; 
                if(prime(out) == true)
                {
                    System.out.println("Answer is: "+(out*10));
                    break;
                }
            }
        }
    }
    public static boolean prime(double t)
    {
        int ctr = 0;
        boolean var = false;
        for(int i = 1; i <= t; i++)
        {
            if(t % i == 0)
            ctr++;
        }
        if(ctr == 2)
        var = true;
        return var;
    }
}
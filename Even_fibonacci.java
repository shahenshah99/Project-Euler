package Euler;
import java.io.*;
public class Even_fibonacci
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int f0 = 0;
        int f1 = 1;
        int t,sum=0;        
        for(int i = 1; i <= 10000; i++)
        {
            while(f1 < 4000000)
            {
                t = f0;
                f0=f1;
                f1= t+f0;
                if(f1 % 2 == 0)
                {
                    sum += f1;
                }
            }
            break;
        }
        System.out.println("Output is: "+sum);
    }
}
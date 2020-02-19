package Euler;
import java.io.*;
public class sum_square
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        long sqr,sum1 = 0,sum0 = 0,sumf = 0,pr,l;
        for(int i = 1; i <= 100; i++)
        {
            sqr = i*i;
            sum1 += sqr;
            sum0 += i;
            sumf = sum0*sum0;
        }        
        pr = sumf-sum1;
        l = Math.abs(pr);
        System.out.println(l);
    }
}
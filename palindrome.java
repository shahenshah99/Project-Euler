package Euler;
import java.io.*;
public class palindrome
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        long ch,a,max = 0;
        for(long i = 100; i < 1000; i++)
        {
            for(long j = i; j < 1000; j++)
            {
                ch = (i*j);
                a = ch;
                long r,sum = 0;
                while(a > 0)
                {
                    r = a % 10;
                    a /= 10;
                    sum = sum * 10 + r;
                }
                if (sum == ch)
                {                 
                    if(ch > max)
                    max = ch;                    
                    break;
                }                         
            }
        }      
        System.out.println(max);
    }
}
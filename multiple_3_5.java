package Euler;
import java.io.*;
public class multiple_3_5
{
    public static void main() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        for(int i = 1; i < 1000; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Output is: "+sum);
    }
}
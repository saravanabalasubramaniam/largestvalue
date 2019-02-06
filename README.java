import java.io.*;
import java.util.*;
class Maximumvalue
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = input.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            a[i] = input.nextInt();
        }
        int max = a[0];
        for(int j = 0; j < size; j++)
        {
            if(max < a[j])
            {
                max = a[j];
            }
        }
        System.out.println(max);
    }
}



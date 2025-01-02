import java.util.*;

public class maxmin
{

    public static void maxmin(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }
        System.out.println("max value :"+max);
        System.out.println("min value :"+min);

    }





    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        maxmin(arr);
    }
}
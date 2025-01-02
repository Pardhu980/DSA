import java.util.*;
public class maxsubarrsum
{
    public static void maxsubarr(int arr[])
    {
        int ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                 int cs=0;
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");
                        cs+=arr[k];
                    }
                    if(cs>ms)
                    {
                        ms=cs;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.print("maximum subarr sum:"+ms);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter size of array:");
        int n= sc.nextInt();


        int arr[]=new int[n];
        System.out.print("enter array elements:");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }

        maxsubarr(arr);
      
    }
}
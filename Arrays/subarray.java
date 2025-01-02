import java.util.*;
public class subarray
{
    public static void subarr(int arr[])
    {
        int ts=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i;j<arr.length;j++)
                {
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");

                    }
                    ts++;
                    System.out.println();
                }
                System.out.println();
            }
            System.out.print("total subarr:"+ts);
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

        subarr(arr);
      
    }
}
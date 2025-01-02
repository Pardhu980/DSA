import java.util.*;
public class revarr
{
    public static int[] rev_arr(int arr[],int n)
    {
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
            
        }
        return arr;
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

        arr=rev_arr(arr,n);
       
        System.out.println("the reversed array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
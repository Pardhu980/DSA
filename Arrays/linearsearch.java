import java.util.*;
public class linearsearch
{
    public static int lins(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
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

        
        System.out.print("enter key element:");
        int key=sc.nextInt();


       int index=lins(arr,key);
       if(index==-1){
       System.out.println("element not found ");
       }
       else{
         System.out.println("element found at:"+index);

       }
    }
}
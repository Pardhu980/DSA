import java.util.*;
public class kadens
{
    public static void maxsubarr(int arr[])
    {
       int ms=Integer.MIN_VALUE;
       int cs=0;
       for(int i=0;i<arr.length;i++)
       {
        cs=cs+arr[i];
        ms=Math.max(cs,ms);

        if(cs<0)
        {
            cs=0;
        }
        
       

       }
               System.out.println("maximum sum:"+ms);
    }

    public static void main(String args[])
    {
        
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
         maxsubarr(arr);




        
       
      
    }
}
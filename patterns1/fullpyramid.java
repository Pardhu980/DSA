import java.util.*;
public class fullpyramid
{
    
    public static void fp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //spaces 

            for(int j=1;j<=n-i;j++)
            {
             System.out.print(" ");

            }

            //stars

                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                    System.out.print(" ");

                }

            System.out.println();

        }
    }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fp(n);

    }
}

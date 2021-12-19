
import java.util.Scanner;
public class NeonNumbers {
    
    public static void main(String[] args)
    {
        //Neon number
        int x=0;
        //Creating Scanner clss for inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=sc.nextInt();
        
        int sq= (int)Math.pow(x,2);
        int sum=0;
        
        while(sq>0)
        {
            int rem=sq%10; //Extracting the digits.
            sum=sum+rem; 
            sq=sq/10;
        }

        if(x==sum)
        {
            System.out.println("It is a Neon Number.");
        }

        else
        {
            System.out.println("It is not a neon Number.");
        }

        

    }
    
}

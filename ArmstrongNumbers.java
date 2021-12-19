
    
import java.util.Scanner;
public class ArmstrongNumbers {
    
    public static void main(String[] args)
    {
        //Armstrong number
        int x=0;
        //Creating Scanner clss for inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        x=sc.nextInt();
        
        int copy= x;
        int count=0;
        int rem=0;
        
        // Counting the number of digits
        while(copy>0)
        {
            rem=copy%10; //Extracting the digits
            count++;
            copy=copy/10; 
        }

        rem=0;
        copy=x;
        int sum=0; 
        //Finding the sum 
        while(copy>0)
        {
            rem=copy%10; //Extracting the digits.
            sum=sum+(int)Math.pow(rem,count);
            copy=copy/10;
        }

        if(x==sum)
        {
            System.out.println("It is an Armstrong Number.");
        }

        else
        {
            System.out.println("It is not an Armstrong Number.");
        }

    }
    
}

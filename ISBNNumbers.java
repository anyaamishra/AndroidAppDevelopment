import java.util.Scanner;
public class ISBNNumbers {
    
    public static void main(String[] args)
    {
        //ISBN number
        int x=0;
        //Creating Scanner clss for inputs
        Scanner sc=new Scanner(System.in);

        int copy= x;
        int count=0;
        int rem=0;
        int s=0;

        do
        {
        System.out.println("Enter a 10 digit number: "); 
        x=sc.nextInt();
        
        copy= x;
        count=0;
        rem=0;
        s=0;
        
        // Counting the number of digits
        while(copy>0)
        {
            rem=copy%10; //Extracting the digits
            s=s*10+rem; //Flipping the number
            count++;
            copy=copy/10; 
        }
        if(count==10)
        {
            break;
        }
        else
        {
            System.out.println("Please enter a 10 digit number only."); 
        }
        }while(true); 

        count=1;
        rem=0;
        int sum=0;

        while(s>0)
        {
            rem=s%10;
            sum=sum+(int)Math.pow(rem,count);
            count++;
            s=s/10;
        }

        if(sum%11==0)
        {
            System.out.print("It is an ISBN number.");
        }

        else
        {
            System.out.println("It is not an ISBN number.");
        }

    }
}


import java.util.*;
public class JavaBasic

 {
    public void Fibonacci() 
    {
        int x1=0;
        int x2=1;
        int x3=0;
        int c=10;
        System.out.println("Fibonacci Series:");
        System.out.println(x1);
        System.out.println(x2);

        for(int i=2; i<c; i++)
        {
            x3=x1+x2;
            System.out.println(x3);
            x1=x2;
            x2=x3;

        }
        
    }

    public void RandomNumber()
    {
        int min=500;
        int max=1000;

        double rand=Math.random()*(max-min+1)+min;

        System.out.println("Random Number between"+min+"and"+max+":");
        System.out.println(rand);


    }

    public void Palindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();

        int copy=x;
        int rev=0;

        while(x>0)
        {
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }

        if(rev==copy)
        {
            System.out.println("The number is palindrome.");

        }
        else
        {
            System.out.println("The number is not palindrome.");
        }

    }

    public static void main(String[] args) 
    {
        JavaBasic ob=new JavaBasic();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Fibonacci, 2 for Random number generation and 3 for Palindrome");
        int c=sc.nextInt();

        switch (c) 
        {
            case 1:
                ob.Fibonacci();
                break;
            
            case 2:
                ob.RandomNumber();
                break;
            
            case 3:
            ob.Palindrome();
                break;
        
            default:
                break;
        }
        
    }
    
}

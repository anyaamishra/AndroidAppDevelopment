import java.util.*;

public class JavaNumber 
{
    public void Swap() 
    {   //Swapping using XOR Gate
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();

        x=x^y;
        y=y^x;
        x=x^y;

        System.out.println("The swapped numbers are: "+x+"and"+y);

    }
    


    public void TechNo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();

        int c=0;

        //Counting the number of digits
        int num=x;

        while(x>0)
        {
            c++;
            x=x/10;
        }

        if(c%2==0)
        {
            int fh=(int)(num/(int)Math.pow(10,c/2));
            int sh=(int)(num%(int)Math.pow(10,c/2));

            int sq=(int)Math.pow((fh+sh),2);

            if(num==sq)
            {
                System.out.println(num+" is a Tech number");
            }

            else
            {
                System.out.println(num+" is not a Tech number");
            }

        }

        else
        {
            System.out.println("Not a Tech Number");
        }

    }

    public void FascinatingNo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int n2=n*2;
        int n3=n*3;

        String num=""+n+n2+n3;

        int c=0;

        //checking the frequency of the digits

        for(char c1='1';c1<='9';c1++)
        {
            c=0;
            for(int i=0; i<num.length();i++)
            {
                char ch=num.charAt(i);
                if(ch==c1)
                {
                    c++;
                }

            }
            if(c>1||c==0)
            {   
                c=0;
                System.out.println("Not a Fascinating number.");
                break;
            }
            
        }

        if(c==1)
        {
            System.out.println("Is a Fascinating number");
        }


    }

    public static void main(String[] args) 
    {
        JavaNumber ob=new JavaNumber();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Swapping, 2 for Tech number and 3 for Fascinating number");
        int c=sc.nextInt();

        switch (c) 
        {
            case 1:
                ob.Swap();
                break;
            
            case 2:
                ob.TechNo();
                break;
            
            case 3:
            ob.FascinatingNo();
                break;
        
            default:
                break;
        }
        
    }
}


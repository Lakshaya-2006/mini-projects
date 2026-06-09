import java.util.Scanner;
public class calculator{
    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact+=fact*i;
        }return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
        System.out.println("welcome to mini calculator");
        System.out.println("1.addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.square root");
        System.out.println("6.square");
        System.out.println("7.sin");
        System.out.println("8.cos");
        System.out.println("9.tan");
        System.out.println("10.log");
        System.out.println("11.power");
        System.out.println("12.factorial");
        System.out.println("13.exit");
        System.out.println("Enter your choice :");
        choice=sc.nextInt();
        

        double a,b,c,result;

        switch(choice){
            case 1:
                System.out.println("Welcome to Addition process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("enter a number");
                b=sc.nextDouble();
                System.out.println("addition of two numbers="+(a+b));
                break;
            case 2:
                 System.out.println("Welcome to subtraction process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("enter a number");
                b=sc.nextDouble();
                System.out.println("subtraction of two numbers="+(a-b));
                break;
            case 3:
                 System.out.println("Welcome to Multiplication process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("enter a number");
                b=sc.nextDouble();
                System.out.println("multiplication of two numbers="+(a*b));
                 break;
            case 4:
                 System.out.println("Welcome to Divison process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("enter a number");
                b=sc.nextDouble();
                if(b!=0)
                System.out.println("divison of two numbers="+(a/b));
                else
                System.out.println("cannot divide by zero");
                 break;
            case 5:
                 System.out.println("Welcome to sqrt process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("square root is="+Math.sqrt(a));
                 break;
            case 6:
                 System.out.println("Welcome to squaring process");
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("square is="+(a*a));
                 break;
            case 7:
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("Sin value is="+Math.sin(Math.toRadians(a)));
                 break;
            case 8:
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("cos value is="+Math.cos(Math.toRadians(a)));
                 break;
            case 9:
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("tan value is="+Math.tan(Math.toRadians(a)));
                 break;
            case 10:
                System.out.println("enter a number");
                a=sc.nextDouble();
                if(a>0)
                System.out.println("log value is="+Math.log10(a));
                else
                System.out.println("invalid value");
                 break;
            case 11:
                System.out.println("enter a number");
                a=sc.nextDouble();
                System.out.println("enter a number");
                b=sc.nextDouble();
                System.out.println("power value is="+Math.pow(a,b));
                 break;
            case 12:
                int n;
                System.out.println("enter a number");
                n=sc.nextInt();
                if(n>=0)
                    System.out.println("factorial value is="+ factorial(n));
                else
                System.out.println("not defined");
                 break;
            case 13:
                System.out.println("closed");
                break;
            default:
                System.out.println("INVALID CHOICE");
            }
        
        }while(choice!=13);
       
    }
}
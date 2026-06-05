import java.util.Scanner;
public class rest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] food={"dosa","idly","pongal"};
        double[] price={40,10,50};

        double subamount=0;
        String billdetails="";
        char choice='y';

        do{
            System.out.println("---------MENU---------");
            for(int i=0;i<food.length;i++){
                System.out.println((i+1) + "." + food[i] + "- RS."+price[i]);
            }
            System.out.println("enter the food item no: ");
            int foodno=sc.nextInt();

            if(foodno<1 || foodno>food.length){
                System.out.println("invalid food item !");
                continue;
            }
             System.out.println("enter the food qunaitity");
             int qyt=sc.nextInt();

             double amount=price[foodno-1]*qyt;
             subamount+=amount;

             billdetails+=food[foodno-1]+" * "+ qyt+" = RS."+amount;

             System.out.println("do you want to add more items (y/n)?");
             choice=sc.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');

        double gst=subamount*0.05;
        double totalamt=subamount+gst;


        System.out.println("---------BILL DETAILS-------");
        System.out.println(billdetails);
        System.out.println("subamount =" +subamount);
        System.out.println("gst =" +gst);
        System.out.println("total amount ="+totalamt);
        System.out.println("thank you!!");
        
            }
}
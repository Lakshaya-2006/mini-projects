import java.io.*;
import java.util.*;
class pass{
    String site,user,pass;
    pass(String s,String u,String p){
        site=s;
        user=u;
        pass=p;
    }
}
public class passwordmanager{
    static ArrayList<pass> data=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){

        while(true){
            System.out.println("1.ADD");
            System.out.println("2.VIEW");
            System.out.println("3.SEARCH");
            System.out.println("4.EXIT");
            System.out.println("enter your choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("enter the website");
                String s=sc.nextLine();

                System.out.println("enter the username");
                String u=sc.nextLine();

                System.out.println("enter the password");
                String p=sc.nextLine();

                data.add(new pass(s,u,p));
                System.out.println("SAVED!!");

            }
            else if(choice==2){
                for(pass x:data){
                    System.out.println(x.site+" "+x.user+" "+x.pass);
                }
            }
            else if(choice==3){
                System.out.println("enter the search website:");
                String s=sc.nextLine();

                for(pass x:data){
                    if(x.site.equalsIgnoreCase(s))
                        System.out.println(x.user+"|"+x.pass);
                }
            }
            else break;

        }
    }
}
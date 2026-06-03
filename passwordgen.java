import java.util.Random;
import java.util.Scanner;

public class passwordgen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght for password :");
        int length=sc.nextInt();
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
                         "abcdefghijklmnopqrstuvwxzy"+"!@#$_?"+"1234567890";
        Random random=new Random();
        StringBuilder pass=new StringBuilder();
        for(int i=0;i<length;i++){
            int index=random.nextInt(chars.length());
            pass.append(chars.charAt(index));
        }
        System.out.println("generated password is " +pass);
    }
}
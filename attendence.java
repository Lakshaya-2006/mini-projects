import java.util.*;

class student{
    String name;
    int roll;
    boolean present;
    student(String n,int r,boolean p){
        name=n;
        roll=r;
        present=p;
    }
}
    public class attendence{
        static ArrayList<student> stu=new ArrayList<>();
        static Scanner sc=new Scanner(System.in);
        public static void main(String args[]){
            while(true){
                System.out.println("1.Add attendence");
                System.out.println("2.mark attendence");
                System.out.println("3.view Attendence");
                System.out.println("4.exit");
                System.out.println("------------------");
                System.out.println("enter your choice");
                int choice=sc.nextInt();
                sc.nextLine();
                if(choice==1){
                    System.out.print("Name: ");
                String name=sc.nextLine();

                System.out.print("Roll No: ");
                int roll=sc.nextInt();

                stu.add(new student(name,roll,false));

                System.out.println("Student Added");
                }
                else if(choice==2){
                     for(student s:stu){

                    System.out.print(s.name+" Present? (true/false): ");
                    s.present=sc.nextBoolean();

                }
                }
                else if(choice==3){

                for(student s:stu){

                    System.out.println(s.roll+" "+s.name+" : "+(s.present?"Present":"Absent") );
                }
            }
            else{
                break;
            }



            }

        }
    }

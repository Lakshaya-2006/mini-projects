import java.util.ArrayList;
import java.util.Scanner;

class patient{
    int pid;
    String name;
    int age;
    String disease;
    patient(int pid,String name,int  age,String disease){
        this.pid=pid;
        this.name=name;
        this.age=age;
        this.disease=disease;
    }
    void display(){
        System.out.println("patient id: "+pid);
        System.out.println("patient name: "+name);
        System.out.println("patient age: "+age);
        System.out.println("patient disease: "+disease);
    }
}
public class hospitalmanagement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<patient> patients=new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.println("enter your choice: ");
            choice=sc.nextInt();

            switch(choice){
              case 1:
               System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    patients.add(new patient(pid,name,age,disease));
                    System.out.println("added successfully");
                    break;
                     case 2:
                        if (patients.isEmpty()) {
                        System.out.println("No Patients Found!");
                    } else {
                        for (patient p : patients) {
                            p.display();
                        }
                    }
                    break;
                    case 3:
                        System.out.print("Enter Patient ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;
                    for(patient p:patients){
                        if(p.pid==searchId){
                            p.display();
                            found=true;
                            break;
                        }else{
                            System.out.println("not found!");
                        }
                    }break;
                    case 4:
                         System.out.print("Enter Patient ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;
                     for (int i = 0; i < patients.size(); i++) {
                        if (patients.get(i).pid == deleteId) {
                            patients.remove(i);
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Patient Deleted Successfully!");
                    } else {
                        System.out.println("Patient Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        }while(choice!=5);

    }
}
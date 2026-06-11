import java.util.Scanner;
 public class quiz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String user="admin";
        String pass="2901";
        
        System.out.println("QUIZ LOGIN");
        System.out.println("enter your user name: ");
        String username=sc.nextLine();
        System.out.println("enter your pass word: ");
        String password=sc.nextLine();

        if(!user.equals(username)||!pass.equals(password)){
            System.out.println("Ivalid username or password");
        }
        System.out.println("QUIZ STARTS");
        int score=0;
        String[] questions = {
                "1. Which language is used for Android Development?",
                "2. What does JVM stand for?",
                "3. Which company developed Java?",
                "4. Which keyword is used to inherit a class?",
                "5. Which collection stores unique values?"
        };

        String[][] options = {
                {"A. Java", "B. Python", "C. C++", "D. HTML"},
                {"A. Java Virtual Machine", "B. Java Variable Method", "C. Joint Virtual Machine", "D. None"},
                {"A. Microsoft", "B. Sun Microsystems", "C. Google", "D. Apple"},
                {"A. implement", "B. extends", "C. inherit", "D. super"},
                {"A. ArrayList", "B. LinkedList", "C. HashSet", "D. Vector"}
        };
        char[] answers={'A','A','B','B','C'};

        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
            System.out.println(option);}
            System.out.println("your answer:");
            char ans=Character.toUpperCase(sc.next().charAt(0));
            if(ans==answers[i]){
                score++;
            }
            System.out.println();
        }

        System.out.println("--------RESULT---------");
        System.out.println("total question: "+ questions.length);
        System.out.println("correct answers: "+score);
        System.out.println("wrong answers: "+(questions.length - score));

        Double percentage=(score*100.0)/questions.length;
        System.out.println("percentage: "+percentage+"%");

        if(percentage>90){
              System.out.println("grade A");
        }else if(percentage<90 && percentage>=80){
              System.out.println("grade B");
        }else if(percentage<80 && percentage>=70){
              System.out.println("grade C");
        }else if(percentage<70 && percentage>=60){
              System.out.println("grade D");
        }else{
            System.out.println("FAIL");
        }
        





    }
 }
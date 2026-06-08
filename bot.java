import java.util.Scanner;
import java.util.Random;

public class bot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        String[] crushAdvice = {
                "Be yourself and stay confident.",
                "Start with friendship before expressing your feelings.",
                "Respect their boundaries and take things slowly."
        };
        String[] relationshipAdvice = {
                "Good communication solves many problems.",
                "Listen carefully before reacting.",
                "Trust and honesty are the foundation of a relationship."
        };

        String[] breakupAdvice = {
                "Give yourself time to heal.",
                "Focus on your goals and personal growth.",
                "Spend time with supportive friends and family."
        };

        String[] friendZoneAdvice = {
                "Respect their feelings and decision.",
                "Friendship is valuable too.",
                "Don't force a relationship that isn't mutual."
        };
        int choice;

        do {
            System.out.println("\n===== LOVE ADVICE BOT =====");
            System.out.println("1. Crush Problems");
            System.out.println("2. Relationship Problems");
            System.out.println("3. Breakup Problems");
            System.out.println("4. Friend Zone Problems");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");


            choice =sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("\nAdvice:");
                    System.out.println(
                            crushAdvice[random.nextInt(crushAdvice.length)]
                    );
                    break;

                case 2:
                    System.out.println("\nAdvice:");
                    System.out.println(
                            relationshipAdvice[random.nextInt(relationshipAdvice.length)]
                    );
                    break;

                case 3:
                    System.out.println("\nAdvice:");
                    System.out.println(
                            breakupAdvice[random.nextInt(breakupAdvice.length)]
                    );
                    break;

                case 4:
                    System.out.println("\nAdvice:");
                    System.out.println(
                            friendZoneAdvice[random.nextInt(friendZoneAdvice.length)]
                    );
                    break;
                     case 5:
                    System.out.println("Thank you for using Love Advice Bot!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Zuko zuko = new Zuko("Zuko", "18 years old!", "Son of Fire Lord Ozai. His birthday is on July 1st, 2006. Now, she is 18 yearas old.");
    System.out.println("Choose one from the menu below:");
    System.out.println("1. Greeting Zuko");
    System.out.println("2. Say Happy Birthday to Zuko");
    System.out.println("3. Zuko Short Biography");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
    

    boolean loop = true;
    while (loop) {
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
   
        switch (choice) {
            case 1:
                System.out.println("Hello " + zuko.getName() + ", nice to meet you!");
                break;
            case 2:
                System.out.println("Happy Birthday " + zuko.getName() + " on your " + zuko.getBirthday());
                break;
            case 3:
                System.out.println(zuko.getName() + " is " + zuko.getBiography());
                break;
            case 4:
                System.out.println("thank u");
                loop = false;
        default:
            System.out.println("Invalid choice. Please enter a valid option from 1 to 3.");
            break;
        }
    }
    scanner.close();
}
}
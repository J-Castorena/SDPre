import java.util.Scanner;

public class Objective9Lab3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;
        boolean keepRunning = true;

        while(keepRunning) {
                printMenu();
                selection = scanner.nextInt();
                switch (selection) {
                case 1:
                        System.out.println("Hello Human");
                        break;
                case 2:
                        System.out.println("Apples, Bananas. Coconuts");
                        break;
                case 3:
                        System.out.println("Goodbye");
                        keepRunning = false;
                        break;

                }
        }
        scanner.close();
}

public static void printMenu() {
        System.out.println("______Menu______");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit");
        System.out.println();
}
}

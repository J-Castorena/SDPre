public class SwitchExample {
public static void main(String[] args) {
        char grade;
        grade = 'A';

        switch (grade) {
        case 'A':
                System.out.println("Fantastic job!");

        case 'B':
                System.out.println("Good job!");

        case 'C':
                System.out.println("You're doing okay.");
                break;
        case 'D':
                System.out.println("Please Schedule a conference.");
                break;
        case 'F':
                System.out.println("Strat finish homework and showing up class.");
                break;
        default:
                System.out.println("invalid grade.");

        }
}
}

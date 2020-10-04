import java.util.Scanner;

public class MagicEightBall {
    public static void main (String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int ans = (int) (Math.random()*20) + 1;

        //Get question
        System.out.println("Ask a question that can be answered with a yes or no: ");
        sc.nextLine();
        
        if (ans == 1) {
            System.out.println("YES");
        } else if (ans == 2) {        
            System.out.println("Nopers");
        } else if (ans == 3) {
            System.out.println("Better not knowing");
        } else if (ans == 4) {
            System.out.println("Can't give you an answer right now");
        } else if (ans == 5) {
            System.out.println("Concentrate and ask again.");
        } else if (ans == 6) {
            System.out.println("Don't be so hopeful");
        } else if (ans == 7) {
            System.out.println("...");
        } else if (ans == 8) {
            System.out.println("Obviously");
        } else if (ans == 9) {
            System.out.println("Think what you want");
        } else if (ans == 10) {
            System.out.println("No, yes, no");
        } else if (ans == 11) {
            System.out.println("In my opinion, no");
        } else if (ans == 12) {
            System.out.println("Ask again later");
        } else if (ans == 13) {
            System.out.println("I really don't know");
        } else if (ans == 14) {
            System.out.println("Signs say no");
        } else if (ans == 15) {
            System.out.println("Signs prove yes");
        } else if (ans == 16) {
            System.out.println("Unsure");
        } else if (ans == 17) {
            System.out.println("NO.");
        } else if (ans == 18) {
            System.out.println("With no cap");
        } else if (ans == 19) {
            System.out.println("Of course!");
        } else if (ans == 20) {
            System.out.println("Probable");
        }
    }
}

import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        //Variable Declarations
        Scanner sc = new Scanner(System.in);
        String answer   = "";

        //Get input and evaluate
        System.out.print("What is the password? ");
        answer = sc.nextLine();
        if ("i love you".equals(answer)) {
            System.out.println("Correct! My secret is: I love you too.");
        } else {
            System.out.println("Incorrect Password! I guess you'll never hear my secret...");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Type either && or ||");
            String input = scanner.nextLine();
            if(input.equals("&&")){
                System.out.println("Truth table for && operator");
                System.out.println("true && true = true");
                System.out.println("true && false = false");
                System.out.println("false && false = false");
                System.out.println("false && true = false");
            } else if(input.equals("||")){
                System.out.println("Truth table for || operator");
                System.out.println("true || true = true");
                System.out.println("true || false = true");
                System.out.println("false || false = false");
                System.out.println("false || true = true");
            } else {
                System.out.println("please provide either a && or || to see the correct input");
            }
        } catch(Exception e){
            System.out.println("Something when wrong");
        }
    }
}

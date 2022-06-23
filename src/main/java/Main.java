import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Type either && or ||");
            String input = scanner.nextLine();
            boolean trueVar = true; 
            boolean falseVar = false; 
            if(input.equals("&&")){
                System.out.println("Truth table for && operator");
                System.out.println("true && true = " + (trueVar && trueVar));
                System.out.println("true && false = " + (trueVar && falseVar));
                System.out.println("false && false = " + (falseVar && falseVar));
                System.out.println("false && true = " + (falseVar && trueVar));
            } else if(input.equals("||")){
                System.out.println("Truth table for || operator");
                System.out.println("true || true = " + (trueVar || trueVar));
                System.out.println("true || false = " + (trueVar || falseVar));
                System.out.println("false || false = " + (falseVar || falseVar));
                System.out.println("false || true = " + (falseVar || trueVar));
            } else {
                System.out.println("please provide either a && or || to see the correct input");
            }
        } catch(Exception e){
            System.out.println("Something when wrong");
        }
    }
}

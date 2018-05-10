import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(!str.equals("break")){
            System.out.println("What yot want to check?");
            str = scanner.next();
         if(str.equals("number")){
             System.out.println("Pls input number");
             str = scanner.next();
            if(str.matches("[0-9]*")){
                System.out.println("Correct input");
            }
            else{
                System.out.println("Incorect input");
            }
         }
         else if(str.equals("string")){
             System.out.println("Pls input string using English alphabet");
             str = scanner.next();
             if(str.matches("[a-zA-Z]*")){
                 System.out.println("Correct input");
             }
             else{
                 System.out.println("Incorect input");
             }
         }
         else if(str.equals("data")){
             System.out.println("Pls input data DD.MM.YYYY");
             str = scanner.next();
             if(str.matches("^(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.]\\d\\d\\d\\d$")){
                 System.out.println("Correct input");
             }
             else{
                 System.out.println("Incorect input");
             }
         }
        }

    }
}

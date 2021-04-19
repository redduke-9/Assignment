import java.util.Scanner;

public class Main extends UserMainCode {
    


public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(
        		"A valid password should satisfy the following rules.\n"+
        		"1. It should be minimum of 8 characters in length.\n"+
        		"2. It should have at least one lower case letter,one upper case letter,"+
        		"one digit and one special character\n"+
                "Input a password: ");
        String st = sc.nextLine();

        if (CheckPassword(st)) {
            System.out.println("Password is valid: " + st);
        } else {
            System.out.println("Not a valid password: " + st);
        }

    }

}

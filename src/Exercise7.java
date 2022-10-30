import java.util.Scanner;

public class Exercise7 {
    public static void main(String [] args) {
        char letters[] ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        int dni;

        System.out.println("Write your DNI without letter");
        dni = inputValue.nextInt();

        char letter = letters[dni % 23];

        System.out.println("Su letra es : " +letter);




    }
}

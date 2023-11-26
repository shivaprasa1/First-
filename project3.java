import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*10);
        int usernumber = 0;


        do {
            System.out.println("Guess the Number :  ");
            usernumber = sc.nextInt();

            if (usernumber==mynumber){
                System.out.println("Hooooooo fuck you man, you Guess correct Number    ");
                break;
            }
            else if (usernumber>mynumber) {
                System.out.println("Your number is too larg");
            }
            else {
                System.out.println("Too small");
            }

        }
        while (usernumber>=0);

        System.out.print("My number was:  ");
        System.out.println(mynumber);

        }

    }


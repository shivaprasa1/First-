import java.util.Scanner;

public class project {

    public static void main(String[] args){

        /* If you guess the correct name , then i well guess your gender */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the national Animal name : ");
        String Animal = sc.next();

        switch (Animal) {
            case "tiger" :
                System.out.println("You are a girl");
                System.out.println("If you are not a girl , then you must be 9 ");
                break;


            case "lion" :
                System.out.println("Fuck You Boy");
                break;




            default : System.out.println("you are a Boy");
        }


    }

}

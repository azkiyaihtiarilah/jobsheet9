import java.util.Scanner;

/**
 * arrayValue08
 */
public class arrayValue08 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score "+ i + ": ");
            finalScore[i] = sc08.nextInt();
        }
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i]>70){
                System.out.println("Student "+ i + " Passed!");
            } else{
                System.out.println("Student "+ i + " Remidial!");
            }
        }
    }
}
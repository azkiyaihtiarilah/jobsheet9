import java.util.Scanner;

/**
 * Array1Assigment08
 */
public class Array1Assigment08 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Enter how many score you want: " );
        int array = sc08.nextInt();

        int [] sum = new int[array];
        
        for (int i = 0; i < sum.length; i++){
            System.out.print("Enter element to-"+ (i+1) + " : ");
            sum [i] = sc08.nextInt();
        }

        if (array == 0){
            System.out.println("Array Index empty, can't calculate!");
        } else{
        int thehighestScore = sum[0];
        int thelowestScore = sum[0];
        int averageScore = sum[0];

        for(int i = 1; i < array; i++){
            if (sum[i] > thehighestScore){
                thehighestScore = sum[i];
            }
            if (sum[i] < thelowestScore){
                thelowestScore = sum[i];
            } 
            averageScore+= sum[i];
        }
        double average = averageScore / array;

        System.out.println("Higest Score :"+ thehighestScore);
        System.out.println("Lowest Score :"+ thelowestScore);
        System.out.println("Average:"+ average);
        }
    }
}
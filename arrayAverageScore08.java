import java.util.Scanner;

/**
 * arrayAverageScore08
 */
public class arrayAverageScore08 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Input the number of student: ");
        int sumStudent = sc08.nextInt();
        int [] score = new int[sumStudent];

        double totalRemed = 0, totalPassed = 0;
        double averageRemed, averagePassed;
        double sumPassed = 0, sumRemed = 0;

        for (int i = 0; i < score.length; i++){
            System.out.print("Enter student score "+ (i + 1) + ": ");
            score[i] = sc08.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i]>70){
                // System.out.println("Student "+ i + " Passed!");
                totalPassed += score[i];
                sumPassed++;
            } else{
                totalRemed += score[i];
                sumRemed++;
            }
        }
        
        averagePassed = (totalPassed > 0) ? totalPassed / sumPassed : 0;
        System.out.println("The class average Passed score is "+ averagePassed);

        averageRemed = (totalRemed > 0) ? totalRemed / sumRemed : 0;
        System.out.println("The class average Remedial score is "+ averageRemed);

    }
}
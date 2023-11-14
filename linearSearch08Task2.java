import java.util.Scanner;

/**
 * linearSearch08Task2
 */
public class linearSearch08Task2 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int result = 0;

        System.out.print("Enter the number of array elements: " );
        int number = sc08.nextInt();
        int [] sum = new int[number];
        
        for (int i = 0; i < sum.length; i++){
            System.out.print("Enter element to "+ i + " : ");
            sum [i] = sc08.nextInt();
        }

        System.out.print("Enter the key you want search: ");
        int key = sc08.nextInt();

        for (int i = 0; i < sum.length; i++){
            if (sum[i] == key) {
                result = i;
                break;
            }
        }
        if (result != 0){
            System.out.println("The key is in the index position to- "+ result);
            if (result == 0){
            System.out.println("The key is in the index position to- "+ result);
            }
        }else{
            System.out.println("key not found in the array");
        }
    }
}
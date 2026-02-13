import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();        
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {  
                arr[i] = sc.nextInt();
            }

            int index = sc.nextInt();      
            int divisor = sc.nextInt(); 

            int result = arr[index] / divisor;
            System.out.print(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Invalid Index");
        } catch (ArithmeticException e) {
            System.out.print("Divide by zero error");
        }
    }
}
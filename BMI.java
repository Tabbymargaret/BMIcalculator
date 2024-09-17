import java.util.Scanner;

public class BMI {
    public static void main(String args[])
    {
        double weight, height, BMI;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight(in kgs): ");
        weight = sc.nextFloat();
        System.out.println("Enter your height(in metres): ");
        height = sc.nextFloat();
        // System.out.println("Enter your age: ");
        // age = sc.nextInt();

        BMI = weight/ Math.pow(height, 2);
        System.out.printf("Your BMI is: %.2f", BMI);

    }    
}

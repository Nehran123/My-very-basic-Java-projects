import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator App");
        Scanner scan1= new Scanner(System.in);


        System.out.print("Enter first number: ");
        Double num1=scan1.nextDouble();

        System.out.print("Enter second number: ");
        Double num2=scan1.nextDouble();

        //System.out.println("First number: " + num1);
        //System.out.print("Second number: " + num2);

        Double sum=num1+num2;

        System.out.printf("Sum: %.2f\n",sum);
        Double Difference= num1-num2;
        System.out.printf("Difference: %.2f\n", Difference);
        Double product= num1*num2;
        System.out.printf("Product: %.2f\n", product);
        Double Quotient=num1/num2;
        System.out.printf("Quotient: %.2f\n" , Quotient);

    }
}
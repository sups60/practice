import java.util.Scanner;

public class Main extends ComplexCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first real and imaginary number accordingly");
        double firstRealNumber = scanner.nextDouble();
        double firstImaginaryNumber = scanner.nextDouble();

        System.out.println("Now enter the second real and imaginary number");
        double secondRealNumber = scanner.nextDouble();
        double secondImaginaryNumber = scanner.nextDouble();

        ComplexNumber firstCN = new ComplexNumber(firstRealNumber,firstImaginaryNumber);
        ComplexNumber secondCN = new ComplexNumber(secondRealNumber,secondImaginaryNumber);


        addComplexNumber(firstCN,secondCN);
        subComplexNumber(firstCN,secondCN);
        mulComplexNumber(firstCN,secondCN);
        divComlexNumber(firstCN,secondCN);

    }
}

package _01_Java_Basics.PrintingPatterns;

public class PrintingPattern_1 {
    public static void printNumberTriangle(int numberOfRows) {
        if (numberOfRows <= 0) {
            System.out.println("Numarul de randuri trebuie sa fie pozitiv");
            return;
        }

        int currentNumber = 1;

        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberTriangle(-13);
        printNumberTriangle(6);
        printNumberTriangle(12);
    }
}

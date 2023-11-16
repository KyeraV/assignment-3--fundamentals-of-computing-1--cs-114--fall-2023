import java.util.Scanner;
/* Goal: Asks the user for a positive number that indicates the matrix's size.
Prints a matrix made up of zeros. Inserts values from 1–(input × input) into the matrix.
Prints the matrix containing the recently added values. Flips the contents of the matrix
on one side of the diagonal created by moving the other side from top right to bottom left,
emphasizing the elements on the diagonal while leaving the other elements untouched.
The flipped matrix is printed. */
public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the matrix: ");
    int matrixSize = scanner.nextInt();

    Matrix matrix = new Matrix(matrixSize);

    System.out.println("Printing matrix (default values): "); // Default values are 0s //
    matrix.printMatrix();

    matrix.populateMatrix();
    System.out.println("Matrix populated with values 1 to " + matrixSize * matrixSize + ":");
    matrix.printMatrix();

    matrix.flipMatrix();
    System.out.println("Flipped matrix: ");
    matrix.printMatrix();

    scanner.close();
  }
}

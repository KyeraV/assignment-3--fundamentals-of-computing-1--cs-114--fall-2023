/* Goal: The single field matrix of the primitive type needed to create a matrix should be present
in your matrix class. The size argument should be accepted by the matrix constructor, which will
then produce a matrix field with width and height equal to the integer supplied to it. The dimensions
of the matrix should also be reported to the user by the constructor. Create a private method called
swap within the Matrix class. This method will take four arguments: x1, y1, x2, and y2, which stand
for the indices of the two matrix elements that need to be switched. Create the printMatrix public
method, which takes in no arguments and outputs nothing. The matrix should print with the diagonal
from top right to bottom left highlighted in yellow. Create the populateMatrix public method, which
takes no parameters and returns nothing. All it needs to do is add values from 1 to (size × size) to
the matrix. Next, create the flipMatrix public method, which takes no parameters and returns nothing.
The values of the matrix should be "flipped" from top right to bottom left along the diagonal.
The diagonal's constituent parts ought to be highlighted rather than switched. */
public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {
    matrix = new int[size][size];
    System.out.println("Matrix dimensions: " + size + " x " + size);
  }

  private void swap(int x1, int y1, int x2, int y2) { // Swaps the two elements in the matrix //
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void printMatrix() { // Highlight diagonal (top right, bottom left) elements in yellow //
    int maxDigits = String.valueOf(matrix.length * matrix.length).length();

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if (row + col == matrix.length - 1) {
          String formattedvalue = String.format("%" + (maxDigits + 1) + "s", matrix[row][col]);
          System.out.print("\033[43m" + formattedvalue + "\033[0m ");
        } else {
          String formattedvalue = String.format("%" + (maxDigits + 1) + "s", matrix[row][col]);
          System.out.print(formattedvalue + " ");
        }
      }
      System.out.println();
    }
  }

}

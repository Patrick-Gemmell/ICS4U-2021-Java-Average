/*
* This program takes a list of student marks and
* calculates the class average for the user.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-01
*/

import java.util.Random;  // Import the Random class

public final class Average {
    private Average() {

  }
  /**
  * the number four.
  */
  public static final int FOUR = 4;
  /**
  * the number six.
  */
  public static final int SIX = 6;
  /**
  * the number Ninety nine.
  */
  public static final int NINETYNINE = 99;
  /**
   * This function calculates the average from an array of student marks.
   * @return
   * returns classMarks
   * @param classMarks
   */
  static int findClassAverage(final int[][] classMarks) {
    // Looping through the array to find the sum of all the marks
    int totalMark = 0;
    for (int studentCounter = 0; studentCounter < classMarks.length;
         studentCounter++) {
      for (int markCounter = 0; markCounter < classMarks[studentCounter].length;
           markCounter++) {
        totalMark += classMarks[studentCounter][markCounter];
      }
    }

    // Dividing the sum of the marks by the array length
    int average = totalMark / (classMarks.length * classMarks[0].length);

    // Returning the minimum number
    return average;
  }

  /**
   * This function will allow find the marks of four students
   * in a class and show the user the class average.
   * @param args
   */
  public static void main(final String[] args) {
    // Initializing the random class
    Random randNumber = new Random();

    // Initializing the array of student marks
    int[][] studentMarks = new int[FOUR][SIX];

    // Generating the student marks and adding them to the array
    for (int firstCounter = 0; firstCounter < FOUR; firstCounter++) {
      System.out.println("Student " + (firstCounter + 1) + ":");
      for (int secondCounter = 0; secondCounter < SIX; secondCounter++) {
        studentMarks[firstCounter][secondCounter] =
        randNumber.nextInt(NINETYNINE) + 1;
        System.out.print(studentMarks[firstCounter][secondCounter]);
        System.out.print(", ");
      }
      System.out.println();
      System.out.println();
    }

    // Process
    int classAverage = findClassAverage(studentMarks);

    // Output
    System.out.println("Class Average: " + classAverage + "%");
  }
}

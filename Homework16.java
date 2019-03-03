public class Homework16 {

	/* This problem should calculate and return the value
	 * of a times b recursively. You cannot use the *
	 * symbol in your solution. Remember that
	 * multiplication is repeated addition
	 */
	public static int problem1(int a, int b) {

	}

	/* This problem should calculate and return the value
	 * of a to the b power recursively. You cannot use
	 * Math.pow or the * symbol in your solution. You
	 * should use problem1. Remember that
	 * exponentiation is repeated multiplication
	 */
	public static int problem2(int a, int b) {

	}

	/* Recursively find the minimum value in the given
	 * array.
	 * Hint - Compare the minimum value in the first half
	 * of the array with the minimum value in the second
	 * half of the array. You will either need to create
	 * a second method that takes in the array and start
	 * and end indexes
	 */
	public static int problem3(int[] arr) {

	}

	/* Recursively find the sum of the digits of
	 * the given number.
	 * Hint - The least significant digit is num % 10
	 * and the remaining numbers are num / 10
	 */
	public static int problem4(int num) {

	}

	/* We have bunnies standing in a line,
	 * numbered 1, 2, ... The odd bunnies (1, 3, ..)
	 * have the normal 2 ears. The even bunnies (2, 4, ..)
	 * we'll say have 3 ears, because they each have a
	 * raised foot. Recursively return the number of "ears"
	 * in the bunny line 1, 2, ... n
	 * (recursively, without loops or multiplication).
	 *
	 * problem5(0) → 0
	 * problem5(1) → 2
	 * problem5(2) → 5
	 */
	 public static int problem5(int bunnies) {

	 }

	 public static void main(String[] args) {
		 boolean passed = true;

		 if (problem1(6, 4) != 24) {
			 System.out.println("Fail 1");
			 passed = false;
		 }

		 if (problem2(5, 3) != 125) {
			 System.out.println("Fail 2");
			 passed = false;
		 }

		 int[] arr = {4, 5, 2, 6, 3, 6, 7, 8};
		 if (problem3(arr) != 2) {
			 System.out.println("Fail 3");
			 passed = false;
		 }

		 if (problem4(275) != 14) {
			 System.out.println("Fail 4");
			 passed = false;
		 }

		 if (problem5(10) != 25) {
			 System.out.println("Fail 5");
			 passed = false;
		 }

		 if (passed) {
			 System.out.println("All Pass");
		 } else {
			 System.out.println("Fail");
		 }

	 }

}

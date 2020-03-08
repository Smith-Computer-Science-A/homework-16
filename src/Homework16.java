import java.util.ArrayList;

public class Homework16 {

	/* This problem should create and return an ArrayList
	 * that can hold Strings
	 */
	public static ArrayList<String> problem1() {

	}

	/* This problem should add s to the beginning of l
	 */
	public static void problem2(ArrayList<String> l, String s) {

	}

	/* This problem should create and return an exact copy of l.
	 */
	public static ArrayList<String> problem3(ArrayList<String> l) {

	}

	/* This problem should remove all of the elements from l. You can only
	 * use the remove method for the ArrayList class to receive credit.
	 */
	public static void problem4(ArrayList<String> l) {

	}

	/* This problem should add all of the elements from l2 to l1. Note that
	 * l2 holds Integers but l1 holds Strings; account for that
	 */
	 public static void problem5(ArrayList<String> l1, ArrayList<Integer> l2) {

	 }

	 public static void main(String[] args) {
		 boolean passed = true;

		 ArrayList<String> l = problem1();
		 System.out.println("Pass 1");

		 problem2(l, "a");
		 problem2(l, "b");
		 problem2(l, "c");
		 if (!l.get(0).equals("c")) {
			 System.out.println("Fail 2.1");
			 passed = false;
		 } else if (!l.get(2).equals("a")) {
			 System.out.println("Fail 2.2");
			 passed = false;
		 } else {
			 System.out.println("Pass 2");
		 }

		 ArrayList<String> m = problem3(l);
		 if (!l.get(1).equals(m.get(1))) {
			 System.out.println("Fail 3.1");
			 passed = false;
		 } else if (l == m) {
			 System.out.println("Fail 3.2");
			 passed = false;
		 } else {
			 System.out.println("Pass 3");
		 }

		 problem4(l);
		 if (l.size() != 0) {
			 System.out.println("Fail 4");
			 passed = false;
		 } else {
			 System.out.println("Pass 4");
		 }

		 ArrayList<Integer> n = new ArrayList<Integer>();
		 for (int i = 0; i < 6; i++) {
			 n.add(i);
		 }
		 problem5(m, n);
		 if (!m.get(3).equals("0")) {
			 System.out.println("Fail 5.1");
			 passed = false;
		 } else if (!m.get(8).equals("5")) {
			 System.out.println("Fail 5.2");
			 passed = false;
		 } else {
			 System.out.println("Pass 5");
		 }

		 if (passed) {
			 System.out.println("All Pass");
		 } else {
			 System.out.println("Fail");
		 }

	 }

}

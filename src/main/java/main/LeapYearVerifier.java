package main;

public class LeapYearVerifier {

	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = scanner.nextInt();
		scanner.close();

		boolean isLeapYear = new LeapYearVerifier().isGivenYearIsLeapYear(year);
		if (isLeapYear) {
			System.out.println("Given year is Leap Year");
		} else {
			System.out.println("Given Year is NOT Leap Year");
		}

	}*/

	public boolean isGivenYearIsLeapYear(int year) {
		if (year % 4 == 0)
			return true;
		else
			return false;
	}

}

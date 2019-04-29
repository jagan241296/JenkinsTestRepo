package main;

public class WeightConverter {
	
	private static final float CONVERSION_RATE = 2.223f;
	/*
	 * 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight: ");
		float weight  = scanner.nextFloat();
		System.out.println("Enter the Unit (1- Kg, 2-Lbs): ");
		int unit = scanner.nextInt();
		scanner.close();
		switch (unit) {
		case 1:
		{
			System.out.println(new WeightConverter().convertedWeightFromKgToLbs(weight) + " lbs");
			break;
		}
		case 2:
		{
			System.out.println(new WeightConverter().convertedWeightFromLbsToKgs(weight) + " Kg");
			break;
		}
		default:
			break;
		}
	}*/
	
	public float convertedWeightFromKgToLbs(float kgs)
	{		
		return kgs * CONVERSION_RATE;
	}
	public  float convertedWeightFromLbsToKgs(float lbs)
	{
		return lbs / CONVERSION_RATE;
	}
}

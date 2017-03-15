import java.util.Random;
import java.util.Scanner;
public class GenCheeseShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double discount = 0, Subtotal = 0;
		final int MAXCHEESE = 3;
		int Display = 0;

		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		if(MAXCHEESE > 0)
		{
			names[0] = "Dalaran Sharp";
			prices[0] = 1.25;
		}
		if(MAXCHEESE > 1)
		{
			names[1] = "Stormwind Brie";
			prices[1] = 10.00;
		}
		if(MAXCHEESE > 2)
		{
			names[2] = "Alterac Swiss";
			prices[2] = 40.00;
		}	

		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");

		Random ranGen = new Random(100);

		for (int i = 0; i < MAXCHEESE; i++) 
		{
			if(i > 2)
			{
				names[i] = "Cheese Type " + (char)('A' + i);
				prices[i] = ranGen.nextInt(1000)/100.0;
				amounts[i] = 0;
			}
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
		for(int i = 0; i< MAXCHEESE; i++)
		{
			System.out.print("Enter the amount of " + names[i] + ":");
			amounts[i] = input.nextInt();
			Subtotal += amounts[i] * prices [i];
		}
		System.out.print("Display the itemized list? (1 for yes): ");
		Display = input.nextInt();

		if (Display == 1)
		{
			for(int i = 0; i < MAXCHEESE; i++)
			{
				if(amounts[i] > 0)
				{
					System.out.println(names[i] + ": $" + prices[i] + " per pound");
				}
			}
		}


		if(Subtotal >= 50)
		{
			discount = 10;
		}
		if(Subtotal >= 100)
		{
			discount = 25;
		}

		System.out.println("Discount: $" + (discount));
		System.out.println("Sub total: $" + (Subtotal));
		System.out.println("Total: $" + (Subtotal - discount));
	}
}

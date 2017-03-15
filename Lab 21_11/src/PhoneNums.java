import java.util.*;
import java.io.*;

public class PhoneNums {

	public static void main(String[] args) {

		String filename = "Phone.txt"; 

		try {
			Scanner input = new Scanner ( new FileReader(filename));
			
			while (input.hasNextLine()) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[+-]");	
				System.out.println("Country Code: " + line.nextInt());
				System.out.println("Area Code: " + line.nextInt());
				System.out.print("Phone Number: " + line.nextInt());
				
				if(line.hasNext())
					System.out.println(line.nextInt());
					
				
				System.out.println("");
				
				
				//System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}

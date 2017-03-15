import java.util.*;
import java.io.*;

public class Directory {

	public static void main(String[] args) {
		System.out.print("Enter the file name: ");
		Scanner kbd = new Scanner(System.in);
		String filename = kbd.next();
		
		
		// create people array
		Person[] people = new Person[100];
		
		
		// Create dummy objects 
		for (int i = 0; i < 100; i++)
			people[i] = new Person();
		
		try {
			Scanner input = new Scanner ( new FileReader(filename) );
			int count = 0;
			while (input.hasNextLine() && count < 100) {
				Scanner line = new Scanner(input.nextLine());
				line.useDelimiter("[\t]");
				people[count].setName(line.next());
				people[count].setAge(line.nextInt());
				people[count].setLocation(line.next());
				
				System.out.println(people[count].getName() + " @" + people[count].getLocation() + " is " + people[count].getAge());
				count++;
			} 
			System.out.println("Total people " + count);
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}

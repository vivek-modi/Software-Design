package Q1;

import java.util.*;
import java.io.*;

public class CountryTest {

	public static void main(String args[]) {
		Country c = new Country();
		Scanner sc = new Scanner(System.in);

		try {
			ObjectInputStream s = new ObjectInputStream(new FileInputStream("yo.dat"));
			c = (Country) s.readObject();
			s.close();
			System.out.println("Initial Country Details");
			System.out.println("=======================");
			System.out.println("Name:       " + c.getName());
			System.out.println("Pop :       " + c.getPopulation());
			System.out.println();
			System.out.println("Enter new details");
			System.out.println("Enter New Name: ");
			c.setName(sc.next());
			System.out.println("Enter New Population: ");  
			c.setPopulation(sc.nextInt());
			
			System.out.println("Updated Country Details");
			System.out.println("=======================");

			System.out.println("Name:       "+c.getName());
            System.out.println("Pop :       "+c.getPopulation());


			System.out.println();

			try {
			ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("yo.dat"));
			ob.writeObject(c);
			ob.close();
			}catch (Exception ex) {
				
			}
		} catch (Exception e) {
			

		}
	}

}

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num=Integer.parseInt(args[0]);
		int hundreds;
		int tens;
		int units;
		units = num % 10;
		tens = (int)(num % 100)/10;
		hundreds = (int)num/100;
		//hundreds, 2 tens, and 3 ones.
		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+ units + " ones.");	
		}

	}


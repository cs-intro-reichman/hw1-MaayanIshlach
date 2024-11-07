// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1=args[0];
		String name2=args[1];
		String name3=args[2];
		int total_price = Integer.parseInt(args[3]);
		//ystem.out.println("the names are:"+ name1+","+name2+","+name3+" and the total price is: "+total_price);

		Double temp;
		temp=Math.ceil(total_price/3.0);
// Dear Dan, Lisa, and Ron: pay 34.0 Shekels each.
		System.out.println("Dear "+name1+","+name2+","+name3+": pay "+temp+" each.");
	}
}

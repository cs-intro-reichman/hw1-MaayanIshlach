// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int rnd1;
		int rnd2;
		int rnd3;
		int lim=Integer.parseInt(args[0]);
		int min;
		int max;
		int sum;
		int middle;
		rnd1=(int)(Math.random()*lim);
		rnd2=(int)(Math.random()*lim);
		rnd3=(int)(Math.random()*lim);
		min=Math.min(Math.min(rnd1, rnd2),rnd3);
		max=Math.max(Math.max(rnd1, rnd2),rnd3);
		sum=rnd1+rnd2+rnd3;
		middle=sum-min-max;
		System.out.print(rnd1 + " " + rnd2 + " " + rnd3 + " ");
		System.out.println();
		System.out.print(min + " " + middle + " " + max + " ");
		System.out.println();
		
	}
}

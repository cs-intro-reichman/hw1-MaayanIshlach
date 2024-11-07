// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue= Integer.parseInt(args[0]);
		double rate=(double)Integer.parseInt(args[1]);
		int n=Integer.parseInt(args[2]);

		double futureValue;
		futureValue=currentValue * Math.pow(1+rate/100, n);
		System.out.println("after "+ n +" years, " + currentValue + "$ saved at " + rate + "% will yield " + (int)futureValue + "$");
	}
}
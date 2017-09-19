public class DemoMath{
	public static void main(String args[]) {
		int a = 1, b = 2, c = 3;
		double x=2.24, y=7.49, z=7.50;
		//Max dan Min
		System.out.println(" max int : " + Math.max(a,b));
		System.out.println(" max double : " + Math.min(y,z));

		//nilai y
		System.out.println(" ceil y : " + Math.ceil(y));
		System.out.println(" floor y : " + Math.floor(y));
		System.out.println(" round y : " + Math.round(y));

		//nilai x
		System.out.println(" ceil x : " + Math.ceil(x));
		System.out.println(" floor x : " + Math.floor(x));
		System.out.println(" round x : " + Math.round(x));

		//nilai z
		System.out.println(" ceil z : " + Math.ceil(z));
		System.out.println(" floor z : " + Math.floor(z));
		System.out.println(" round z : " + Math.round(z));

		//nilai random, pangkat
		System.out.println(" random-1 : " + Math.random());
		System.out.println(" random-2 : " + Math.random());
		System.out.println(" random-3 : " + Math.random());
		System.out.println(" pangkat b,c : " + Math.pow(b,c));

	}
}
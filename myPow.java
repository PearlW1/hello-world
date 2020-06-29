public class myPow {

	public double myPow(double x, int n) {
		double res = 1;
		int exp = n;
		double temp = x;
		while (exp != 0) {
			if ((exp % 2) != 0) {
				res = res * temp;
			}
			temp = temp* temp;
			exp = exp/2;
		}
		return x > 0? res: 1/res;
	}

	public static void main(String[] args) {
		myPow obj = new myPow();
		int x = 3, n = 4;

		double res  = obj.myPow(x, n);
		System.out.print(res);

	}
}

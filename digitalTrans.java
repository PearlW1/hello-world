public class digitalTrans {
	public int digitalTrans(int x) {
		int pop = 0;
		int res = 0;
		while(0 != x){
			pop = x % 10;
			x = x/10;
			//boundry  -2147483648～2147483647
			if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && pop > 7) return res=0;
			if(res < Integer.MIN_VALUE/10 || res == Integer.MIN_VALUE/10 && pop < -8) return res=0;
			res = res*10 + pop;
		}
		return res;
	}

//	public int digitalTrans (int n) {
//		int res = 0;
//		int a = n;
//		while () {
//			int b = a & 1;
//			;
//		}
//
//		return res;
//	}

	public static void main(String[] args) {

		digitalTrans obj = new digitalTrans();
		int n = -123;
		int res = 0;
		res = obj.digitalTrans(n);
		System.out.print(res);


	}
}

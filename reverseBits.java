public class reverseBits {

	public int reverseBits(int num) {
		int cnt1 = 1;
		int pos = -1;
		int result = 0;
		for (int i = 0; i < 33; i++) {
			if ((num & 1) == 1) {
				cnt1++;
			} else {
				result = Math.max(result, cnt1);
				cnt1 = i - pos;
				pos = i;
			}
			num >>>= 1;
		}

		return result;
	}

	public static void main(String []args){

		int num = 1775;// 11011101111
		reverseBits obj = new reverseBits();

		int res = obj.reverseBits(num);
		System.out.print(res);
	}
}

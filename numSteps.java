public class numSteps {

	public int numSteps(String s) {
		//计算s为多少
		if (s.length() == 1) return 0;
		int carry = 0, cnt = 0;
		for (int i = s.length() -1; i >= 1;i--){
			int temp = Integer.valueOf(s.charAt(i)) - 48;
			if (temp + carry == 0 && temp ==0 ) {
				//偶数除二
				cnt++;
				carry = 0;
			} else if (temp + carry == 1 && temp == 0){
				//奇数+1，也就是进位，此时应为偶数
				carry = 1;
				cnt = cnt + 2;

			} else if (temp + carry == 1 && temp == 1){
				//进位
				carry = 0;
				cnt = cnt + 2;
			} else if (temp + carry == 1 && temp == 1){

			}
		}
		return cnt;
	}

	public static void main(String []args){
		String s = "1101";
		numSteps obj = new numSteps();
		int res = obj.numSteps(s);

		System.out.print(res);
	}
}

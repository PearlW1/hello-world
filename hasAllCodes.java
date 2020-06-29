public class hasAllCodes {

	public boolean hasAllCodes(String s, int k) {
		Double K =Math.pow(2, k);
		for (int i = 0; i <= K; i++) {
			String temp = toBit(i);
			while (temp.length() < k) {
				temp = "0" + temp;
			}
			if (!s.contains(temp)) {
				return false;
			}
		}
		return true;
	}

	public String toBit(int k) {
		String s = new String();
		for(int n=k;n>0;n /= 2)
		{
			s=(n%2)+s;
		}
		return s;
	}

	public static void main (String[] args) {

		hasAllCodes obj = new hasAllCodes();
		String s = "00000000010011101";
		int k = 4;
		System.out.print(obj.hasAllCodes(s, k));

	}
}

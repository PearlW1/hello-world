public class countTriplets {
	int res;

	public int countTriplets(int[] arr) {
		dfs (arr, 0, 1, 1);
		return res;

	}
	public void dfs (int[] arr, int i, int j , int k) {

		if (i >= j || j >k ||k >=arr.length || i >= arr.length || j >= arr.length) {
			return ;
		}
		int a = 0;
		int b = 0;
		int u = i;
		int v = j;
		while (u  < j) {
			a = a ^ arr[u++];
		}
		while (v <= k) {
			b = b ^ arr[v++];
		}
		if (a == b && (i < j && j <= k )) {
			res++;
		}
		dfs (arr, i, j + 1, k);
		dfs (arr, i, j, k + 1);
		dfs (arr, i + 1, j, k);


	}

	public static void main(String[] args) {

		countTriplets obj = new countTriplets();
		int[] arr = {2,3,1,6,7};
		int res = 0;
		res = obj.countTriplets(arr);
		System.out.print(res);


	}


}

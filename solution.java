public class solution {

	public int numWays(int n, int[][] relation, int k) {
		int[][] dp  = new int[6][10];
		dp[0][0] = 1;
		for (int i = 1; i <= k; i++){
			for (int j = 0; j < relation.length; j++) {
				dp[i][relation[j][1]] += dp[i-1][relation[j][0]];
				System.out.print(dp[i-1][relation[j][0]]);
				System.out.print('\n');
				System.out.print(dp[i][relation[j][1]]);
				System.out.print(dp);

			}
		}

		return dp[k][n-1];

	}

	public static void main (String[] args){
		int n =5;

		int k = 3;
		int[][] relation = {{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};

		solution obj = new solution();
		System.out.print(obj.numWays( n, relation,k));
	}


}

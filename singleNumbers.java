public class singleNumbers {
//https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/
/*
* 任何一个数字异或它自己都等于0,也就是说我们从头到尾异或数组中每个数字,那么他最终的结果就是刚好出现的那个数字,因为那些成对的数字在异或中抵消了
* 想清楚上面的问题,那么我们的这个问题可以将它分成两个数组,使得每个数组中包含一个只出现一次的数字,那么怎么划分这样的数组,也是通过异或啦
* */
	public int[] singleNumbers(int[] nums) {
		int xorNumber = nums[0];
		for(int k=1; k<nums.length; k++){
			xorNumber ^=nums[k];
		}
		//想清楚上面的问题,那么我们的这个问题可以将它分成两个数组,使得每个数组中包含一个只出现一次的数字
		int onePosition = xorNumber&(-xorNumber);
		int ans1 = 0, ans2 = 0;
		//当我们遍历异或完成后得到二进制的数字0010,我们根据倒数第二位是不是1将数组分成两个数组,
		// 分别为[2,3,6,3,2]和[4,5,5],其中前面数组中数字的第二位都是1,后面数组中数字的第二位都是0,
		// 两个数组分别取异或,第一个数组得到6,第二个数组得到4,完成!

		for(int i=0; i<nums.length; i++){
			if((nums[i]&onePosition)==onePosition){
				ans1^=nums[i];
			}else{
				ans2^=nums[i];
			}
		}

		return new int[] {ans1, ans2};
	}

	public static void main(String args[]) {
		singleNumbers obj = new singleNumbers();
		int[] num = {2,4,3,6,3,2,5,5};
		int[] res = obj.singleNumbers(num);
		for (int n: res){
			System.out.print(n+ "\n");
		}

	}

}

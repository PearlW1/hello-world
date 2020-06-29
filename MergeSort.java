/*将两个的有序数列合并成一个有序数列，我们称之为"归并"。
归并排序(Merge Sort)就是利用归并思想对数列进行排序。根据具体的实现，归并排序包括"从上往下"和"从下往上"2种方式。


1. 从下往上的归并排序：将待排序的数列分成若干个长度为1的子数列，然后将这些数列两两合并；得到若干个长度为2的有序数列，再将这些数列两两合并；得到若干个长度为4的有序数列，再将它们两两合并；直接合并成一个数列为止。这样就得到了我们想要的排序结果。(参考下面的图片)

2. 从上往下的归并排序：它与"从下往上"在排序上是反方向的。它基本包括3步：
① 分解 -- 将当前区间一分为二，即求分裂点 mid = (low + high)/2;
② 求解 -- 递归地对两个子区间a[low...mid] 和 a[mid+1...high]进行归并排序。递归的终结条件是子区间长度为1。
③ 合并 -- 将已排序的两个子区间a[low...mid]和 a[mid+1...high]归并为一个有序的区间a[low...high]。*/

public class MergeSort {

	public void merge(int[] nums, int start, int mid, int end) {
		int[] temp = new int[end - start - 1]; //汇总两个有序区域的临时区域
		int i = start; //第一个索引区域的开始
		int j = mid + 1; //第二个索引区域的开始
		int k = 0;
		while (i < mid && j < end) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = nums[i++];
		}

		while (j <= end) {
			temp[k++] = nums[j++];
		}

		for (int u = 0; u < end; u++) {
			nums[start + u] = temp[u];
		}

		temp = null;
	}
	//自上而下
	public void mergeUpToDown(int[] nums, int start, int end) {
		if (nums == null || start >= end) return;
		int mid = (start + end)/2;
		mergeUpToDown(nums, start, mid);
		mergeUpToDown(nums, mid+1, end);

		merge(nums,start,mid,end);


	}


	public static void main(String []args){
		System.out.println("Hello World");
		int[] a = {12,20,5,16,15};
		int start = 0;
		int end = a.length-1;
		MergeSort obj = new MergeSort();
		obj.mergeUpToDown(a,start, end);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}

	}
}

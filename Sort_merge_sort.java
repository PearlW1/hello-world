public class Sort_merge_sort {

		/*
	归并排序：归并排序是一种比较占内存，但却效率高且稳定的算法。
	基本思想：O(nlogn)，扫描一遍需要n，由完全二叉树的深度可知，归并需要进行logn次
	时间复杂度：n**2
	空间复杂度：O(n+logn)，n是申请的数组，logn是递归时调用的栈空间
	稳定性：稳定

	工作原理步骤：
	（1）申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
	（2）设定两个指针，最初位置分别为两个已经排序序列的起始位置
	（3）比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
	（4）重复步骤3直到某一指针达到序列尾
	（5）将另一序列剩下的所有元素直接复制到合并序列尾

	*
	* */

	public void merge(int[] nums, int low, int mid, int hight){
		//申请空间，大小为待排序的数组大小
		int[] temp = new int[hight - low + 1];
		//左指针
		int i = low;
		//右指针
		int j = mid + 1;
		int k = 0;//temp中元素的索引
		while (i <= mid && j <= hight){
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			}else{
				temp[k++] = nums[j++];
			}
		}
		//将左边剩余元素放进来
		while (i <= mid) {
			temp[k++] = nums[i++];
		}
		//将右边剩余元素放进来
		while (j <= hight) {
			temp[k++] = nums[j++];
		}
		//将temp中元素赋值到nums中去替换原来的无序元素
		for (int h = 0; h < k; h++){
			nums[low + h] = temp[h];
		}
	}

	public void mergeSort(int[] nums, int low, int hight){
		int mid = low + (hight - low)/2;
		if (low < hight){
			//左边
			mergeSort(nums, low, mid);
			// 右边
			mergeSort(nums, mid + 1, hight);
			//合并
			merge(nums, low, mid, hight);
		}


	}

	public void merge(int[] arr, int start, int end) {
		if (start == end) return ;
		int mid = (start + end) / 2;
		merge(arr, start, mid) ;
		merge(arr, mid + 1, end);

		int[] temp = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {
			//逆序对的贡献:j - (mid + 1)
			temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		while (i <= mid) {
			//左边剩余的元素 本应该在右侧的，所以每一个元素，都会产生右边元素数量j - (mid + 1)的逆序对个数
			temp[k++] = arr[i++];
		}
		while (j <= end)
			temp[k++] = arr[j++];
		System.arraycopy(temp, 0, arr, start, end - start + 1);
		return ;
	}


//	作者：1yx
//	链接：https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/solution/java-gui-bing-fa-by-1yx/
//	来源：力扣（LeetCode）
//	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

	public static void main(String args[]) {
		Sort_merge_sort obj = new Sort_merge_sort();
		int[] num = {1,2,3,5, 4};
		int low = 0, hight = num.length - 1;
		obj.merge(num, low, hight);
		for (int n: num){
			System.out.print(n+ "\n");
		}

	}
}

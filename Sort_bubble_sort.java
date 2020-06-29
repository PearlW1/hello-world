public class Sort_bubble_sort {
		/*
	冒泡排序：对于基本有序的数组最好用
	基本思想：首先将最大的元素往后面挪，交换位置，然后次最大的
	时间复杂度：n**2
	空间复杂度：1
	稳定性：稳定
	*
	* */
	public void bubble_sort(int[] nums) {
		for (int i = nums.length - 1; i >0; i--){
			for (int j = 0; j < i; j++){
				if (nums[j] > nums[j+1]) swap(nums, j, j+1);
			}
		}

	}

	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	//时间复杂度最少为n的优化
	//最好情况下的时间复杂度：如果元素本来就是有序的，那么一趟冒泡排序既可以完成排序工作，比较和移动元素的次数分别是n-1和0，因此最好情况的时间复杂度为O（n）。
	public void bubbleSort(int arr[]) {
		boolean didSwap;
		for(int i = 0, len = arr.length; i < len - 1; i++) {
			didSwap = false;
			for(int j = 0; j < len - i - 1; j++) {
				if(arr[j + 1] < arr[j]) {
					swap(arr, j, j + 1);
					didSwap = true;
				}
			}
			if(didSwap == false)//上一个循环比较结束而没有发生交换，但是每两个相邻元素都比较过了，说明已经有序
				return;
		}
	}


	public static void main(String args[]) {
		Sort_bubble_sort obj = new Sort_bubble_sort();
		int[] num = {1,2,3,5, 4};
		obj.bubble_sort(num);
		for (int n: num){
			System.out.print(n+ "\n");
		}

	}


}

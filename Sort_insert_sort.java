public class Sort_insert_sort {
	/*
	插入排序：对于基本有序的数组最好用
	基本思想：将第二个元素跟第一个元素比较，如果小，则换位置，往前面移动
	时间复杂度：n**2
	空间复杂度：1
	稳定性：稳定
	*
	* */
	public void insert_sort(int[] nums){
		//拿出第i个元素
		for (int i = 1; i < nums.length; i++) {
			//跟第i个元素之前元素依次比较
			for (int j = i; j > 0; j--) {

				if (nums[j] < nums[j-1]) {
					swap(nums, j, j-1);
				}
			}
		}
	}

	public void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	//如果前面已经是有序的，则排好顺的数一次往后面挪，直到小于待插入的数的时候，直接进去
	public void insert_sort1(int[] nums){
		//拿出第i个元素
		for (int i = 1; i < nums.length; i++) {
			//跟第i个元素之前元素依次比较
			for (int j = i; j > 0; j--) {
				int temp = nums[i];
				if ( nums[j-1] > temp){
					swap(nums, j-1, i);
				}
			}
		}
	}


	public static void main(String args[]) {
		Sort_insert_sort obj = new Sort_insert_sort();
		int[] num = {1,2,3,5, 4};
		obj.insert_sort1(num);
		for (int n: num){
			System.out.print(n+ "\n");
		}

	}



}

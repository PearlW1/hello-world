public class Sort_shell_sort {

		/*
	希尔排序：
	基本思想：1.先间隔排序，然后再插入排序------- 在要排序的一组数中，根据某一增量分为若干子序列，并对子序列分别进行插入排序。
	时间复杂度：n1.5
	空间复杂度：
	稳定性：不稳定

	希尔排序是基于插入排序的以下两点性质而提出改进方法的：
插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率。
但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位。

	* */
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public void shellSort(int[] nums) {
		int len = nums.length;
		int d = len;
		while (true) {
			d = d/2;
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < len; i= i +d){
					int temp = nums[i];
					int j;
					for (j = i - d ; j >=0 && nums[j] > temp; j = j-d){
						nums[j + d] = nums[j];
					}
					nums[j+d] = temp;
				}
			}
			if (d == 1) break;
		}

	}

	public static void main(String args[]) {
		Sort_shell_sort obj = new Sort_shell_sort();
		int[] num = {2, 7, 11, 15, 1, 0};
		obj.shellSort(num);
		for (int n: num){
			System.out.print(n+ "\n");
		}
	}
}

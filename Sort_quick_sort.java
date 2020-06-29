public class Sort_quick_sort {
	/*
	快排：
	基本思想：选定一个基数，将比基数小的放在左边，比基数大的放在右边
	时间复杂度：nlogn
	空间复杂度：nlogn
	稳定性：不稳定排序

	就排序的速度而言，那么快排几乎是最佳选择。但是快排也有一定的局限性，对于完全顺序或者完全逆序且数据量十分庞大的数据，在递归的过程中会存在系统堆栈溢出的风险。
	最坏的情况：n**2 最差的情况就是每一次取到的元素就是数组中最小/最大的，这种情况其实就是冒泡排序

	* */


	public void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	public void quick(int[] src, int begin, int end) {
		if (begin < end) {
			//基准数
			int key = src[begin];
			int i = begin;
			int j = end;
			while (i < j){
				//如果右边大于基准数，j--
				while(i < j && src[j] > key){
					j--;
				}
				//上面循环结束，说明右边不大于基准数了，换位置
				if (i < j){
					swap(src, i, j);
					i++;
				}
				//如果左边的小于基准，i++
				while (i < j && src[i] < key) {
					i++;
				}
				//上面循环结束，说明左边不小于基准数了，换位置
				if (i < j){
					swap(src, i, j);
					j--;
				}
			}
				//当i== j的时候，基准数停留在了它应该在的位置，分而治之的递归下去
				quick(src, begin, i - 1);
				quick(src, i + 1, end);
		}
	}


	int res = 0;
	public void quickModify(int[] src, int begin, int end, int k) {
		if (begin < end) {
			int key = src[begin];
			int i = begin;
			int j = end;
			while (i < j){
				while(i < j && src[j] > key){
					j--;
				}
				if (i < j){
					swap(src, i, j);
					i++;
				}
				while (i < j && src[i] < key) {
					i++;
				}
				if (i < j){
					swap(src, i, j);
					j--;
				}
			}
			if (i > k) {
				quickModify(src, begin, i - 1, k);
			}
			if (i == k) {
				res = src[i];
			}
			if (i < k) {
				quickModify(src, begin, i - 1, k - i);
			}
		}
	}

//	public static void main(String args[]) {
//		Sort_quick_sort obj = new Sort_quick_sort();
//		int[] num = {2, 7, 11, 15, 1, 0, 0,15};
//		obj.quick(num, 0, num.length - 1);
//		for (int n: num){
//			System.out.print(n+ "\n");
//		}
//	}



	public static void main(String args[]) {
		Sort_quick_sort obj = new Sort_quick_sort();
		int[] num = {2, 7, 11, 15, 1, 0, 0,15};
		int res = obj.kv(num, 3);

		System.out.print(res); // 1
	}

	public int select (int[] nums, int k) {
		int i = 0;
		for (; i < k; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					swap(nums, i, j);
				}
			}
		}

		return nums[i - 1];
	}

	public int kv (int[] nums, int k) {
		int[] kv = new int[20];
		for (int num: nums) {
			kv[num]++;
		}
		int sum = 0;
		int res = 0;
		for (int i = 0; i < 20; i++) {
			sum += kv[i];
			if (sum >= k) {
				res = i;
				break;
			}
		}
		return res;
	}


}

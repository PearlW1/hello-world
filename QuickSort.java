//快速排序的原理：选择一个关键值作为基准值。比基准值小的都在左边序列（一般是无序的），比基准值大的都在右边（一般是无序的）。一般选择序列的第一个元素。

public class QuickSort {
	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}

	public void sort(int[] nums, int low, int high) {
		int start = low;
		int end = high;
		int key = nums[low];

		while (start < end) {

			while (end > start && nums[end] >= key) {
				end--;
			}

			if (key >= nums[end]){
				int temp = key;
				key = nums[end];
				nums[end] = temp;
			}

			while (nums[start] <= key && start < end) {
				start++;
			}

			if (nums[start] >= key) {
				int temp = nums[start];
				nums[start] = key;
				key = temp;
			}
			//此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
		}
		//递归
		if (start > low) sort(nums, low, start - 1);
		if (end < high) sort(nums, end + 1, high);

	}


	public static void main(String []args){
		System.out.println("Hello World");
		int[] a = {12,20,5,16,15,1,30,45,23,9};
		int start = 0;
		int end = a.length-1;
		QuickSort obj = new QuickSort();
		obj.sort(a,start,end);
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}

	}
}

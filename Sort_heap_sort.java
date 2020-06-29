public class Sort_heap_sort {
			/*
	堆排序：堆是具有以下性质的完全二叉树：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。
			大顶堆：arr[i] >= arr[2i+1] && arr[i] >= arr[2i+2]
			数组的生成：每层遍历写进数组
	基本思想：将待排序序列构造成一个大顶堆，此时，整个序列的最大值就是堆顶的根节点。
			将其与末尾元素进行交换，此时末尾就为最大值。
			然后将剩余n-1个元素重新构造成一个堆，这样会得到n个元素的次小值。
			如此反复执行，便能得到一个有序序列了
	时间复杂度： nlogn
	空间复杂度：1
	稳定性：稳定
	*
	* */



	/*@para 没三个节点进行一次堆建设
	* tree[] 是数组
	* n是要建堆的元素个数
	* i为当前建堆的父节点
	* */
	public void heapify(int[] tree, int n, int i){
		//递归的出口
		if (i >= n) {
			return;
		}
		//先找出三个节点内最大的元素
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;
		if (left < n && tree[left] > tree[max]){
			max = left;
		}
		if (right < n && tree[right] > tree[max]){
			max = right;
		}
		if (max != i) {
			swap(tree, max, i);
			heapify(tree,n,max);
		}
	}

	public void buildHeap(int[] tree, int n) {
		int lastNode = n -1;
		int parent = (lastNode - 1) /2;
		for (int i = parent; i >= 0; i--) {
			heapify(tree, n, i);
		}

	}

	//根节点跟最后一个节点进行换位置，然后对剩下的节点，进行heapify，
	public void heapSort(int[] tree, int n) {
		//建立一个堆
		buildHeap(tree, n);
		//将根节点与最后一个元素换位置，砍断最后一个节点；然后对剩下的节点进行heapify
		for (int i = n -1 ; i >= 0; i--) {
			swap(tree, 0, i);
			//i 代表需要建立堆的节点数量，
			heapify(tree, i, 0);
		}
	}

	public void swap(int[] tree, int i, int j) {
		int temp = tree[i];
		tree[i] = tree[j];
		tree[j] = temp;
	}

	public static void main(String args[]) {
		Sort_heap_sort obj = new Sort_heap_sort();
		int[] num = {2, 7, 11, 15, 1, 0};
		obj.heapSort(num, num.length );
		for (int n: num){
			System.out.print(n+ "\n");
		}
	}

}

public class smallestK {

	public int[] smallestK(int[] arr, int k) {
		int len = arr.length;
		if (k >= len) {
			return arr;
		}
		if (k ==0) return new int[0];

		buildMinHeap(arr, len);

		int pos = len - k;
		for (int i = len - 1; i >= pos; i--) {
			//将根节点与最后一个元素换位置，砍断最后一个节点；然后对剩下的节点进行heapify
			swap(arr, 0, i);
			heapify(arr, 0, i);
		}


		int[] ret = new int[k];
		int j = 0;
		for (int i = len - 1; i >= pos; i--) {
			ret[j++] = arr[i];
		}

		return ret;
	}

	private void buildMinHeap(int[] arr, int len) {
		for (int i = (len - 1) / 2; i >= 0; i--) {
			heapify(arr, i, len);
		}
	}

	private void heapify(int[] arr, int i, int len) {
		if (i >= len) return;

		int min = i;
		int c1 = 2 * i + 1;
		int c2 = 2 * i + 2;
		//建立最小堆
		if (c1 < len && arr[c1] < arr[min]) {
			min = c1;
		}
		if (c2 < len && arr[c2] < arr[min]) {
			min = c2;
		}

		if (min != i) {
			swap(arr, i, min);
			heapify(arr, min, len);
		}
	}

	private void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}


	public static void main(String args[]) {
		smallestK obj = new smallestK();
		int[] num = {2,4,3,6,3,2,5,5};
		int[] res = obj.smallestK(num, 0);
//		for (int n: res){
//			System.out.print(n+ "\n");
//		}

	}
}

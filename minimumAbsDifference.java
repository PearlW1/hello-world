import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class minimumAbsDifference {
//	int[] arr = {4,2,1,3};
	public List<List<Integer>> minimumAbsDifference(int[] arr) {

		//1.排序，2，找出最小差，3.遍历找出最下查的元素
		Arrays.sort(arr,0, arr.length);//排序
		System.out.print(arr);
		int diff = 100000000;
		for(int i =1;i<arr.length; i++) diff = (arr[i] -arr[i-1]) > diff ? diff : (arr[i] -arr[i-1]);
		List<List<Integer>> res = new LinkedList<>();
		for(int i =1;i<arr.length;i++) {
			if (diff == arr[i]-arr[i-1])
				res.add(Arrays.asList(arr[i-1], arr[i]));
		}
		return res;
	}

	public static void main(String[] args){
		int[] arr = {4,2,1,3};
		minimumAbsDifference a= new minimumAbsDifference();
		List<List<Integer>> res = a.minimumAbsDifference(arr);
		System.out.print(res);
	}

}

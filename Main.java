import com.sun.deploy.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
		int[] nums = {1, 2,3,6,5};
		Main obj = new Main();
		boolean x = obj.dfs(nums, 0, 1, 2);
		System.out.print(x);

    }
    public boolean dfs (int[] nums, int i, int j, int k) {
    	if (i >=j || j >= k || k >= nums.length) return false;
    	if (i < j && j < k && nums[i] < nums[k] && nums[k] < nums[j]) return true;
    	return dfs(nums, i+ 1, j, k) || dfs(nums, i, j+ 1, k) || dfs(nums, i, j, k+1);
    }
}




//	String distCvrString = "5:1.29215660938106E-4_3:6.71817265703729E-4_1:6.53879686137751E-4_0:0.001479381125562473_2:6.02046959662854E-4_4:0.0";
//	Double distance = 900.0;
//	Double result = 0.0;
//	String distClass;
//
//		    if (distance >= 0.0 && distance < 1000.0) {distClass = "0";}
//		else if (distance >= 1000.0 && distance < 2000.0) {distClass = "1";}
//		else if (distance >= 2000.0 && distance < 3000.0) {distClass = "2";}
//		else if (distance >= 3000.0 && distance < 4000.0) {distClass = "3";}
//		else if (distance >= 4000.0 && distance < 5000.0) {distClass = "4";}
//		else {distClass = "5";}
//
//		String[] distCvrs = distCvrString.split("_");
//		for (int i = 0; i < distCvrs.length; i++) {
//		String[] distCvr = distCvrs[i].split(":");
//		if (distCvr[0].equals(distClass) && !distCvr[1].isEmpty()) {
//		result = Double.valueOf(distCvr[1]);
//		}
//		}
//		System.out.print(result);
//
//
//

//	int year = calendar.get(Calendar.YEAR);
//	int month = calendar.get(Calendar.MONTH);
//        System.out.print(year);//9
//		        System.out.print(month);//输出的是上个月
//
//		        String yearMonthCur = "";
//		        String yearMonthLast = "";
//		        String monthCur = "";
//		        String monthLast = "";
//
//		        if (1 == month) {
//		        yearMonthCur = year + "0" + month;
//		        int yearLast = year - 1;
//		        yearMonthLast = yearLast + "12";
//		        } else if (month >1 && month < 10) {
//		monthCur = "0" + month;
//		int monthSub = month - 1;
//		monthLast = "0" + monthSub;
//		yearMonthCur = year + monthCur;
//		yearMonthLast = year + monthLast;
//		} else if (10 == month) {
//		monthCur = "" + month;
//		int monthSub = month - 1;
//		monthLast = "0" + monthSub;
//		yearMonthCur = year + monthCur;
//		yearMonthLast = year + monthLast;
//		} else if (month > 10 && month <= 12) {
//		monthCur = "" + month;
//		int monthSub = month - 1;
//		monthLast = "" + monthSub;
//		yearMonthCur = year + monthCur;
//		yearMonthLast = year + monthLast;
//		}



//字符减去数字，结论是什么
//public class Main {
//
//    public static void main(String[] args) {
//
//        char a = '9';
//        int b = a - '0';
//        int c = a - '0' - 1;
//        System.out.print(b);//9
//        System.out.print(c);//8
//
//    }
//}
//




//public class Main {
//    //价值百万的AI核心代码
//    public static void main(String[] args) {
//
//        String sc = new String("Would I win the LeetCode T-Shirt?");
//
//        String str;
//        while (true) {
//
//            str = sc;
//
//            str = str.replace("?","!");
//
//            str = str.replace("Would"," ");
//
//            str = str.replace("I","You");
//
//            System.out.println(str);
//        }
//    }
//}

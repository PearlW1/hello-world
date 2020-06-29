public class checkOverlap {

	public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
		// 相交，上下左右, 圆心距
		int x3 = (x1 + x2)/2;
		int y3 = (y1 + y2)/2;
		double dist = Math.sqrt((x_center - x3) * (x_center - x3) + (y_center - y3) * (y_center - y3) );
		if (dist <= radius) return true;
		if (dist > radius) {
			if ((x_center + radius) >= x1 || (x_center - radius <= x2) || (y_center - radius) <=y2 || (y_center + radius >= y1)) return true;
		}
		return false;
	}

//	public static void main(String[] args) {
//
//		checkOverlap obj = new checkOverlap();
//		int r = 1;
//		int xc = 1;
//		int yc = 1;
//		1
//				-3
//		2
//				-1;
//		obj.checkOverlap(n);
//		System.out.print(obj.count);
//	}
}

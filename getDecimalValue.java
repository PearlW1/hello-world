



public class getDecimalValue {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}


	public int getDecimalValue(ListNode head) {
		int res = 0;
		//链表翻转
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = null;

		while(cur != null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		int i = 0;
		while(head != null){
			res = res + i*10*head.val;
			head = head.next;
		}
		return res;
	}

	public static void main(String args[]) {
//		getDecimalValue obj = new getDecimalValue();
//
//		ListNode dummyHead;
//		dummyHead.add(1);
//		int target = 9;
//		int res = obj.getDecimalValue(dummyHead);
//		System.out.print(res);
//		System.out.print(obj.twoSum(num, target));
	}


}


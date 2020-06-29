import java.util.HashMap;
import java.util.Map;



public class removeDuplicateNodes {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode removeDuplicateNodes(ListNode head) {
		ListNode next = null;

		Map<Integer, Integer> map = new HashMap();
		while (head != null) {
			if (!map.containsKey(head.val)) {
				map.put(head.val, 1);
				next = head;
				head = head.next;
			}
		}
		return next;
	}


}

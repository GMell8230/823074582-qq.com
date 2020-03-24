/**
　 * Title: A055_EntryNodeOfLoop.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月7日下午10:58:52
*/
package nowcoder.swordOffer.com;

import java.util.HashSet;
import java.util.Set;

import nowcoder.swordOffer.com.A003_printNode.ListNode;

public class A055_EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
    	if (pHead == null) {
			return null;
		}
    	ListNode memeroy = pHead;
    	Set<Integer> nodeSet = new HashSet<Integer>();
    	boolean hasCircl = false;
    	int nodeval = pHead.val;
    	while (pHead != null) {
    		if (nodeSet.contains(pHead.val)) {
    			hasCircl = true;
    			nodeval = pHead.val;
    			break;
			}
			nodeSet.add(pHead.val);
			pHead = pHead.next;
		}
    	if (hasCircl) {
			while (memeroy.next.val != nodeval) {
				memeroy = memeroy.next;
			}
			return memeroy;
		}else {
			return null;
		}
		
    }
}

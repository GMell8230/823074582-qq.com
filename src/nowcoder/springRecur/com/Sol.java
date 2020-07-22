package nowcoder.springRecur.com;

import java.util.Arrays;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
* @author GMell
* @version 创建时间：2020年6月30日 下午8:53:35
* @describe
*/
public class Sol {
	public static void main(String[] args) {
		
	}
	
	public long muti(int nums, int arr[]) {
		HashMap<Integer, Integer> dict = new HashMap<>();
		for(int i = 0; i< nums; i++ ) {
			dict.put(arr[i], i);
		}
		Arrays.sort(arr);
		long res = 0;
		for(int i = 0; i< nums; i++ ) {
			int curEle = arr[i];
			int curPos = dict.get(curEle);
			int leftPos = curPos-1, rightPos = curPos+1;
			int leftEle = 1, rightEle = 1;
			if (leftPos >= 0) {
				leftEle = arr[leftPos];
			}
			if (rightPos <= nums) {
				leftEle = arr[rightPos];
			}
			dict.put(curEle, -1);
			
			res +=curEle * leftEle * rightEle;
		}
		
	
		return nums;
		
	}
}

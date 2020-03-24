/**
　 * Title: A054_StingStreamNoRepeat.java
　 * Description:
　 * @author GuoMell
　 * @date 2020年2月15日下午10:40:24
*/
package nowcoder.swordOffer.com;

public class A054_StingStreamNoRepeat {

	StringBuffer sb = new StringBuffer();
	char hash[] = new char[256];
	public void Insert(char ch)
    {
		sb.append(ch);
		hash[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {	
    	char res = '#';
    	for (int i = 0; i < sb.length(); i++) {
			if (hash[sb.charAt(i)] == 1) {
				res = sb.charAt(i);
				break;
			}
		}
    	return res;
    }
}

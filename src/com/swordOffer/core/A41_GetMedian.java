package com.swordOffer.core;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
* @author GMell
* @version ����ʱ�䣺2020��7��5�� ����8:58:03
* @describe
*/
public class A41_GetMedian {
	//��ߴ󶥶�
	private PriorityQueue<Integer> leftHeap= new PriorityQueue<>((o1, o2) -> o2-o1);
	//�ұ�С����
	private PriorityQueue<Integer> rightHeap= new PriorityQueue<>();
	private int n = 0;
    public  void Insert(Integer num) {
    	//���벢��֤ƽ��״̬
        if (n % 2 == 0) {
        	// ������ߣ�����������ķŵ��ұ�
			leftHeap.add(num);
			rightHeap.add(leftHeap.poll());
		}else {
			//�����ұߣ������ұ���С�ķŵ����
			rightHeap.add(num);
			leftHeap.add(rightHeap.poll());
		}
        n++;
    }

    public Double GetMedian() {
       if (n % 2 != 0) {
    	   return Double.valueOf(rightHeap.peek());
       }else {
    	   return (leftHeap.peek()+rightHeap.peek())/2.0;
       }
    }
}

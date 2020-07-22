package com.swordOffer.core;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
* @author GMell
* @version 创建时间：2020年7月5日 下午8:58:03
* @describe
*/
public class A41_GetMedian {
	//左边大顶堆
	private PriorityQueue<Integer> leftHeap= new PriorityQueue<>((o1, o2) -> o2-o1);
	//右边小顶堆
	private PriorityQueue<Integer> rightHeap= new PriorityQueue<>();
	private int n = 0;
    public  void Insert(Integer num) {
    	//插入并保证平衡状态
        if (n % 2 == 0) {
        	// 加入左边，并将左边最大的放到右边
			leftHeap.add(num);
			rightHeap.add(leftHeap.poll());
		}else {
			//加入右边，并将右边最小的放到左边
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

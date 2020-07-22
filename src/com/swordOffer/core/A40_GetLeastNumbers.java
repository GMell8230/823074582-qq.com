package com.swordOffer.core;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
* @author GMell
* @version 创建时间：2020年7月5日 下午7:59:37
* @describe
*/
public class A40_GetLeastNumbers {
	
	public static void main(String[] args) {
		int [] input = {1,2,8,7,0,2,9};
		int k = 4;
		System.out.println(GetLeastNumbers_Solution(input, k)); 
	}
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> res = new ArrayList<>();
    	if (input.length == 0 || input.length < k) {
			return res;
		}
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i :input) {
			pq.add(i);
		}
        int cnt = 0;
        while(!pq.isEmpty()) {
			if(cnt == k) {
				break;
			}
			res.add(pq.poll());
			cnt ++;

		}
        return res;
    }
    
    public static ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
    	if(k > input.length || k <= 0)
    		return new ArrayList<>();
    	PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1 );
    	for(int num : input) {
    		maxHeap.add(num);
    		if (maxHeap.size() > k) {
				maxHeap.poll();
			}
    	}
    	return new ArrayList<>(maxHeap);
    }
}

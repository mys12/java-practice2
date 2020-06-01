package net.abc.test;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

	public int getSum(List<Integer> list) {
		int sum=0;
		for(int l : list) {
			sum +=l;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		ListArray la = new ListArray();
		int[] arr = {100,90,100,80,90};
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		System.out.println(la.getSum(list));
		double avg = (double)la.getSum(list)/list.size();
		System.out.println("평균 : " +avg);
	}
	

}

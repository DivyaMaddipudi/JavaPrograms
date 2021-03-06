/*
 * 
 * The following iterative sequence is defined for the set of positive integers:

	n → n/2 (n is even)
	n → 3n + 1 (n is odd)
	
	Using the rule above and starting with 13, we generate the following sequence:
	
	13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
	Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
	
	Which starting number, under one million, produces the longest chain?
	
	NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 */
package com.projects;

public class P014 {
	public static void main(String[] args) {

		long chainSize = 0;
		long temp = 0;
		long max = 0;
		long num = 0;
		long result = 0;
		
		
		for(long i=1000000;i>1;i--) {
			chainSize = 0;
			num = i;
			while (num != 1) {
				if (num % 2 == 0) {
					temp = num / 2;
				} else {
					temp = 3 * num + 1;
				}
				num = temp;
				chainSize++;
			}
			if(chainSize > max) {
				max = chainSize;
				result = i;
			}
		}
		System.out.println(result);
	}

}

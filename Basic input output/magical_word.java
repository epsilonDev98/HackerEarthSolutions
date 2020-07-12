/*
https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/magical-word/
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int tests=sc.nextInt();
        int y=0;
        char x=0;
        int[] prime={67,71,73,79,83,89,97,101,103,107,109,113};
        for(int i=0;i<tests;i++) {
	int n=sc.nextInt();
	String s=sc.next();
	char str[]=s.toCharArray();
	for(int j=0;j<n;j++) {
		if(str[j]==67||str[j]==71||str[j]==73||str[j]==79||str[j]==83||str[j]==89||str[j]==97
				||str[j]==101||str[j]==103||str[j]==107||str[j]==107||str[j]==109||str[j]==113	) {
			str[j]=str[j];
		}
		else {
			int min=1000;
			for(int k=0;k<12;k++) {
				y=Math.abs(str[j]-prime[k]);
				if(y<min) {
					min=y;
					x=(char)prime[k];
				}
				
					
			}
            str[j]=x;
		}
		
	}
	System.out.println(str);
}
	}
 
}

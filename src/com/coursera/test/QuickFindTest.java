package com.coursera.test;

import com.coursera.java.unionfind.QuickFind;

public class QuickFindTest {
	public static void main(String[] args)
	{	 
		int n = 10;
	    QuickFind quickFind = new QuickFind(n);
	    quickFind.printConnected();
	    quickFind.union(9, 6);
	    quickFind.union(6, 5);
	    quickFind.union(0, 5);
	    quickFind.union(3, 9);
	    quickFind.union(4, 5);
	    quickFind.union(3, 7);
	    quickFind.printConnected();
	 }
}

package com.coursera.test;

import com.coursera.java.unionfind.QuickFind;

public class QuickFindTest {
	public static void main(String[] args)
	{	 
		int n = 10;
	    QuickFind quickFind = new QuickFind(n);
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(9, 6);
	    System.out.print("Union 9,6: ");
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(6, 5);
	    System.out.print("Union 6,5: ");
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(0, 5);
	    System.out.print("Union 0,5: ");
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(3, 9);
	    System.out.print("Union 3,9: ");
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(4, 5);
	    System.out.print("Union 4,5: ");
	    quickFind.printConnected();
	    System.out.println();
	    quickFind.union(3, 7);
	    System.out.print("Union 3,7: ");
	    quickFind.printConnected();
	 }
}

package com.coursera.test;

import com.coursera.java.unionfind.QuickUnion;

public class QuickUnionTest {
	public static void main(String[] args)
	{	 
		int n = 10;
	    QuickUnion quickUnion = new QuickUnion(n);
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(3, 5);
	    System.out.print("Union 3,5: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(7, 8);
	    System.out.print("Union 7,8: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(0, 2);
	    System.out.print("Union 0,2: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(4, 2);
	    System.out.print("Union 4,2: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(9, 4);
	    System.out.print("Union 9,4: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(7, 3);
	    System.out.print("Union 7,3: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(2, 1);
	    System.out.print("Union 2,1: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(1, 7);
	    System.out.print("Union 1,7: ");
	    quickUnion.printConnected();
	    System.out.println();
	    quickUnion.union(8, 6);
	    System.out.print("Union 8,6: ");
	    quickUnion.printConnected();
	 }
}

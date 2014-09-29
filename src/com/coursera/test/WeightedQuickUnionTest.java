package com.coursera.test;

import com.coursera.java.unionfind.WeightedQuickUnion;

public class WeightedQuickUnionTest {
	public static void main(String[] args)
	{	 
		int n = 10;
	    WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(n);
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(3, 5);
	    System.out.print("Union 3,5: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(7, 8);
	    System.out.print("Union 7,8: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(0, 2);
	    System.out.print("Union 0,2: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(4, 2);
	    System.out.print("Union 4,2: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(9, 4);
	    System.out.print("Union 9,4: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(7, 3);
	    System.out.print("Union 7,3: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(2, 1);
	    System.out.print("Union 2,1: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(1, 7);
	    System.out.print("Union 1,7: ");
	    weightedQuickUnion.printConnected();
	    System.out.println();
	    weightedQuickUnion.union(8, 6);
	    System.out.print("Union 8,6: ");
	    weightedQuickUnion.printConnected();
	 }
}

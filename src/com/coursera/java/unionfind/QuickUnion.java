package com.coursera.java.unionfind;

public class QuickUnion extends UnionFind {
	
	public QuickUnion(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++)
		{
		 id[i] = i;
		}
	 }

	 private int id[];
	
	 private int root(int i)
	 {
		 while (i != id[i]) i = id[i];
		 return i;
	 }
	 
	public void union(int p, int q)
	 {
		 int i = root(p);
		 int j = root(q);
		 id[i] = j;
	 }
	 
	public boolean connected(int p, int q)
	{ 
		return id[p] == id[q]; 
	}
	
	public void printConnected()
	{
		for (int i = 0; i < id.length; i++)
		{
			System.out.print(id[i]);
		}
	}
}


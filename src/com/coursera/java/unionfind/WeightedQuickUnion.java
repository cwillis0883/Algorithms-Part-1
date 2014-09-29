package com.coursera.java.unionfind;

public class WeightedQuickUnion extends UnionFind {
	
	public WeightedQuickUnion(int n) {
		 count = n;
		 id = new int[n];
		 sz = new int[n];
		 for (int i = 0; i < n; i++) {
		 id[i] = i;
		 sz[i] = 1;
		 }
	 }

	 private int id[];
	 private int sz[];
	 private int count;
	
	 public int count() {
		 return count;
		 }
	 
	 public int find(int p) {
		 while (p != id[p])
		 p = id[p];
		 return p;
	 }
	 
	public void union(int p, int q)
	 {
		int i = find(p);
		int j = find(q);
		if (i == j) return;
		if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
		else { id[j] = i; sz[i] += sz[j]; }
		count--;
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


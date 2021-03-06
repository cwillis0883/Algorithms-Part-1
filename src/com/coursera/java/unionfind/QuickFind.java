package com.coursera.java.unionfind;

public class QuickFind extends UnionFind {
	
	public QuickFind(int n) {
		id = new int[n];
		for (int i = 0; i < n; i++)
		{
		 id[i] = i;
		}
	}

	private int id[];
	 
	public void union(int p, int q)
	 {
	 int pid = id[p];
	 int qid = id[q];
	 for (int i = 0; i < id.length; i++)
	 if (id[i] == pid) id[i] = qid;
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

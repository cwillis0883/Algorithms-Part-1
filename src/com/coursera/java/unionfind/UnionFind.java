package com.coursera.java.unionfind;

abstract public class UnionFind {

	abstract public void union(int p, int q);
	 
	abstract public boolean connected(int p, int q);
	
	abstract public void printConnected();

}

package package1;

import java.util.ArrayList;

public class Clusters {
	long size; // size of the clusters
	ArrayList<Node> nodes; // nodes map to its root, first integer is the index, the second one is it's root
	public Clusters(int s) {
		this.size = s; // initialize the size of clusters
		System.out.println(s);
		nodes = new ArrayList<Node>();
		for(int i = 1; i <= s; i++) {
			nodes.add(new Node(i, 0));
		}
	}
	
	public void merge(int i, int j) {
		// merge two nodes into one cluster
		int root_i = find(i);
		int root_j = find(j);
		if (root_i != root_j) {
			nodes.set(root_j - 1, new Node(root_i,0));
			this.size --;
		}
	}
	
	public int find(int i) {
		// find the root of node i
		Node node_i = nodes.get(i - 1);
		int root_i = node_i.root;
		// System.out.println("Node: " + i + ", root: " + root_i);
		if(i == root_i) {
			return i;
		}
		return find(root_i);
	}
	
	public long size() {
		return this.size;
	}
	
}

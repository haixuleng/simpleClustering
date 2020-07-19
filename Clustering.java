package package1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Clustering {
	public static void main(String args[]) throws FileNotFoundException {
		//LoadText lt = new LoadText("data/input_completeRandom_10_32.txt");
		LoadText lt = new LoadText("data/clustering1.txt");
		ArrayList<Edge> data = lt.get();
		Collections.sort(data);// this sort function has to use comparables
		Clusters c = new Clusters(lt.numOfVer);
		
		// Part 1, merge clusters until the number of clusters reach to limit
		for(Edge i : data) {
			System.out.println(i.vertex1 + ":" + c.find(i.vertex1) + ", " + i.vertex2 + ":" + c.find(i.vertex2) +", " + i.cost);
			
			if(c.size() <= 4) {
				System.out.println("Four clusters left");
				if(c.find(i.vertex1) == c.find(i.vertex2)) {
					continue; // already in a same cluster
				}
				else {
					System.out.println("Largest distance between clusters: " + i.cost);
					break; // job done
				}
			}
			else {
				c.merge(i.vertex1, i.vertex2);
				System.out.println(i.vertex1 + ":" + c.find(i.vertex1) + ", " + i.vertex2 + ":" + c.find(i.vertex2) +", " + i.cost);
				System.out.println("Size of clusters: " + c.size());
			}
		}
	}
}

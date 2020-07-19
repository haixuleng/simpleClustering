package package1;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class TestLoadText {
	public static void main(String args[]) throws FileNotFoundException {
		LoadText lt = new LoadText("data/clustering1.txt");
		ArrayList<Edge> data = lt.get();
		Collections.sort(data);// this sort function has to use comparables
		for(Edge i : data) {
			System.out.println(i.vertex1 + ", " + i.vertex2 + ", " + i.cost);
		}
	}
}

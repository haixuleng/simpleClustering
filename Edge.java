package package1;
import java.util.Comparator;
public class Edge implements Comparable<Edge>{
	int vertex1;
	int vertex2;
	int cost;
	int numberOfVertex;
	public Edge(int vertex1, int vertex2, int cost, int numberOfVertex) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.cost = cost;
		this.numberOfVertex = numberOfVertex;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}

}

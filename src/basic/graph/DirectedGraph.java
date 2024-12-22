package basic.graph;

public class DirectedGraph {

    //directed graph mean got arrow pointing a direction (node)
    // 0 -> 1
    // 1 -> 2
    // 2 -> 3
    // 3 -> 0

    private int[][] matrix;

    public static void main(String[] args) {
        // Create an instance of the graph
        DirectedGraph graph = new DirectedGraph();
        graph.graph(4);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        // Check edges
        System.out.println("Edge between 0 and 1: " + graph.checkEdge(0, 1));
        System.out.println("Edge between 1 and 3: " + graph.checkEdge(1, 3));

        // Show the graph
        graph.showGraph();
    }

    // Initialize the graph with a specified size
    public void graph(int size) {
        matrix = new int[size][size];
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest) {
        if (src >= 0 && dest >= 0 && src < matrix.length && dest < matrix.length) {
            matrix[src][dest] = 1;
        } else {
            System.out.println("Invalid edge: (" + src + ", " + dest + ")");
        }
    }

    // Check if an edge exists
    public boolean checkEdge(int src, int dest) {
        return src >= 0 && dest >= 0 && src < matrix.length && dest < matrix.length && matrix[src][dest] == 1;
    }

    // Display the adjacency matrix of the graph
    public void showGraph() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

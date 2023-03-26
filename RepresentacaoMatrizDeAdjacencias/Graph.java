package MatrizDeAdjacencias;

public class Graph {
    private int vertices; // número de vértices
    private int[][] adjacencyMatrix; // matriz de adjacência

    // construtor
    public Graph(int v) {
        vertices = v;
        adjacencyMatrix = new int[v][v];
    }

    // adiciona uma aresta não direcionada entre os vértices a e b
    public void addEdge(int a, int b) {
        adjacencyMatrix[a][b] = 1;
        adjacencyMatrix[b][a] = 1;
    }

    // exibe a matriz de adjacência
    public void display() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
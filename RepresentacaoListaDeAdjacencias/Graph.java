package ListaDeAdjacencias;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int vertices; // número de vértices
    private List<List<Integer>> adjacencyList; // lista de adjacência

    // construtor
    public Graph(int v) {
        vertices = v;
        adjacencyList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    // adiciona uma aresta não direcionada entre os vértices a e b
    public void addEdge(int a, int b) {
        adjacencyList.get(a).add(b);
        adjacencyList.get(b).add(a);
    }

    // exibe a lista de adjacência
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int v : adjacencyList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}


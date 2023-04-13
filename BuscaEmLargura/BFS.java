package BuscaEmLargura;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;

    public BFS(LinkedList< LinkedList<Integer> > grafo){
        this.grafo = grafo;
        int n = grafo.size();
        cor = new int[n];
        distancia = new int[n];
        ante = new int [n];
    }

    private LinkedList< LinkedList<Integer> > grafo;
    public int[] cor;
    public int[] distancia;
    public int[] ante;
    
    public void BuscaEmLargura(int s) {
        for(int i = 0; i < grafo.size(); i++){
            cor[i] = BRANCO;
            distancia[i] = -1;
            ante[i] = 0;
        }
        cor[s] = CINZA;
        distancia[s] = 0;

        Queue<Integer> fila = new LinkedList<Integer>();
        fila.offer(s);

        while(!fila.isEmpty()) {
            int u = fila.poll();
            LinkedList<Integer> vizinhos = grafo.get(u);
            for(int v : vizinhos) {
                if(cor[v] == BRANCO) {
                    cor[v] = CINZA;
                    distancia[v] = distancia[u] + 1;
                    ante[v] = u;
                    fila.offer(v); 
                }
            }
            cor[u] = PRETO;
        }
    }
  } 
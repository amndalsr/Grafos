package BuscaEmProfundidade;

import java.util.LinkedList;

public class DFS {
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;
    
    public int[] ante;
    public int[] i;
    public int[] f;
    public int[] cor;
    public int tempo = 0;
    private LinkedList<LinkedList<Integer>> grafo;

    public DFS(LinkedList< LinkedList<Integer> > grafo) {
        this.grafo = grafo;
    }
 
    public void dfs_start (int s) {
      int n = grafo.size();
      ante = new int[n];
      i = new int[n];
      f = new int[n];
      cor = new int[n];
      tempo = -1;

      for(int v = 0; v < n; v++) {
        cor[v] = BRANCO;
        i[v] = f[v] = -2;
        ante[v] = -1;
      }
      dfs_visit(s);
    }

    public void dfs_visit(int u) {
      cor[u] = CINZA;
      i[u] = tempo++;

      for (int v : grafo.get(u)) {
        if(cor[v] == BRANCO) {
          ante[v] = u;
          dfs_visit(v);
        }
      }
      cor[u] = PRETO;
      f[u] = tempo++;
    }
  } 
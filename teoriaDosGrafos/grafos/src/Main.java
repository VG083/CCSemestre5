import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo(true); // grafo vazio

        Vertice v1 = new Vertice("A");
        Vertice v2 = new Vertice("B");
        Vertice v3 = new Vertice("C");
        Vertice v4 = new Vertice("D");
        Vertice v5 = new Vertice("E");
        Vertice v6 = new Vertice("F");
        Vertice v7 = new Vertice("G");

        g.addVertice(v1);
        g.addVertice(v2);
        g.addVertice(v3);
        g.addVertice(v4);
        g.addVertice(v5);
        g.addVertice(v6);
        g.addVertice(v7);

        g.addAresta(new Aresta(v1, v2, "A->B"));
        g.addAresta(new Aresta(v2, v3, "B->C"));
        g.addAresta(new Aresta(v3, v4, "C->D"));
        g.addAresta(new Aresta(v4, v5, "D->E"));
        g.addAresta(new Aresta(v5, v6, "E->F"));
        g.addAresta(new Aresta(v6, v7, "F->G"));
        g.addAresta(new Aresta(v7, v1, "G->A"));

        Vertice origem = v1;
        Vertice destino = v5;

        List<Vertice> caminhoProfundidade = g.buscaEmProfundidade(origem, destino);
        if (caminhoProfundidade != null) {
            String caminhoProfundidadeStr = caminhoProfundidade.stream()
                    .map(Vertice::getNome)
                    .collect(Collectors.joining(" -> "));
            System.out.println("Caminho em profundidade entre " + origem.getNome() + " e " + destino.getNome() + ": " + caminhoProfundidadeStr);
        } else {
            System.out.println("Não existe caminho em profundidade entre " + origem.getNome() + " e " + destino.getNome());
        }
    }
}







/*

        // int comprimentoTotal = g.calculoComprimento();
        // System.out.println("Comprimento total do grafo: " + comprimentoTotal);
        List<Vertice> caminho = g.calculoMenorCaminho(origem, destino);
        if (caminho != null) {
            String caminhoStr = caminho.stream()
                    .map(Vertice::getNome)
                    .collect(Collectors.joining(" -> "));
            System.out.println("Caminho entre " + origem.getNome() + " e " + destino.getNome() + ": " + caminhoStr);
        } else {
            System.out.println("Não existe caminho entre " + origem.getNome() + " e " + destino.getNome());
        }

        System.out.println("");

*/
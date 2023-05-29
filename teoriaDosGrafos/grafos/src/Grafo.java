import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    private boolean isDigrafo;
    private int ordem;
    private int tamanho;

    public Grafo(boolean isDigrafo) {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        this.isDigrafo = isDigrafo;
    }

    public Grafo() {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public void addVertice(Vertice vertice){
        vertices.add(vertice);
        ordem++;
    }

    public void addAresta(Aresta aresta){
        arestas.add(aresta);
        tamanho++;
        if (isDigrafo){
            aresta.getOrigem().setGrauOut(aresta.getOrigem().getGrauOut() + 1);
            aresta.getDestino().setGrauIn(aresta.getDestino().getGrauIn() + 1);
        } else {
            aresta.getOrigem().setGrau(aresta.getOrigem().getGrau() + 1);
            aresta.getDestino().setGrau(aresta.getDestino().getGrau() + 1);
        }
    }

    public boolean descobreSeDigrafo(){
        for (Aresta a : arestas){
            if (a.getOrigem() == a.getDestino()) {
                System.out.println("É Digrafo");
                isDigrafo = true;
                return true;
            }
            for (Aresta b : arestas){
                if (a != b && a.getOrigem() == b.getDestino() && a.getDestino() == b.getOrigem()) {
                    System.out.println("É digrafo");
                    isDigrafo = true;
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder infoGrafo = new StringBuilder();

        if (isDigrafo){
            infoGrafo.append("Dígrafo -> Vértices:\n");
            for (Vertice vertice : vertices){
                infoGrafo
                        .append("\n")
                        .append(vertice.getNome())
                        .append(" (grauIn: ")
                        .append(vertice.getGrauIn())
                        .append(", grauOut: ")
                        .append(vertice.getGrauOut())
                        .append(")");
            }
        } else {
            infoGrafo.append("Grafo Ñ direcionado -> Vértices:\n");
            infoGrafo.append(vertices.stream()
                    .map(vertice -> "\n" + vertice.getNome() + " (grau: " + vertice.getGrau() + ")")
                    .collect(Collectors.joining()));
        }
        infoGrafo.append("\n\nArestas: ").append(arestas);
        return infoGrafo.toString();
    }

    public List<Vertice> obtemAdjacencias(Vertice vertice){
        ArrayList<Vertice> adjacencias = new ArrayList<>();
        for (Aresta aresta: arestas){
            if (aresta.getDestino() == vertice && !adjacencias.contains(aresta.getOrigem()))
                adjacencias.add(aresta.getOrigem());
            if (!isDigrafo && aresta.getOrigem() == vertice && !adjacencias.contains(aresta.getDestino()))
                adjacencias.add(aresta.getDestino());
        }
        return adjacencias;
    }
    /*
    public int calculoComprimento() {
        int comprimentoTotal = 0;
        List<Vertice> vertices = this.vertices; // Lista de vértices

        for (int i = 0; i < vertices.size() - 1; i++) {
            Vertice origem = vertices.get(i);
            for (int j = i + 1; j < vertices.size(); j++) {
                Vertice destino = vertices.get(j);
                int comprimento = calculoComprimento(origem, destino);
                if (comprimento >= 0) {
                    comprimentoTotal += comprimento;
                } else {
                    // Caso não exista caminho entre origem e destino, podemos tomar uma ação adequada
                    // Por exemplo, lançar uma exceção ou lidar com o valor -1 de acordo com a necessidade
                }
            }
        }
        return comprimentoTotal;
    }
    */

    public List<Vertice> calculoMenorCaminho(Vertice origem, Vertice destino) {
        List<Vertice> caminho = new ArrayList<>();
        caminho.add(origem);
        boolean encontrado = buscaMenorCaminho(origem, destino, caminho);
        if (encontrado)
            return caminho;
        else
            return null;
    }

    private boolean buscaMenorCaminho(Vertice atual, Vertice destino, List<Vertice> caminho) {
        if (atual == destino)
            return true;

        List<Vertice> adjacencias = obtemAdjacencias(atual);
        for (Vertice adjacente : adjacencias) {
            if (!caminho.contains(adjacente)) {
                caminho.add(adjacente);
                boolean encontrado = buscaMenorCaminho(adjacente, destino, caminho);
                if (encontrado)
                    return true;
                caminho.remove(adjacente);
            }
        }

        return false;
    }

    // Método para realizar uma busca em profundidade no grafo a partir de um vértice de origem até um vértice de destino
    public List<Vertice> buscaEmProfundidade(Vertice origem, Vertice destino) {
        List<Vertice> caminho = new ArrayList<>(); // Cria uma lista vazia para armazenar o caminho percorrido
        caminho.add(origem); // Adiciona o vértice de origem ao caminho
        boolean encontrado = buscaEmProfundidadeRecursiva(origem, destino, caminho); // Chama o método de busca em profundidade recursiva para encontrar o destino a partir da origem
        if (encontrado)
            return caminho; // Retorna o caminho se o destino for encontrado
        else
            return null; // Retorna null se o destino não for encontrado
    }

    // Método recursivo para realizar a busca em profundidade
    private boolean buscaEmProfundidadeRecursiva(Vertice atual, Vertice destino, List<Vertice> caminho) {
        if (atual == destino)
            return true; // Se o vértice atual for o destino, retorna true indicando que o destino foi encontrado
        List<Vertice> adjacencias = obtemAdjacencias(atual); // Obtém os vértices adjacentes ao vértice atual
        for (int i = adjacencias.size() - 1; i >= 0; i--) {
            Vertice adjacente = adjacencias.get(i); // Obtém um vértice adjacente
            Aresta aresta = obtemAresta(atual, adjacente); // Obtém a aresta entre o vértice atual e o vértice adjacente
            if (!caminho.contains(adjacente)) { // Verifica se o vértice adjacente já está no caminho percorrido
                caminho.add(adjacente); // Adiciona o vértice adjacente ao caminho percorrido
                boolean encontrado = buscaEmProfundidadeRecursiva(adjacente, destino, caminho); // Chama recursivamente o método de busca em profundidade para o vértice adjacente
                if (encontrado)
                    return true; // Se o destino for encontrado a partir do vértice adjacente, retorna true
                caminho.remove(adjacente); // Remove o vértice adjacente do caminho percorrido para explorar outras opções
            }
        }
        return false; // Se o destino não for encontrado a partir de nenhum dos vértices adjacentes, retorna false
    }

    private Aresta obtemAresta(Vertice origem, Vertice destino) {
        for (Aresta aresta : arestas) {
            if (aresta.getOrigem() == origem && aresta.getDestino() == destino) {
                return aresta;
            }
            if (!isDigrafo && aresta.getOrigem() == destino && aresta.getDestino() == origem) {
                return aresta;
            }
        }
        return null;
    }

    public void exibeMatrizAdjacencia() {
        int[][] matrizAdjacencia = new int[ordem][ordem];

        for (Aresta aresta : arestas) {
            int origemIndex = vertices.indexOf(aresta.getOrigem());
            int destinoIndex = vertices.indexOf(aresta.getDestino());
            matrizAdjacencia[origemIndex][destinoIndex] = 1;
            if (!isDigrafo) {
                matrizAdjacencia[destinoIndex][origemIndex] = 1;
            }
        }

        System.out.println("Matriz de Adjacência:");
        // Imprime o cabeçalho com os nomes dos vértices no eixo X
        System.out.print("  ");
        for (int i = 0; i < ordem; i++) {
            System.out.print(vertices.get(i).getNome() + " ");
        }
        System.out.println();
        // Imprime a matriz de adjacência com os nomes dos vértices no eixo Y
        for (int i = 0; i < ordem; i++) {
            System.out.print(vertices.get(i).getNome() + " ");
            for (int j = 0; j < ordem; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exibirMatrizIncidencia() {
        int[][] matrizIncidencia = new int[vertices.size()][arestas.size()];

        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < arestas.size(); j++) {
                if (isDigrafo) {
                    if (arestas.get(j).getOrigem().equals(vertices.get(i))) {
                        matrizIncidencia[i][j] = 1;
                        if ((arestas.get(j).getOrigem().equals(vertices.get(i))) == (arestas.get(j).getDestino().equals(vertices.get(i)))){
                            matrizIncidencia[i][j] = 2;
                        }
                    } else if (arestas.get(j).getDestino().equals(vertices.get(i))) {
                        matrizIncidencia[i][j] = -1;
                    }

                } else {
                    if (arestas.get(j).getOrigem().equals(vertices.get(i)) ||
                            arestas.get(j).getDestino().equals(vertices.get(i))) {
                        matrizIncidencia[i][j] = 1;
                    }
                }
            }
        }

        System.out.println("Matriz de incidência:");
        System.out.print("    ");
        for (int i = 0; i < arestas.size(); i++) {
            System.out.print(arestas.get(i).getNome() + "\t");
        }
        System.out.println("");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).getNome() + "\t");
            for (int j = 0; j < arestas.size(); j++) {
                System.out.print(matrizIncidencia[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

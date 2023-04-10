public class Aresta {
    public Aresta(Vertice v1, Vertice v2) {
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    private Vertice origem;

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    private Vertice destino;

    public String toString(){
        return "("+ origem.getNome() + "," + destino.getNome() + ")";
    }
}
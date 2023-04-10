public class Aresta {
    private Vertice origem;
    private Vertice destino;

    private String nome;

    public Aresta(Vertice origem, Vertice destino, String nome) {
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public String toString() {
        return "(" + origem.getNome() + "," + destino.getNome() + ")";
    }
}

public class Vertice {
    private String nome;
    private int grau;
    private int grauIn;
    private int grauOut;

    public Vertice(String nome) {
        this.nome = nome;
    }

    public Vertice(String nome, int grau, int grauIn, int grauOut) {
        this.nome = nome;
        this.grau = grau;
        this.grauIn = grauIn;
        this.grauOut = grauOut;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public int getGrauIn() {
        return grauIn;
    }

    public void setGrauIn(int grauIn) {
        this.grauIn = grauIn;
    }

    public int getGrauOut() {
        return grauOut;
    }

    public void setGrauOut(int grauOut) {
        this.grauOut = grauOut;
    }

    public String toString() {
        return nome + " (grau: " + grau + ")";
    }
}
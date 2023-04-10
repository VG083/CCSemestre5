
public class Vertice {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    private int grau;

    public int getGrauIn() {
        return grauIn;
    }

    public void setGrauIn(int grauIn) {
        this.grauIn = grauIn;
    }

    private int grauIn;

    public int getGrauOut() {
        return grauOut;
    }

    public void setGrauOut(int grauOut) {
        this.grauOut = grauOut;
    }

    private int grauOut;

    public Vertice(String nome){
        this.nome = nome;
    }

    public String toString(){
        return nome + " (grau: " + grau + ")";
    }
}
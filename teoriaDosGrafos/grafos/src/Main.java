import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grafo g = new Grafo(true);
        Vertice vu = new Vertice("u");
        Vertice vv = new Vertice("v");
        Vertice vw = new Vertice("w");
        Vertice vx = new Vertice("x");
        Vertice vy = new Vertice("y");
        g.addVertice(vu);
        g.addVertice(vv);
        g.addVertice(vw);
        g.addVertice(vx);
        g.addVertice(vy);

        Aresta aa = new Aresta(vu,vu, "a");
        Aresta ab = new Aresta(vv,vw, "b");
        Aresta ac = new Aresta(vw,vx, "c");
        Aresta ad = new Aresta(vv,vx, "d");
        Aresta ae = new Aresta(vw,vx, "e");
        Aresta af = new Aresta(vu,vx, "f");
        Aresta ag = new Aresta(vx,vy, "g");
        g.addAresta(aa);
        g.addAresta(ab);
        g.addAresta(ac);
        g.addAresta(ad);
        g.addAresta(ae);
        g.addAresta(af);
        g.addAresta(ag);



        int opcao = 0;
        do {
            interagirComUsuario();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    limparTela();
                    System.out.println(g.toString());
                    pausar();
                    break;
                case 2:
                    limparTela();
                    g.exibeMatrizAdjacencia();
                    pausar();
                    break;
                case 3:
                    limparTela();
                    g.exibirMatrizIncidencia();
                    pausar();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    pausar();
                    break;
            }
        } while (opcao != 4);
    }

    private static void interagirComUsuario() {
        System.out.println("Digite uma opção:");
        System.out.println("1 - Exibir grafo");
        System.out.println("2 - Exibir matriz de adjacência");
        System.out.println("3 - Exibir matriz de incidência");
        System.out.println("4 - Sair");
    }

    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void pausar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPressione Enter para continuar...");
        scanner.nextLine();
    }
}

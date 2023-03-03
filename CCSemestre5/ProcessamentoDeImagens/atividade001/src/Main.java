import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int otimo = 0, bom = 0, regular = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a opinião do espectador " + i + " (1-regular, 2-bom ou 3-ótimo): ");
            int opiniao = scanner.nextInt();

            switch (opiniao) {
                case 1:
                    regular++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    otimo++;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    i--;
            }
        }

        System.out.println("Quantidade de pessoas que responderam ótimo: " + otimo);
        System.out.println("Quantidade de pessoas que responderam bom: " + bom);
        System.out.println("Quantidade de pessoas que responderam regular: " + regular);
    }
}
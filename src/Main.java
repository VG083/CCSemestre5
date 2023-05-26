import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String caminho = "C:\\Users\\autologon\\IdeaProjects\\ProcessamentoDeImagens\\src\\images\\";
            //String foto = "mamografia.png";
            //String foto = "ressonancia-craniana.jpg";
            //String foto = "exame-urina.jpg";
            //String foto = "exame-urina2.jpg";
            //String foto = "exame-urina3.jpg";
            //String foto = "microbiota.jpg";
            //String foto = "teste.png";
            //String foto = "teste2.png";
            String foto = "teste3.png";


            BufferedImage imagem = Funcionalidades.lerImagem(new File(caminho + foto));
            int altura = imagem.getHeight();
            int largura = imagem.getWidth();

            CriarFiltro.bandaRed(caminho, imagem, altura, largura);
            CriarFiltro.bandaGreen(caminho, imagem, altura, largura);
            CriarFiltro.bandaBlue(caminho, imagem, altura, largura);
            CriarFiltro.cinzaBandaRed(caminho, imagem, altura, largura);
            CriarFiltro.cinzaBandaGreen(caminho, imagem, altura, largura);
            CriarFiltro.cinzaBandaBlue(caminho, imagem, altura, largura);
            CriarFiltro.cinzaMedio(caminho, imagem, altura, largura);
            CriarFiltro.aumTon(caminho, imagem, altura, largura);
            CriarFiltro.dimTon(caminho, imagem, altura, largura);
            CriarFiltro.negativo(caminho, imagem, altura, largura);
            CriarFiltro.brilhoAdd(caminho, imagem, altura, largura);
            CriarFiltro.brilhoMtt(caminho, imagem, altura, largura);
            CriarFiltro.binarizar(caminho, imagem, altura, largura);
            CriarFiltro.removerRuido(caminho, imagem, altura, largura);
            CriarFiltro.filtroMedia(caminho, imagem, altura, largura);
            CriarFiltro.filtroMediana(caminho, imagem, altura, largura);



            System.out.println("Fim do Código");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
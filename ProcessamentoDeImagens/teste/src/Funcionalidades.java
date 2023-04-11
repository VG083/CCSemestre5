import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Funcionalidades {
    public static void salvarImagem(BufferedImage imagem, File path) throws IOException {
        try{
            if (ImageIO.write(imagem,"png", path))
                System.out.println("Imagem salva com sucesso");
            else System.out.println("Erro ao salvar a imagem");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static BufferedImage lerImagem(File arquivo) throws IOException {
        return ImageIO.read(arquivo);
    }
    public static void capturarRgbDeCadaPixel(BufferedImage imagem, int altura, int largura){
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                int rgbPixel = imagem.getRGB(coluna, linha);
                Color corPixel = new Color(rgbPixel);
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                System.out.println("Pixel [" + coluna + "," + linha + "] = " + red + "," + green + "," + blue);
            }
        }
    }
}
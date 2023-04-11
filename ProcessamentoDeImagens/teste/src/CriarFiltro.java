import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CriarFiltro {
    public static void bandaRed(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        // Criando uma cópia
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                Color novaCor = new Color(corPixel.getRed(), 0, 0);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemComBandaRed.png"));
    }
    public static void bandaGreen(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                Color novaCor = new Color(0, corPixel.getGreen(), 0);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemComBandaGreen.png"));
    }
    public static void bandaBlue(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                Color novaCor = new Color(0,0,corPixel.getBlue());
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemComBandaBlue.png"));
    }
    public static void cinzaBandaRed(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                Color novaCor = new Color(red,red,red);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemCinzaBandaRed.png"));
    }
    public static void cinzaBandaGreen(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int green = corPixel.getGreen();
                Color novaCor = new Color(green,green,green);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemCinzaBandaGreen.png"));
    }
    public static void cinzaBandaBlue(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int blue = corPixel.getBlue();
                Color novaCor = new Color(blue,blue,blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemCinzaBandaBlue.png"));
    }
    public static void cinzaMedio(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                int media = (red + green + blue)/3;
                Color novaCor = new Color(media,media,media);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemCinzaMedio.png"));
    }
    public static void aumTon(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                red = Math.min(red + 100, 255);
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                Color novaCor = new Color(red,green,blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemAumTon.png"));
    }
    public static void dimTon(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                blue = Math.max(blue - 100, 0);
                Color novaCor = new Color(red,green,blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemDimTon.png"));
    }
    public static void negativo(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                Color novaCor = new Color(255-red,255-green,255-blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemNegativo.png"));
    }
    public static void brilhoAdd(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                red = Math.min(red + 100, 255);
                green = Math.min(green + 100, 255);
                blue = Math.min(blue + 100, 255);
                Color novaCor = new Color(red,green,blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemBrilhoAdd.png"));
    }
    public static void brilhoMtt(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                red = Math.min(red * 2, 255);
                green = Math.min(green * 2, 255);
                blue = Math.min(blue * 2, 255);
                Color novaCor = new Color(red,green,blue);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemBrilhoMtt.png"));
    }
    public static void binarizar(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for(int linha = 0; linha < altura; linha++){
            for(int coluna = 0; coluna < largura; coluna++){
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                int media = (red + green + blue)/3;
                if (media >= 128){
                    Color novaCor = new Color(0,0,0);
                    novaImagem.setRGB(coluna, linha, novaCor.getRGB());
                }else{
                    Color novaCor = new Color(255,255,255);
                    novaImagem.setRGB(coluna, linha, novaCor.getRGB());
                }
            }
        }
        Funcionalidades.salvarImagem(novaImagem, new File(caminho+"imagemBinarizada.png"));
    }

}

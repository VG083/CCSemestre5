import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
                if (media >= 186){
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

    public static void removerRuido(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        int[][] matriz = new int[altura][largura];

        // Converter a imagem em escala de cinza
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                Color corPixel = new Color(novaImagem.getRGB(coluna, linha));
                int red = corPixel.getRed();
                int green = corPixel.getGreen();
                int blue = corPixel.getBlue();
                int gray = (red + green + blue) / 3;
                matriz[linha][coluna] = gray;
            }
        }

        // Aplicar o filtro de média
        int[][] novaMatriz = new int[altura][largura];
        int raio = 1; // Raio do filtro de média (ajuste de acordo com a intensidade do ruído)
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                int soma = 0;
                int quantidadePixels = 0;

                // Calcular a média dos pixels vizinhos
                for (int i = -raio; i <= raio; i++) {
                    for (int j = -raio; j <= raio; j++) {
                        int novaLinha = linha + i;
                        int novaColuna = coluna + j;

                        if (novaLinha >= 0 && novaLinha < altura && novaColuna >= 0 && novaColuna < largura) {
                            soma += matriz[novaLinha][novaColuna];
                            quantidadePixels++;
                        }
                    }
                }

                // Calcular o valor médio e atribuir à nova matriz
                int media = soma / quantidadePixels;
                novaMatriz[linha][coluna] = media;
            }
        }

        // Converter a matriz de volta para a imagem
        for (int linha = 0; linha < altura; linha++) {
            for (int coluna = 0; coluna < largura; coluna++) {
                int gray = novaMatriz[linha][coluna];
                Color novaCor = new Color(gray, gray, gray);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }

        // Salvar a nova imagem
        Funcionalidades.salvarImagem(novaImagem, new File(caminho + "imagemSemRuido.png"));
    }

    public static void filtroMediana(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for (int linha = 1; linha < altura - 1; linha++) {
            for (int coluna = 1; coluna < largura - 1; coluna++) {
                int[] redPixels = new int[9];
                int[] greenPixels = new int[9];
                int[] bluePixels = new int[9];
                int index = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        Color corPixel = new Color(imagem.getRGB(coluna + j, linha + i));
                        redPixels[index] = corPixel.getRed();
                        greenPixels[index] = corPixel.getGreen();
                        bluePixels[index] = corPixel.getBlue();
                        index++;
                    }
                }

                Arrays.sort(redPixels);
                Arrays.sort(greenPixels);
                Arrays.sort(bluePixels);

                int redMediana = redPixels[4];
                int greenMediana = greenPixels[4];
                int blueMediana = bluePixels[4];

                Color novaCor = new Color(redMediana, greenMediana, blueMediana);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }

        Funcionalidades.salvarImagem(novaImagem, new File(caminho + "imagemMediana.png"));
    }

    public static void filtroMedia(String caminho, BufferedImage imagem, int altura, int largura) throws IOException {
        int[][] matrizFiltro = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        BufferedImage novaImagem = new BufferedImage(imagem.getColorModel(), imagem.copyData(null), imagem.getColorModel().isAlphaPremultiplied(), null);
        for (int linha = 1; linha < altura - 1; linha++) {
            for (int coluna = 1; coluna < largura - 1; coluna++) {
                int redSum = 0;
                int greenSum = 0;
                int blueSum = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        Color corPixel = new Color(imagem.getRGB(coluna + j, linha + i));
                        redSum += corPixel.getRed() * matrizFiltro[i + 1][j + 1];
                        greenSum += corPixel.getGreen() * matrizFiltro[i + 1][j + 1];
                        blueSum += corPixel.getBlue() * matrizFiltro[i + 1][j + 1];
                    }
                }

                int redMedia = redSum / 9;
                int greenMedia = greenSum / 9;
                int blueMedia = blueSum / 9;

                Color novaCor = new Color(redMedia, greenMedia, blueMedia);
                novaImagem.setRGB(coluna, linha, novaCor.getRGB());
            }
        }

        Funcionalidades.salvarImagem(novaImagem, new File(caminho + "imagemFiltradaMedia.png"));
    }




}
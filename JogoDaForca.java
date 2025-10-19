package section_9;
import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavrasecreta = "JAVA";
        char[] palavraoculta = new char[palavrasecreta.length()];

        // Preenche com underline
        for (int i = 0; i < palavrasecreta.length(); i++) {
            palavraoculta[i] = '_';
        }

        int tentativas = 6;
        boolean venceu = false;

        while (tentativas > 0 && !venceu) {
            System.out.println("Palavra: " + Arrays.toString(palavraoculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean acertou = false;

            for (int i = 0; i < palavrasecreta.length(); i++) {
                if (palavrasecreta.charAt(i) == letra) {
                    palavraoculta[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta!");
            } else {
                System.out.println("Você acertou uma letra!");
            }

            // Verifica vitória
            if (new String(palavraoculta).equals(palavrasecreta)) {
                venceu = true;
            }
        }

        if (venceu) {
            System.out.println("\n🎉 Parabéns! Você acertou a palavra: " + palavrasecreta);
        } else {
            System.out.println("\n💀 Fim de jogo! A palavra era: " + palavrasecreta);
        }

        scanner.close();
    }
}

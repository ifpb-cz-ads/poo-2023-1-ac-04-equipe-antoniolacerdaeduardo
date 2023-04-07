import java.util.Scanner;

public class CTQuestao01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        if (idade < 16) {
            System.out.println("Voce ainda nao tem idade para votar.");
        }
        else if (idade < 18 || idade > 65) {
            System.out.println("Votar, para voce, eh facultativo.");
        }
        else {
            System.out.println("Seu voto eh obrigatorio.");
        }
    }
}
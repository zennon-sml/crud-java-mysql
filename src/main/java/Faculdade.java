import escolha.Escolha;
import excecoes.NumeroNaoListado;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------\nBEM VINDO(A) (:\n");
        System.out.print("1 - Entrar\n2 - Sair\nR: ");
        int resposta = input.nextInt();

        try {
            if (resposta == 1) {
                Escolha esc = new Escolha();
                esc.menu();
            }
            else if (resposta == 2) {
                System.out.println("Finalizando...");
                return;
            } else {throw new NumeroNaoListado(resposta);}

        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            main(args);
        }
    }
}


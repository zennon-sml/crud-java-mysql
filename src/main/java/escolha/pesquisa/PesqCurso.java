package escolha.pesquisa;

import consultas.SelectAll;
import printar.PrintAll;

import java.util.Scanner;

public class PesqCurso implements IPesquisa{
    Scanner input = new Scanner(System.in);
    @Override
    public void printAll() {
        PrintAll.printAllCurso(SelectAll.selectAllCurso());
    }

    @Override
    public void infos() {
        System.out.print("* Qual o ID do curso que você deseja saber as informações\nR: ");
        int cursoid = input.nextInt();
    }
}

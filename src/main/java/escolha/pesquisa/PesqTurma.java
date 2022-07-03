package escolha.pesquisa;

import consultas.SelectAll;
import printar.PrintAll;

import java.util.Scanner;

public class PesqTurma implements IPesquisa{
    Scanner input = new Scanner(System.in);
    @Override
    public void printAll() {
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
    }

    @Override
    public void infos() {
        System.out.print("* Qual o ID da turma que você deseja saber as informações\nR: ");
        int turmaid = input.nextInt();
    }
}

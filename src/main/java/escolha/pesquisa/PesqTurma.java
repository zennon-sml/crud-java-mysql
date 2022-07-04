package escolha.pesquisa;

import consultas.SelectAll;
import consultas.SelectById;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class PesqTurma implements IPesquisa{
    Scanner input = new Scanner(System.in);
    PrintById pb = new PrintById();
    @Override
    public void printAll() {
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
    }

    @Override
    public void infos() {
        System.out.print("\n* Qual o ID da turma que você deseja saber as informações\nR: ");
        int turmaid = input.nextInt();
        try {
            System.out.println("--------------------------\nINFORMAÇÕES DA TURMA\n");
            System.out.println("Carregando...");
            pb.printInfo(SelectById.selectTurma(turmaid));
        }catch (NullPointerException e) {
            System.out.println("ID não encontrado, tente outro!!");
            infos();
        }
    }
}

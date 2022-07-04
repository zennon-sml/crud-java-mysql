package escolha.pesquisa;

import consultas.SelectAll;
import consultas.SelectById;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class PesqDisciplina implements IPesquisa{
    Scanner input = new Scanner(System.in);
    PrintById pb = new PrintById();
    @Override
    public void printAll(){
    PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
}

    @Override
    public void infos() {
        System.out.print("\n* Qual o ID da disciplina que você deseja saber as informações\nR: ");
        int disciplinaid = input.nextInt();
        try {
            System.out.println("--------------------------\nINFORMAÇÕES DA DISCIPLINA\n");
            System.out.println("Carregando...");
            pb.printInfo(SelectById.selectDisciplina(disciplinaid));
        }catch (NullPointerException e) {
            System.out.println("ID não encontrado, tente outro!!");
            infos();
        }
    }

}

package escolha.pesquisa;

import consultas.SelectAll;
import consultas.SelectById;
import printar.PrintAll;
import printar.PrintById;
import java.util.Scanner;

public class PesqAluno implements IPesquisa{
    Scanner input = new Scanner(System.in);
    PrintById pb = new PrintById();
    @Override
    public void printAll(){
        PrintAll.printAllAluno(SelectAll.selectAllAluno());
    }
    @Override
    public void infos(){
        System.out.print("\n* Qual o ID do aluno que você deseja saber as informações\nR: ");
        int alunoid = input.nextInt();
        try {
            System.out.println("--------------------------\nINFORMAÇÕES DO ALUNO\n");
            System.out.println("Carregando...");
            pb.printInfo(SelectById.selectAluno(alunoid));
        }catch (NullPointerException e){
            System.out.println("ID não encontrado, tente outro!!");
            infos();
        }

    }
}

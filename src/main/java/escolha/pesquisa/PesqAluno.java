package escolha.pesquisa;

import consultas.SelectAll;
import printar.PrintAll;

import java.util.Scanner;

public class PesqAluno implements IPesquisa{
    Scanner input = new Scanner(System.in);
    @Override
    public void printAll(){
        PrintAll.printAllAluno(SelectAll.selectAllAluno());
    }
    @Override
    public void infos(){
        System.out.print("* Qual o ID do aluno que você deseja saber as informações\nR: ");
        int alunoid = input.nextInt();

    }
}

package escolha.pesquisa;

import consultas.SelectAll;
import printar.PrintAll;

import java.util.Scanner;

public class PesqDisciplina implements IPesquisa{
    Scanner input = new Scanner(System.in);
    @Override
    public void printAll(){
    PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
}

    @Override
    public void infos() {
        System.out.print("* Qual o ID da disciplina que você deseja saber as informações\nR: ");
        int disciplinaid = input.nextInt();
    }

}

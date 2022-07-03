package escolha.pesquisa;

import consultas.SelectAll;
import printar.PrintAll;

import java.util.Scanner;

public class PesqProfessor implements IPesquisa{
    Scanner input = new Scanner(System.in);
    @Override
    public void printAll(){
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
    }

    @Override
    public void infos() {
        System.out.print("* Qual o ID do professor que você deseja saber as informações\nR: ");
        int professorid = input.nextInt();

    }
}

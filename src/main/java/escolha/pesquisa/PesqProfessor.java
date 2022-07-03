package escolha.pesquisa;

import consultas.SelectAll;
import consultas.SelectById;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class PesqProfessor implements IPesquisa{
    Scanner input = new Scanner(System.in);
    PrintById pb = new PrintById();
    @Override
    public void printAll(){
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
    }

    @Override
    public void infos() {
        System.out.print("* Qual o ID do professor que você deseja saber as informações\nR: ");
        int professorid = input.nextInt();
        try {
            pb.printInfo(SelectById.selectProfessor(professorid));
        }catch (NullPointerException e){
            System.out.println("ID não encontrado, tente outro!!");
            infos();
        }

    }
}

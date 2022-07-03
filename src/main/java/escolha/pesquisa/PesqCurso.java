package escolha.pesquisa;

import consultas.SelectAll;
import consultas.SelectById;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class PesqCurso implements IPesquisa{
    Scanner input = new Scanner(System.in);
    PrintById pb = new PrintById();
    @Override
    public void printAll() {
        PrintAll.printAllCurso(SelectAll.selectAllCurso());
    }

    @Override
    public void infos() {
        System.out.print("* Qual o ID do curso que você deseja saber as informações\nR: ");
        int cursoid = input.nextInt();
        try {
            pb.printInfo(SelectById.selectCurso(cursoid));
        }catch (NullPointerException e) {
            System.out.println("ID não encontrado, tente outro!!");
            infos();
        }

    }
}

package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
import entidades.Curso;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDCurso {
    Curso curso = new Curso();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();
    public void createCurso() {
        System.out.println("CREATE CURSO");
        System.out.print("Codigo: ");
        curso.setCodigo(input.nextInt());
        System.out.print("Nome: ");
        curso.setNome(input.nextLine());
        System.out.print("Descrição: ");
        curso.setDescricao(input.nextLine());
        System.out.print("Numero de Periodos: ");
        curso.setNumeroPeriodos(input.nextInt());
    }
    public void readCurso(){
        System.out.println("Digite o ID do Curso que deseja ver:\nR: ");
        int cursoid = inputInt.nextInt();
        pb.printCurso(SelectById.selectCurso(cursoid));
    }
    public void updateCurso(){

    }
    public void deleteCurso(){

    }

    public void printAllCurso () {
        PrintAll.printAllCurso(SelectAll.selectAllCurso());
    }
}

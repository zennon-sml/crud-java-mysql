package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
import entidades.Turma;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDTurma {
    Turma turma = new Turma();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();

    public void createTurma() {
        System.out.println("CREATE TURMA");
        System.out.print("Codigo: ");
        turma.setCodigo(input.nextInt());
        System.out.print("Sala: ");
        turma.setSala(input.nextLine());
        System.out.print("Horario: ");
        turma.setHorario(input.nextLine());
    }
    public void readTurma(){
        System.out.println("Digite o ID do Professor que Turma ver:\nR: ");
        int turmaid = inputInt.nextInt();
        pb.printTurma(SelectById.selectTurma(turmaid));
    }
    public void updateTurma(){

    }
    public void deleteTurma(){

    }
    public void printAllTurma(){
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
    }
}

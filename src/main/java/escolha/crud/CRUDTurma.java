package escolha.crud;

import entidades.Turma;

import java.util.Scanner;

public class CRUDTurma {
    Turma turma = new Turma();
    Scanner input = new Scanner(System.in);

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

    }
    public void updateTurma(){

    }
    public void deleteTurma(){

    }
}

package escolha;

import entidades.Aluno;
import escolha.crud.CRUDAluno;
import escolha.crud.CRUDProfessor;

import java.util.Scanner;

public class Escolha {
    Scanner input = new Scanner(System.in);
    public void aluno(){
        CRUDAluno al = new CRUDAluno();

        System.out.println("Escolheu aluno");
        System.out.print("1-Novo Aluno\n2-Carregar Aluno\n3-Update Aluno\n4-Delete Aluno\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){al.createAluno();}
        else if (escolha == 2) {al.readAluno();}
        else if (escolha == 3) {al.updateAluno();}
        else if (escolha == 4) {al.deleteAluno();}
    }
    public void professor(){
        CRUDProfessor pr = new CRUDProfessor();

        System.out.println("Escolheu professor");
        System.out.print("1-Novo Professor\n2-Carregar Professor\n3-Update Professor\n4-Delete Professor\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){pr.createProfessor();}
        else if (escolha == 2) {pr.readProfessor();}
        else if (escolha == 3) {pr.updateProfessor();}
        else if (escolha == 4) {pr.deleteProfessor();}
    }
}

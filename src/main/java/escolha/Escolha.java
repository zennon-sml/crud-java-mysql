package escolha;

import entidades.Aluno;
import escolha.crud.*;

import java.util.Scanner;

public class Escolha {
    Scanner input = new Scanner(System.in);
    public void aluno(){
        CRUDAluno al = new CRUDAluno();

        System.out.println("Escolheu aluno");
        System.out.print("1-Novo Aluno\n2-Carregar Aluno\n3-Update Aluno\n4-Delete Aluno\n5-Mostrar todos Os Alunos\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){al.createAluno();}
        else if (escolha == 2) {al.readAluno();}
        else if (escolha == 3) {al.updateAluno();}
        else if (escolha == 4) {al.deleteAluno();}
        else if (escolha == 5) {al.printAllAluno();}
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

    public void disciplina(){
        CRUDDisciplina dis = new CRUDDisciplina();

        System.out.println("Escolheu disciplina");
        System.out.print("1-Nova Disciplina\n2-Carregar Disciplina\n3-Update Disciplina\n4-Delete Disciplina\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){dis.createDisciplina();}
        else if (escolha == 2) {dis.readDisciplina();}
        else if (escolha == 3) {dis.updateDisciplina();}
        else if (escolha == 4) {dis.deleteDisciplina();}

    }
    public void curso(){
        CRUDCurso cur = new CRUDCurso();

        System.out.println("Escolheu Curso");
        System.out.print("1-Novo Curso\n2-Carregar Curso\n3-Update Curso\n4-Delete Curso\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){cur.createCurso();}
        else if (escolha == 2) {cur.readCurso();}
        else if (escolha == 3) {cur.updateCurso();}
        else if (escolha == 4) {cur.deleteCurso();}

    }
    public void turma(){
        CRUDTurma tu = new CRUDTurma();

        System.out.println("Escolheu Turma");
        System.out.print("1-Nova Turma\n2-Carregar Turma\n3-Update Turma\n4-Delete Turma\nR: ");
        int escolha = input.nextInt();

        if (escolha == 1){tu.createTurma();}
        else if (escolha == 2) {tu.readTurma();}
        else if (escolha == 3) {tu.updateTurma();}
        else if (escolha == 4) {tu.deleteTurma();}

    }
}

package escolha;

import entidades.Aluno;
import escolha.crud.*;
import escolha.pesquisa.*;
import excecoes.NumeroNaoListado;
import java.util.Scanner;

public class Escolha {
    Scanner input = new Scanner(System.in);

    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------\nMENU\n");
        System.out.print("1 - CRUD's\n2 - Consultas\n9 - Sair\nR: ");
        int resposta = input.nextInt();

        try {
            if (resposta == 1) {menuCRUD();}
            else if (resposta == 2) {menuEscolha();}
            else if (resposta == 9) {
                System.out.println("Saindo...");
                System.exit(0);
            } else {throw new NumeroNaoListado(resposta);}

        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            menu();
        }
    }

    public void menuEscolha(){
        System.out.println("--------------------------\nMENU CONSULTAS\n");
        System.out.print("1 - Aluno\n2 - Professor\n3 - Disciplina\n4 - Curso\n5 - Turma\n9 - Voltar\nR: ");
        int resposta = input.nextInt();

        try {
            if (resposta == 1){pAluno();}
            else if (resposta == 2) {pProfessor();}
            else if (resposta == 3) {pDisciplina();}
            else if (resposta == 4) {pCurso();}
            else if (resposta == 5) {pTurma();}
            else if (resposta == 9) {
                System.out.println("Voltando...");
                menu();
            }else {throw new NumeroNaoListado(resposta);}
        }catch (NumeroNaoListado e){
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            menuEscolha();
        }
    }

    public void pAluno(){
        PesqAluno pa = new PesqAluno();
        System.out.println("--------------------------\nCONSULTA ALUNO\n");
        System.out.println("Carregando...");

        pa.printAll();
        pa.infos();
        voltarPesquisa();
    }
    public void pProfessor(){
        PesqProfessor pp = new PesqProfessor();
        System.out.println("--------------------------\nCONSULTA PROFESSOR\n");
        System.out.println("Carregando...");

        pp.printAll();
        pp.infos();
        voltarPesquisa();
    }
    public void pDisciplina(){
        PesqDisciplina pd = new PesqDisciplina();
        System.out.println("--------------------------\nCONSULTA DISCIPLINA\n");
        System.out.println("Carregando...");

        pd.printAll();
        pd.infos();
        voltarPesquisa();
    }
    public void pCurso(){
        PesqCurso pc = new PesqCurso();
        System.out.println("--------------------------\nCONSULTA CURSO\n");
        System.out.println("Carregando...");

        pc.printAll();
        pc.infos();
        voltarPesquisa();
    }
    public void pTurma(){
        PesqTurma pt = new PesqTurma();
        System.out.println("--------------------------\nCONSULTA TURMA\n");
        System.out.println("Carregando...");

        pt.printAll();
        pt.infos();
        voltarPesquisa();
    }

    public void menuCRUD(){
        System.out.println("--------------------------\nMENU CRUD\n");
        System.out.print("1 - Aluno\n2 - Professor\n3 - Disciplina\n4 - Curso\n5 - Turma\n9 - Voltar\nR: ");
        int resposta = input.nextInt();

        try {
            if (resposta == 1) {
                aluno();
            } else if (resposta == 2) {
                professor();
            } else if (resposta == 3) {
                disciplina();
            } else if (resposta == 4) {
                curso();
            } else if (resposta == 5) {
                turma();
            } else if (resposta == 9) {
                System.out.println("Voltando...");
                menu();
            }else {throw new NumeroNaoListado(resposta);}
        }catch (NumeroNaoListado e){
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            menuCRUD();
        }
    }
    public void aluno(){
        CRUDAluno al = new CRUDAluno();

        System.out.println("--------------------------\nCRUD ALUNO\n");
        System.out.print("1 - Novo Aluno\n2 - Carregar Aluno\n3 - Update Aluno\n4 - Delete Aluno\n5 - Mostrar todos Os Alunos\n9 - Voltar\nR: ");
        int escolha = input.nextInt();

        try {
            if (escolha == 1) {al.create();}
            else if (escolha == 2) {al.read();}
            else if (escolha == 3) {al.update();}
            else if (escolha == 4) {al.delete();}
            else if (escolha == 5) {al.printAll();}
            else if (escolha == 9) {menuCRUD();}
            else {throw new NumeroNaoListado(escolha);}
        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            aluno();
        }
    }
    public void professor(){
        CRUDProfessor pr = new CRUDProfessor();

        System.out.println("--------------------------\nCRUD PROFESSOR\n");
        System.out.print("1 - Novo Professor\n2 - Carregar Professor\n3 - Update Professor\n4 - Delete Professor\n5 - Mostrar todos Os Professores\n6 - Criar Orientação\n9 - Voltar\nR: ");
        int escolha = input.nextInt();

        try{
            if (escolha == 1){pr.create();}
            else if (escolha == 2) {pr.read();}
            else if (escolha == 3) {pr.update();}
            else if (escolha == 4) {pr.delete();}
            else if (escolha == 5) {pr.printAll();}
            else if(escolha == 6){pr.orientacao();}
            else if (escolha == 9) {menuCRUD();}
            else {throw new NumeroNaoListado(escolha);}
        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            professor();
        }
    }

    public void disciplina(){
        CRUDDisciplina dis = new CRUDDisciplina();

        System.out.println("--------------------------\nCRUD DISCIPLINA\n");
        System.out.print("1 - Nova Disciplina\n2 - Carregar Disciplina\n3 - Update Disciplina\n4 - Delete Disciplina\n5 - Mostrar todos As Disciplinas\n9 - Voltar\nR: ");
        int escolha = input.nextInt();

        try{
            if (escolha == 1){dis.create();}
            else if (escolha == 2) {dis.read();}
            else if (escolha == 3) {dis.update();}
            else if (escolha == 4) {dis.delete();}
            else if (escolha == 5) {dis.printAll();}
            else if (escolha == 9) {menuCRUD();}
            else {throw new NumeroNaoListado(escolha);}
        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            disciplina();
        }
    }
    public void curso(){
        CRUDCurso cur = new CRUDCurso();

        System.out.println("--------------------------\nCRUD CURSO\n");
        System.out.print("1 - Novo Curso\n2 - Carregar Curso\n3 - Update Curso\n4 - Delete Curso\n5 - Mostrar todos Os Cursos\n9 - Voltar\nR: ");
        int escolha = input.nextInt();

        try{
            if (escolha == 1){cur.create();}
            else if (escolha == 2) {cur.read();}
            else if (escolha == 3) {cur.update();}
            else if (escolha == 4) {cur.delete();}
            else if (escolha == 5) {cur.printAll();}
            else if (escolha == 9) {menuCRUD();}
            else {throw new NumeroNaoListado(escolha);}

        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            curso();
        }
    }
    public void turma(){
        CRUDTurma tu = new CRUDTurma();

        System.out.println("--------------------------\nCRUD TURMA\n");
        System.out.print("1 - Nova Turma\n2 - Carregar Turma\n3 - Update Turma\n4 - Delete Turma\n5 - Mostrar todos As Turmas\n6 - Adicionar Aluno a turma\n9 - Voltar\nR: ");
        int escolha = input.nextInt();

        try{
            if (escolha == 1){tu.create();}
            else if (escolha == 2) {tu.read();}
            else if (escolha == 3) {tu.update();}
            else if (escolha == 4) {tu.delete();}
            else if (escolha == 5) {tu.printAll();}
            else if (escolha == 6) {tu.aluTur();}
            else if (escolha == 9) {menuCRUD();}
            else {throw new NumeroNaoListado(escolha);}

        }catch (NumeroNaoListado e) {
            e.printStackTrace();
            System.out.println("Escolha uma das opções disponiveis!!");
            turma();
        }

    }
    public void voltarPesquisa(){
        do {
            System.out.print("--------------------------\n9 - Voltar\n0 - Menu\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    menuEscolha();
                } else if (escolha == 0) {
                    menu();
                } else {
                    throw new NumeroNaoListado(escolha);
                }
            } catch (NumeroNaoListado e) {
                e.getMessage();
                System.out.println("Escolha uma das opções disponiveis!!");
            }
        }while (true);
    }
}

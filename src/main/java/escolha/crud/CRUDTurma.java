package escolha.crud;

import consultas.*;
import entidades.Professor;
import entidades.Turma;
import escolha.Escolha;
import excecoes.NumeroNaoListado;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDTurma implements ICRUD{
    Turma turma = new Turma();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();
    Delete dl = new Delete();

    Escolha esc = new Escolha();


    @Override
    public void create() {
        System.out.println("--------------------------\nNOVA TURMA\n");
        System.out.print("Codigo: ");
        turma.setCodigo(inputInt.nextInt());
        System.out.print("Sala: ");
        turma.setSala(input.nextLine());
        System.out.print("Horario: ");
        turma.setHorario(input.nextLine());

        System.out.print("Escolha o ID do professor da turma: ");
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
        System.out.print("Professor ID: ");
        int fk_professor = inputInt.nextInt();

        System.out.print("Escolha o ID da disciplina da turma: ");
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
        System.out.print("Disciplina ID: ");
        int fk_disciplina = inputInt.nextInt();

        InsertInto.fazerTurma(turma, fk_professor, fk_disciplina);
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR TURMA\n");
        System.out.println("Carregando...");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
        System.out.print("Digite o ID do Professor que Turma ver:\nR: ");
        int turmaid = inputInt.nextInt();
        pb.printTurma(SelectById.selectTurma(turmaid));

        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR TURMA\n");
        System.out.println("carregando...");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
        System.out.print("Digite o ID do Professor que deseja atualizar:\nR: ");
        int turmaID = inputInt.nextInt();
        Turma turmaveia = SelectById.selectTurma(turmaID);
        Turma turma = new Turma();
        System.out.print("Codigo: ");
        turma.setCodigo(inputInt.nextInt());
        System.out.print("Sala: ");
        turma.setSala(input.nextLine());
        System.out.print("Horario: ");
        turma.setHorario(input.nextLine());

        Update.updateTurma(turma,turmaID);
        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR TURMA\n");
        System.out.println("Carregando...");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
        System.out.print("Digite o ID da Turma que deseja apagar:\n");
        System.out.print("R: ");
        int turmaId = inputInt.nextInt();
        int fk_pd = SelectById.selectTurma(turmaId).getFK_Professor_Disciplina();

        dl.deleteTurma(turmaId, fk_pd);
        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODAS AS TURMAS\n");
        System.out.println("Carregando...");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());

        voltar();
    }
    public void aluTur(){
        System.out.println("Digite o ID da Turma e aluno");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());
        System.out.print("Turma ID: ");
        int fk_turma = inputInt.nextInt();
        PrintAll.printAllAluno(SelectAll.selectAllAluno());
        System.out.print("Aluno ID: ");
        int fk_aluno = inputInt.nextInt();

        InsertInto.fazerAluTur(fk_aluno,fk_turma);
    }
    @Override
    public void voltar() {
        do {
            System.out.print("9 - Voltar\n0 - Menu\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    esc.turma();
                } else if (escolha == 0) {
                    esc.menu();
                }else {
                    throw new NumeroNaoListado(escolha);
                }
            } catch (NumeroNaoListado e) {
                e.getMessage();
                System.out.println("Escolha uma das opções disponiveis!!");
            }
        } while (true);
    }
}

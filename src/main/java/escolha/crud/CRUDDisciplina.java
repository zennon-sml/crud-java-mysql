package escolha.crud;

import consultas.*;
import entidades.Disciplina;
import escolha.Escolha;
import excecoes.NumeroNaoListado;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDDisciplina implements ICRUD{
    Disciplina dis = new Disciplina();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    Delete dl = new Delete();
    PrintById pb = new PrintById();
    Escolha esc = new Escolha();


    @Override
    public void create(){
        System.out.println("--------------------------\nNOVA DISCIPLINA\n");
        System.out.print("Codigo: ");
        dis.setCodigo(inputInt.nextInt());
        System.out.print("Descrição: ");
        dis.setDescricao(input.nextLine());
        System.out.print("Carga Horaria: ");
        dis.setCargaHoraria(input.nextLine());
        System.out.print("Numero de creditos: ");
        dis.setNumeroCreditos(inputInt.nextInt());

        InsertInto.fazerDisciplina(dis);
        System.out.println("\n* Curso cadastrado com sucesso!!!!");
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR DISCIPLINA\n");
        System.out.println("Digite o ID do Disciplina que deseja ver:\nR: ");
        int disciplinaid = inputInt.nextInt();
        pb.printDisciplina(SelectById.selectDisciplina(disciplinaid));


        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR DISCIPLINA\n");
        System.out.print("Digite o ID da Disciplina que deseja atualizar:\nR: ");
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
        System.out.print("R: ");
        int disId = inputInt.nextInt();
        Disciplina velhaDis = SelectById.selectDisciplina(disId);
        Disciplina dis = new Disciplina();
        System.out.print("Codigo: ");
        dis.setCodigo(inputInt.nextInt());
        System.out.print("Descrição: ");
        dis.setDescricao(input.nextLine());
        System.out.print("Carga Horaria: ");
        dis.setCargaHoraria(input.nextLine());
        System.out.print("Numero de creditos: ");
        dis.setNumeroCreditos(inputInt.nextInt());

        Update.updateDisciplina(dis, disId);
        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR DISCIPLINA\n");
        System.out.print("Digite o ID da disciplina que deseja apagar:\n");
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
        System.out.print("R: ");
        int disciplinaid = inputInt.nextInt();

        dl.deleteDisciplina(disciplinaid);
        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODAS AS DISCIPLINAS\n");
        System.out.println("Carregando...");
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
        voltar();
    }

    @Override
    public void voltar() {
        do {
            System.out.print("9 - Voltar\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    esc.disciplina();
                } else {
                    throw new NumeroNaoListado(escolha);
                }
            } catch (NumeroNaoListado e) {
                e.getMessage();
                System.out.println("Escolha uma das opções disponiveis!!");
            }
        } while (true);
    }
}

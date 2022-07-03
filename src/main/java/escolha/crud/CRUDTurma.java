package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
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
    Escolha esc = new Escolha();


    @Override
    public void create() {
        System.out.println("--------------------------\nNOVA TURMA\n");
        System.out.print("Codigo: ");
        turma.setCodigo(input.nextInt());
        System.out.print("Sala: ");
        turma.setSala(input.nextLine());
        System.out.print("Horario: ");
        turma.setHorario(input.nextLine());

        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR TURMA\n");
        System.out.println("Digite o ID do Professor que Turma ver:\nR: ");
        int turmaid = inputInt.nextInt();
        pb.printTurma(SelectById.selectTurma(turmaid));

        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR TURMA\n");

        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR TURMA\n");

        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODAS AS TURMAS\n");
        PrintAll.printAllTurma(SelectAll.selectAllTurma());

        voltar();
    }

    @Override
    public void voltar() {
        do {
            System.out.print("9 - Voltar\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    esc.turma();
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

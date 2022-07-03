package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
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
    PrintById pb = new PrintById();
    Escolha esc = new Escolha();


    @Override
    public void create(){
        System.out.println("--------------------------\nNOVA DISCIPLINA\n");
        System.out.print("Codigo: ");
        dis.setCodigo(input.nextInt());
        System.out.print("Descrição: ");
        dis.setDescricao(input.nextLine());
        System.out.print("Carga Horaria: ");
        dis.setCargaHoraria(input.nextLine());
        System.out.print("Numero de creditos: ");
        dis.setNumeroCreditos(input.nextInt());

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

        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR DISCIPLINA\n");

        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODAS AS DISCIPLINAS\n");
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

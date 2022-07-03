package escolha.crud;

import consultas.InsertInto;
import consultas.SelectAll;
import consultas.SelectById;
import entidades.Curso;
import escolha.Escolha;
import excecoes.NumeroNaoListado;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;


public class CRUDCurso implements ICRUD{
    Curso curso = new Curso();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();
    Escolha esc = new Escolha();

    @Override
    public void create() {
        System.out.println("--------------------------\nNOVO CURSO\n");
        System.out.println("CREATE CURSO");
        System.out.print("Codigo: ");
        curso.setCodigo(inputInt.nextInt());
        System.out.print("Nome: ");
        curso.setNome(input.nextLine());
        System.out.print("Descrição: ");
        curso.setDescricao(input.nextLine());
        System.out.print("Numero de Periodos: ");
        curso.setNumeroPeriodos(inputInt.nextInt());

        InsertInto.fazerCurso(curso);
        System.out.println("\n* Curso cadastrado com sucesso!!!!");
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR CURSO\n");
        System.out.println("Digite o ID do Curso que deseja ver:\nR: ");
        int cursoid = inputInt.nextInt();
        pb.printCurso(SelectById.selectCurso(cursoid));
        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR DO CURSO\n");

        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR CURSO\n");

        voltar();
    }

    @Override
    public void printAll() {
        System.out.println("--------------------------\nEXIBIR TODOS OS CURSOS\n");
        PrintAll.printAllCurso(SelectAll.selectAllCurso());
        voltar();
    }

    @Override
    public void voltar() {
        do {
            System.out.print("9 - Voltar\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    esc.curso();
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

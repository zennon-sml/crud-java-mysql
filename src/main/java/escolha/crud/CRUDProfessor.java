package escolha.crud;

import consultas.Delete;
import consultas.InsertInto;
import consultas.SelectAll;
import consultas.SelectById;
import entidades.Professor;
import escolha.Escolha;
import excecoes.NumeroNaoListado;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDProfessor implements ICRUD{
    Professor prof = new Professor();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();
    Escolha esc = new Escolha();

    Delete dl = new Delete();

    @Override
    public void create(){
        System.out.println("--------------------------\nNOVO PROFESSOR\n");
        System.out.print("Nome: ");
        prof.setNome(input.nextLine());
        System.out.print("Int Registro: ");
        prof.setRegistro(inputInt.nextInt());
        System.out.print("Especialidade: ");
        prof.setEspecialidade(input.nextLine());
        System.out.print("Telefone: ");
        prof.setTelefone(input.nextLine());
        System.out.print("Maior Titulação: ");
        prof.setMaiorTitulacao(input.nextLine());

        System.out.println("ENDEREÇO");
        System.out.print("CEP: ");
        prof.setCep(input.nextLine());
        System.out.print("Estado: ");
        prof.setEstado(input.nextLine());
        System.out.print("Cidade: ");
        prof.setCidade(input.nextLine());
        System.out.print("Rua: ");
        prof.setRua(input.nextLine());
        System.out.print("Número: ");
        prof.setNumero(input.nextLine());
        System.out.print("Complemento: ");
        prof.setComplemento(input.nextLine());

        //Manda pro banco agr
        InsertInto.fazerProfessor(prof);

        System.out.println("\n* Professor cadastrado com sucesso!!");
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR DADOS DO PROFESSOR\n");
        System.out.print("Digite o ID do Professor que deseja ver:\nR: ");
        int professorid = inputInt.nextInt();
        System.out.println("Carregando...");
        pb.printProfessor(SelectById.selectProfessor(professorid));
        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR PROFESSOR\n");
        System.out.println("Carregando...");

       voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR PROFESSOR\n");
        System.out.print("Digite o ID do professor que deseja apagar:\n");
        System.out.println("Carregando...");
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
        System.out.print("R: ");
        int professorid = inputInt.nextInt();

        dl.deleteProfessor(professorid);
        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODOS OS PROFESSORES\n");
        System.out.println("Carregando...");
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
        voltar();
    }

    @Override
    public void voltar(){
        do {
            System.out.print("9 - Voltar\nR: ");
            int escol = input.nextInt();
            try {
                if (escol == 9) {
                    esc.professor();
                } else {
                    throw new NumeroNaoListado(escol);
                }
            } catch (NumeroNaoListado e) {
                e.getMessage();
                System.out.println("Escolha uma das opções disponiveis!!");
            }
        }while (true);
    }
}



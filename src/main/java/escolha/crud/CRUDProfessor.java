package escolha.crud;

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

    @Override
    public void create(){
        System.out.println("--------------------------\nNOVO PROFESSOR\n");
        System.out.print("Nome: ");
        prof.setNome(input.nextLine());
        System.out.print("Registro: ");
        prof.setRegistro(input.nextLine());
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
        System.out.printf("%s - %s - %s",prof.getNome(), prof.getRua(), prof.getEspecialidade());

        System.out.println("\n* Professor cadastrado com sucesso!!");
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR DADOS DO PROFESSOR\n");
        System.out.print("Digite o ID do Professor que deseja ver:\nR: ");
        int professorid = inputInt.nextInt();
        pb.printProfessor(SelectById.selectProfessor(professorid));
        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR PROFESSOR\n");

       voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR PROFESSOR\n");

        voltar();
    }

    @Override
    public void printAll(){
        System.out.println("--------------------------\nEXIBIR TODOS OS PROFESSORES\n");
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



package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
import entidades.Professor;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDProfessor {
    Professor prof = new Professor();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();
    public void createProfessor(){
        System.out.println("CREATE PROFESSOR");
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
    }
    public void readProfessor(){
        System.out.println("Digite o ID do Professor que deseja ver:\nR: ");
        int professorid = inputInt.nextInt();
        pb.printProfessor(SelectById.selectProfessor(professorid));
    }
    public void updateProfessor(){
        System.out.println("updateProfessor");
    }
    public void deleteProfessor(){
        System.out.println("deleteProfessor");
    }
    public void printAllProfessor(){
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
    }
}


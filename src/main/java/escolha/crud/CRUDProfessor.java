package escolha.crud;

import entidades.Professor;
import java.util.Scanner;

public class CRUDProfessor {
    Professor prof = new Professor();
    Scanner input = new Scanner(System.in);
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
        System.out.println("ReadProfessor");
    }
    public void updateProfessor(){
        System.out.println("updateProfessor");
    }
    public void deleteProfessor(){
        System.out.println("deleteProfessor");
    }
}


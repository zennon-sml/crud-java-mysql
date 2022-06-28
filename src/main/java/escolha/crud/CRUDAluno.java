package escolha.crud;

import entidades.Aluno;
import java.util.Scanner;

public class CRUDAluno {
    Aluno aluno = new Aluno();
    Scanner input = new Scanner(System.in);
    public void createAluno(){
        System.out.println("CREATE ALUNO");
        System.out.print("Nome: ");
        aluno.setNome(input.nextLine());
        System.out.print("Matricula: ");
        aluno.setId(input.nextLine());
        System.out.print("Data de Nascimento: ");
        aluno.setDataNas(input.nextLine());
        System.out.print("Telefone: ");
        aluno.setTelefone(input.nextLine());
        System.out.print("Sexo: ");
        aluno.setSexo(input.nextLine());

        System.out.println("ENDEREÇO");
        System.out.print("CEP: ");
        aluno.setCep(input.nextLine());
        System.out.print("Estado: ");
        aluno.setEstado(input.nextLine());
        System.out.print("Cidade: ");
        aluno.setCidade(input.nextLine());
        System.out.print("Rua: ");
        aluno.setRua(input.nextLine());
        System.out.print("Número: ");
        aluno.setNumero(input.nextLine());
        System.out.print("Complemento: ");
        aluno.setComplemento(input.nextLine());

        //Manda pro banco agr
        //System.out.printf("%s - %s - %s",aluno.getNome(), aluno.getRua(), aluno.getSexo());
    }
    public void readAluno(){
        System.out.println("ReadAluno");
    }
    public void updateAluno(){
        System.out.println("updateAluno");
    }
    public void deleteAluno(){
        System.out.println("deleteAluno");
    }
}

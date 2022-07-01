package escolha.crud;

import consultas.InsertInto;
import consultas.SelectAll;
import consultas.SelectById;
import entidades.Aluno;
import printar.PrintAll;

import java.util.Scanner;
public class CRUDAluno {
    Aluno aluno = new Aluno();
    Scanner input = new Scanner(System.in);
    public void createAluno(){
        System.out.println("CREATE ALUNO");
        System.out.print("Nome: ");
        aluno.setNome(input.nextLine());
        System.out.print("Matricula: ");
        aluno.setMatricula(input.nextLine());
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

        //Manda pro banco agr
        System.out.println("Nome: "+aluno.getNome()+"\n" +
                "Matricula: "+aluno.getMatricula()+"\n" +
                "DataNas: "+aluno.getDataNas()+"\n" +
                "Telefone: "+aluno.getTelefone()+"\n" +
                "Sexo: "+aluno.getSexo()+"\n" +
                "\n" +
                "CEP: "+aluno.getCep()+"\n" +
                "Estado: "+aluno.getEstado()+"\n" +
                "Cidade: "+aluno.getCidade()+"\n" +
                "Rua: "+aluno.getRua()+"\n" +
                "Numero: "+aluno.getNumero()+"\n"
        );
        //tentando mandar pro banco
        InsertInto fazerAluno = new InsertInto();
        fazerAluno.fazerAluno(aluno);
    }
    public void readAluno(){
        System.out.println("pegar por id");
    }
    public void updateAluno(){
        System.out.println("updateAluno");
    }
    public void deleteAluno(){
        System.out.println("deleteAluno");
    }
    public void printAllAluno(){
        PrintAll.printAllAluno( SelectAll.selectAllAluno());
    }
}

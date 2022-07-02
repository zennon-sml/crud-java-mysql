package escolha.crud;

import consultas.InsertInto;
import consultas.SelectAll;
import consultas.SelectById;
import entidades.Aluno;
import entidades.Curso;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;
public class CRUDAluno {
    Aluno aluno = new Aluno();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintAll pa = new PrintAll();
    PrintById pb = new PrintById();
    public void createAluno(){
        //printar todos os cursos para a escolha de cadastrar a FK curso pro aluno
        PrintAll.printEscholhaCurso(SelectAll.selectAllCurso());
        int FKCurso = inputInt.nextInt();

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
        InsertInto.fazerAluno(aluno, FKCurso);
    }
    public void readAluno(){
        System.out.println("Digite o ID do aluno que deseja ver:\nR: ");
        int alunoid = inputInt.nextInt();
        pb.printAluno(SelectById.selectAluno(alunoid));
    }
    public void updateAluno(){
        System.out.println("updateAluno");
    }
    public void deleteAluno(){
        System.out.println("deleteAluno");
    }
    public void printAllAluno(){
        //pegando todo mundo do banco
        PrintAll.printAllAluno( SelectAll.selectAllAluno());
    }
}

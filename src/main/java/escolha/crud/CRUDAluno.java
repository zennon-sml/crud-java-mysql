package escolha.crud;

import consultas.*;
import entidades.Aluno;
import entidades.Curso;
import escolha.Escolha;
import excecoes.NumeroNaoListado;
import printar.PrintAll;
import printar.PrintById;
import java.util.Scanner;

public class CRUDAluno implements ICRUD {
    Aluno aluno = new Aluno();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintAll pa = new PrintAll();
    PrintById pb = new PrintById();
    Delete dl = new Delete();
    Escolha esc = new Escolha();

    @Override
    public void create(){
        //printar todos os cursos para a escolha de cadastrar a FK curso pro aluno
        System.out.println("--------------------------\nNOVO ALUNO\n");

        System.out.println("Carregando...");
        PrintAll.printAllCurso(SelectAll.selectAllCurso());
        System.out.print("* Escolha o ID do Curso do aluno\nR: ");
        int fk_curso = inputInt.nextInt();

        System.out.print("R: ");
        int FKCurso = inputInt.nextInt();

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

        System.out.println("* ENDEREÇO");
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

        InsertInto.fazerAluno(aluno, fk_curso);
        System.out.println("\n* Aluno cadastrado com sucesso!!");
        voltar();
    }

    @Override
    public void read(){
        System.out.println("--------------------------\nEXIBIR DADOS DO ALUNO\n");
        System.out.print("Digite o ID do aluno que deseja ver:\nR: ");
        int alunoid = inputInt.nextInt();
        try {
            pb.printAluno(SelectById.selectAluno(alunoid));
        }catch (NullPointerException e){
            System.out.println("ID não encontrado, tente outro!!");
            read();
        }

        voltar();
    }

    @Override
    public void update(){
        System.out.println("--------------------------\nATUALIZAR ALUNO\n");
        System.out.print("Digite o ID do Aluno que deseja atualizar:\nR: ");
        System.out.println("Carregando...");
        PrintAll.printAllAluno(SelectAll.selectAllAluno());
        System.out.print("R: ");
        int alunoId = inputInt.nextInt();
        Aluno alunovei = SelectById.selectAluno(alunoId);
        Aluno aluno = new Aluno();
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

        Update.updateAluno(aluno, alunoId);
        voltar();
    }

    @Override
    public void delete(){
        System.out.println("--------------------------\nDELETAR ALUNO\n");
        System.out.print("Digite o ID do aluno que deseja apagar:\nR: ");
        System.out.println("Carregando...");
        PrintAll.printAllAluno(SelectAll.selectAllAluno());
        int alunoid = inputInt.nextInt();

        dl.deleteAluno(alunoid);
        voltar();
    }

    @Override
    public void printAll(){
        //pegando todos mundo do banco
        System.out.println("--------------------------\nEXIBIR TODOS OS ALUNOS\n");
        System.out.println("Carregando...");
        PrintAll.printAllAluno( SelectAll.selectAllAluno());
        voltar();
    }


    @Override
    public void voltar(){
        do {
            System.out.print("9 - Voltar\n0 - Menu\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    esc.aluno();
                } else if (escolha == 0) {
                    esc.menu();
                } else {
                    throw new NumeroNaoListado(escolha);
                }
            } catch (NumeroNaoListado e) {
                e.getMessage();
                System.out.println("Escolha uma das opções disponiveis!!");
            }
        }while (true);
    }
}

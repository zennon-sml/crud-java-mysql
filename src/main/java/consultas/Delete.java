package consultas;

import consultas.Conexao;
import escolha.Escolha;
import excecoes.NumeroNaoListado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    static Conexao conexao = new Conexao();
    static Scanner input = new Scanner(System.in);
    static Escolha esc = new Escolha();

    public void deleteAluno(int alunoid){
        try {
            Connection con = conexao.fazerConexao();
            String aluno = "delete from aluno where id = " + alunoid;
            PreparedStatement pdst = con.prepareStatement(aluno);
            pdst.execute();
            pdst.close();
            System.out.println("Aluno apagado com sucessor!!!!");
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Não foi possivel apagar o aluno");
        }
    }
    public void deleteProfessor(int professorid){
        try{
            Connection con = conexao.fazerConexao();
            String professor = "delete from professor where id = " + professorid;
            PreparedStatement pdst = con.prepareStatement(professor);
            pdst.execute();
            pdst.close();
            System.out.println("Professor apagado com sucessor!!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void deleteDisciplina(int disId){
        try{
            Connection con = conexao.fazerConexao();
            String dis = "delete from disciplina where id = " + disId;
            PreparedStatement pdst = con.prepareStatement(dis);
            pdst.execute();
            pdst.close();
            System.out.println("Disciplina apagado com sucessor!!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void deleteTurma(int turmaId, int fk_pd){
        try{
            Connection con = conexao.fazerConexao();
            //TODO apagar a professor_disciplina pq esqueci de colocar o on delete cascade
            String query1 = "delete from professor_disciplina where id = " + fk_pd;
            PreparedStatement pdst1 = con.prepareStatement(query1);
            pdst1.execute();
            pdst1.close();
            //TODO Não pode apagar tendo uma FK
            String query = "delete from turma where id = " + turmaId;
            PreparedStatement pdst = con.prepareStatement(query);
            pdst.execute();
            pdst.close();
            System.out.println("turma apagado com sucessor!!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

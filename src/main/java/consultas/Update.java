package consultas;

import entidades.*;
import escolha.Escolha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
    static Conexao conexao = new Conexao();
    static Scanner input = new Scanner(System.in);
    static Escolha esc = new Escolha();

    public static void updateAluno(Aluno a, int alunoId) {
        try {
            Connection con = conexao.fazerConexao();
            //aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso)
            String query = "UPDATE aluno SET matricula=?,nome=?,telefone=?,nasc=?,sexo=? WHERE id="+alunoId;
            PreparedStatement sta = con.prepareStatement(query);
            sta.setString(1,a.getMatricula());
            sta.setString(2,a.getNome());
            sta.setString(3, a.getTelefone());
            sta.setString(4, a.getDataNas());
            sta.setString(5, a.getSexo());

            sta.executeUpdate();
            System.out.println("Aluno Atualizado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updateProfessor(Professor p, int profId){
        try {
            Connection con = conexao.fazerConexao();
            // professor(registro,nome,telefone,especialidade,titulacao,fk_endereco)
            String query = "UPDATE professor SET registro=?,nome=?,telefone=?,especialidade=?,titulacao=? where id = "+profId;
            PreparedStatement sta = con.prepareStatement(query);
            sta.setInt(1,p.getRegistro());
            sta.setString(2,p.getNome());
            sta.setString(3, p.getTelefone());
            sta.setString(4, p.getEspecialidade());
            sta.setString(5, p.getMaiorTitulacao());

            sta.executeUpdate();
            System.out.println("Professor Atualizado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updateDisciplina(Disciplina d, int disId){
        try {
            Connection con = conexao.fazerConexao();
            //disciplina(codigo,descricao,carga_horaria,num_credito)
            String query = "UPDATE disciplina SET codigo=?,descricao=?,carga_horaria=?,num_credito=? where id = "+disId;
            PreparedStatement sta = con.prepareStatement(query);
            sta.setInt(1,d.getCodigo());
            sta.setString(2,d.getDescricao());
            sta.setString(3, d.getCargaHoraria());
            sta.setInt(4, d.getNumeroCreditos());

            sta.executeUpdate();
            System.out.println("Professor Atualizado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updateTurma(Turma t, int idTurma){
        try {
            Connection con = conexao.fazerConexao();
            //turma(codigo,sala,horario,fk_professor_disciplina)
            String query = "UPDATE turma SET codigo=?,sala=?,horario=?,fk_professor_disciplina=? where id = "+idTurma;
            PreparedStatement sta = con.prepareStatement(query);
            sta.setInt(1,t.getCodigo());
            sta.setString(2,t.getSala());
            sta.setString(3, t.getHorario());
            sta.setInt(4, t.getFK_Professor_Disciplina());

            sta.executeUpdate();
            System.out.println("Turma Atualizado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void updateCurso(Curso c, int idCurso){
        try {
            Connection con = conexao.fazerConexao();
            //curso(codigo,nome,descricao,num_periodo)
            String query = "UPDATE curso SET codigo=?,nome=?,descricao=?,num_periodo=? where id = "+idCurso;
            PreparedStatement sta = con.prepareStatement(query);
            sta.setInt(1,c.getCodigo());
            sta.setString(2,c.getNome());
            sta.setString(3, c.getDescricao());
            sta.setInt(4, c.getNumeroPeriodos());

            sta.executeUpdate();
            System.out.println("Curso Atualizado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

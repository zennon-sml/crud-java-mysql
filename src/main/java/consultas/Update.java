package consultas;

import entidades.Aluno;
import entidades.Professor;
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

            int rowsUpdated = sta.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Aluno Atualizado com sucesso");
            }else{
                System.out.println("Nenhum dado modificado");
            }
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

            int rowsUpdated = sta.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Professor Atualizado com sucesso");
            }else{
                System.out.println("Nenhum dado modificado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package consultas;

import entidades.Aluno;
import entidades.Disciplina;
import entidades.Endereco;
import entidades.Professor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectById {
    static Conexao conexao = new Conexao();
    public static Endereco selectEndereco(int enderecoId){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            //faz a busca no banco por id
            String query = "select * from endereco where id = " + enderecoId;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1);
            String rua = rs.getString(2);
            String numero = rs.getString(3);
            String cidade = rs.getString(4);
            String cep = rs.getString(5);
            String estado = rs.getString(6);
            Endereco e = new Endereco();
            //Instaciando objeto com os dados pegos
            e.setIdEnd(id);
            e.setRua(rua);
            e.setNumero(numero);
            e.setCidade(cidade);
            e.setCep(cep);
            e.setEstado(estado);

            return e;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static Aluno selectAluno(int alunoId){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            //faz a busca no banco por id
            String query = "select * from aluno where id = " + alunoId;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1);
            String matricula = rs.getString(2);
            String nome = rs.getString(3);
            String telefone = rs.getString(4);
            String nasc = rs.getString(5);
            String sexo = rs.getString(6);
            int fk_endereco = rs.getInt(7);
            Aluno a = new Aluno();
            //Instaciando objeto com os dados pegos
            a.setId(id);
            a.setMatricula(matricula);
            a.setNome(nome);
            a.setTelefone(telefone);
            a.setDataNas(nasc);
            a.setSexo(sexo);

            return a;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static Professor selectProfessor(int professorId){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            //faz a busca no banco por id
            String query = "select * from professor where id = " + professorId;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1);
            int registro = rs.getInt(2);
            String nome = rs.getString(3);
            String telefone = rs.getString(4);
            String especialidade = rs.getString(5);
            String titulacao = rs.getString(6);
            int fk_endereco = rs.getInt(7);
            Professor p = new Professor();
            p.setId(id);
            p.setRegistro(registro);
            p.setNome(nome);
            p.setTelefone(telefone);
            p.setMaiorTitulacao(titulacao);

            return p;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static Disciplina selectDisciplina(int disciplinaId){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            //faz a busca no banco por id
            String query = "select * from disciplina where id = " + disciplinaId;
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int id = rs.getInt(1);
            int codigo = rs.getInt(2);
            String descricao = rs.getString(3);
            String carga_horaria = rs.getString(4);
            int num_credito = rs.getInt(5);
            Disciplina d = new Disciplina();
            //TODO d.setId(id);
            d.setCodigo(codigo);
            d.setDescricao(descricao);
            d.setCargaHoraria(carga_horaria);
            d.setNumeroCreditos(num_credito);

            return d;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

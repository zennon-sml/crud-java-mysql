import entidades.Endereco;

import java.sql.*;
import java.util.Date;

public class Models {
    public static Connection fazerConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10502351";
            String usuario = "sql10502351";
            String senha = "273r7UMB9k";
            Connection con = DriverManager.getConnection(//abre a conexao
                    servidor,
                    usuario,
                    senha
            );
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    //exemplo INSERT no banco
//    public static void customQuery(String query){
//        try {
//            Connection con = fazerConexao();
//            PreparedStatement psmt;
//            psmt = con.prepareStatement(query);
//            psmt.execute();
//            psmt.close();
//            System.out.println("Query feita!!!!");
//        }
//        catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }

    public static Endereco[] selectAllEndereco(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();

            //cria uma lista do tipo Endereco com o tamanho igual a o tanto de dado do banco
            ResultSet linhas = stmt.executeQuery("select count(*) from endereco");
            linhas.next();
            Endereco[] enderecos = new Endereco[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;
            //faz a busca no banco por todos os valores
            String query = "select * from endereco;";
            ResultSet rs = stmt.executeQuery(query);
            //loopa por todos os enderecos
            while (rs.next()) {
                //pegando os dados do banco
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
                //coloca o novo objeto na lista enderecos
                enderecos[i] = e;
                i++;
            }
            //retorna os objetos para serem printados pela View
            return enderecos;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static void selectAllAluno(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from aluno;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                //TODO instanciar objeto
                int id = rs.getInt(1);
                String codigo = rs.getString(2);
                String nome = rs.getString(3);
                String telefone = rs.getString(4);
                Date nasc = rs.getDate(5);
                String sexo = rs.getString(6);
                int fk_endereco = rs.getInt(7);
                System.out.println(id + "-" + codigo + "-" + nome + "-" + telefone + "-" + nasc + "-" + sexo + "-" + fk_endereco);
                //TODO fazer um objeto e mandar pras views pra elas printar
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void selectAllProfessor(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from professor;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                String registro = rs.getString(2);
                String nome = rs.getString(3);
                String telefone = rs.getString(4);
                String especialidade = rs.getString(5);
                String titulacao = rs.getString(6);
                int fk_endereco = rs.getInt(7);
                System.out.println(id + "-" + registro + "-" + nome + "-" + telefone + "-" + especialidade + "-" + titulacao);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void selectAllDisciplina(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from disciplina;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String descricao = rs.getString(3);
                String carga_horaria = rs.getString(4);
                int num_credito = rs.getInt(5);
                System.out.println(id + "-" + codigo + "-" + descricao + "-" + carga_horaria + "-" + num_credito);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void selectAllTurma(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from turma;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String sala = rs.getString(3);
                String horario = rs.getString(4);
                int fk_professor_disciplina = rs.getInt(5);
                System.out.println(id + "-" + codigo + "-" + sala + "-" + horario + "-" + fk_professor_disciplina);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void selectAllCurso(){
        try {
            Connection con = fazerConexao();
            Statement stmt = con.createStatement();
            String query = "select * from curso;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String nome = rs.getString(3);
                String descricao = rs.getString(4);
                int fk_aluno = rs.getInt(5);
                int fk_disciplina = rs.getInt(6);
                System.out.println(id + "-" + codigo + "-" + nome + "-" + descricao + "-" + fk_aluno + "-" + fk_disciplina);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

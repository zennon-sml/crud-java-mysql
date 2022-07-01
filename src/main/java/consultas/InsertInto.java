package consultas;

import entidades.Aluno;
import entidades.Endereco;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertInto {
    static Conexao conexao = new Conexao();
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
//        }
//    }
    public void fazerAluno(Aluno a){
        try {
            Connection con = conexao.fazerConexao();
            String endereco = "INSERT into endereco (rua,numero,cidade,cep,estado)VALUES (?,?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(endereco);
            //colocar os valores do objeto de acordo com o banco
            psmt.setString(1, a.rua);
            psmt.setString(2, a.numero);
            psmt.setString(3, a.cidade);
            psmt.setString(4, a.cep);
            psmt.setString(5,a.estado);
            psmt.execute();
            psmt.close();
            //TODO pegar o id do ultimo endereco q foi oque nois acabamos de criar
            Endereco[] enderecos = SelectAll.selectAllEndereco();
            int idEnderecos = enderecos[enderecos.length - 11].idEnd;
            String aluno = "INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = con.prepareStatement(aluno);
            psmt1.setString(1,a.getMatricula());
            psmt1.setString(2,a.getNome());
            psmt1.setString(3, a.getTelefone());
            psmt1.setString(4,a.getDataNas());
            psmt1.setString(5,a.getSexo());
            psmt1.setInt(6,idEnderecos);//TODO pegar o id do endereco do banco pra definir a FK do aluno
            psmt1.setInt(7,1);
            psmt1.execute();
            System.out.println("aluno inserido com sucesso!!!!");
            psmt1.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

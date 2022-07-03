package consultas;

import entidades.*;
import escolha.Escolha;
import excecoes.NumeroNaoListado;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertInto {
    static Conexao conexao = new Conexao();
    static Scanner input = new Scanner(System.in);
    static Escolha esc = new Escolha();
    public static void fazerAluno(Aluno a, int FKCurso) {
        try {
            Connection con = conexao.fazerConexao();
            String endereco = "INSERT into endereco (rua,numero,cidade,cep,estado)VALUES (?,?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(endereco);
            //colocar os valores do objeto de acordo com o banco
            psmt.setString(1, a.rua);
            psmt.setString(2, a.numero);
            psmt.setString(3, a.cidade);
            psmt.setString(4, a.cep);
            psmt.setString(5, a.estado);
            psmt.execute();
            psmt.close();
            //TODO pegar o id do ultimo endereco q foi oque nois acabamos de criar
            Endereco[] enderecos = SelectAll.selectAllEndereco();
            int idEndereco = enderecos[enderecos.length - 1].idEnd;
            String aluno = "INSERT into aluno (matricula,nome,telefone,nasc,sexo,fk_endereco,fk_curso) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement psmt1 = con.prepareStatement(aluno);
            psmt1.setString(1, a.getMatricula());
            psmt1.setString(2, a.getNome());
            psmt1.setString(3, a.getTelefone());
            psmt1.setString(4, a.getDataNas());
            psmt1.setString(5, a.getSexo());
            psmt1.setInt(6, idEndereco);//TODO pegar o id do endereco do banco pra definir a FK do aluno
            psmt1.setInt(7, FKCurso);//definir FK curso
            psmt1.execute();
            System.out.println("aluno inserido com sucesso!!!!");
            psmt1.close();
            voltar(1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fazerProfessor(Professor p) {
        try {
            Connection con = conexao.fazerConexao();
            String endereco = "INSERT into endereco (rua,numero,cidade,cep,estado)VALUES (?,?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(endereco);
            //colocar os valores do objeto de acordo com o banco
            psmt.setString(1, p.rua);
            psmt.setString(2, p.numero);
            psmt.setString(3, p.cidade);
            psmt.setString(4, p.cep);
            psmt.setString(5, p.estado);
            psmt.execute();
            psmt.close();
            Endereco[] enderecos = SelectAll.selectAllEndereco();
            int idEndereco = enderecos[enderecos.length - 1].idEnd;
            String professor = "INSERT into professor(registro,nome,telefone,especialidade,titulacao,fk_endereco) VALUES(?,?,?,?,?,?)";
            PreparedStatement psmt1 = con.prepareStatement(professor);
            psmt1.setInt(1, p.getRegistro());
            psmt1.setString(2, p.getNome());
            psmt1.setString(3, p.getTelefone());
            psmt1.setString(4, p.getEspecialidade());
            psmt1.setString(5, p.getMaiorTitulacao());
            psmt1.setInt(6, idEndereco);
            psmt1.execute();
            psmt1.close();
            System.out.println("professor inserido com sucesso!!!!");
            voltar(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void fazerDisciplina(Disciplina d) {
        try {
            Connection con = conexao.fazerConexao();
            String disciplina = "insert into disciplina(codigo,descricao,carga_horaria,num_credito) VALUES(?,?,?,?)";
            PreparedStatement pdst = con.prepareStatement(disciplina);
            pdst.setInt(1, d.getCodigo());
            pdst.setString(2, d.getDescricao());
            pdst.setString(3, d.getCargaHoraria());
            pdst.setInt(4,d.getNumeroCreditos());
            pdst.execute();
            pdst.close();
            System.out.println("Disciplina cadastrada com sucesso!!!!");
            voltar(3);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void fazerCurso(Curso c){
        try {
            Connection con = conexao.fazerConexao();
            String curso = "INSERT into curso(codigo,nome,descricao,num_periodo) VALUES(?,?,?,?)";
            PreparedStatement pdst = con.prepareStatement(curso);
            pdst.setInt(1, c.getCodigo());
            pdst.setString(2, c.getNome());
            pdst.setString(3, c.getDescricao());
            pdst.setInt(4, c.getNumeroPeriodos());
            pdst.execute();
            pdst.close();
            System.out.println("Curso cadastrado com sucesso!!!!");
            voltar(4);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void fazerTurma(Turma t, int fk_professor, int fk_disciplina){
        try {
            Connection con = conexao.fazerConexao();

            String professor_disciplina = "insert into professor_disciplina(fk_professor,fk_disciplina) values (?,?);";
            PreparedStatement pdst = con.prepareStatement(professor_disciplina);
            pdst.setInt(1,fk_professor);
            pdst.setInt(2, fk_disciplina);
            pdst.execute();
            pdst.close();
            //pegar o id da tabela criada
            ProfessorDisciplina[] pds = SelectAll.selectAllProfessorDisciplina();
            int idpds = pds[pds.length - 1].getId();

            String turma = "INSERT into turma(codigo,sala,horario,fk_professor_disciplina) VALUES(?,?,?,?)";
            PreparedStatement asdf = con.prepareStatement(turma);
            asdf.setInt(1,t.getCodigo());
            asdf.setString(2, t.getSala());
            asdf.setString(3, t.getHorario());
            asdf.setInt(4,idpds);
            asdf.execute();
            asdf.close();
            System.out.println("Turma cadastrada com sucesso!!!!");
            voltar(5);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void voltar(int entidade){
        do {
            System.out.print("9 - Voltar\nR: ");
            int escolha = input.nextInt();
            try {
                if (escolha == 9) {
                    if(entidade == 1){esc.aluno();}
                    else if(entidade == 2){esc.professor();}
                    else if(entidade == 3){esc.disciplina();}
                    else if(entidade == 4){esc.curso();}
                    else{esc.turma();}
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

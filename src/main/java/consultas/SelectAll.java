package consultas;

import entidades.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAll {
    static Conexao conexao = new Conexao();

    public static Endereco[] selectAllEndereco(){
        try {
            Connection con = conexao.fazerConexao();
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
    public static Aluno[] selectAllAluno(){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from aluno");
            linhas.next();
            Aluno[] alunos = new Aluno[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select * from aluno;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String matricula = rs.getString(2);
                String nome = rs.getString(3);
                String telefone = rs.getString(4);
                String nasc = rs.getString(5);
                String sexo = rs.getString(6);
                int fk_Endereco = rs.getInt(7);
                int fk_Curso = rs.getInt(8);
                Aluno a = new Aluno();

                a.setId(id);
                a.setMatricula(matricula);
                a.setNome(nome);
                a.setTelefone(telefone);
                a.setDataNas(nasc);
                a.setSexo(sexo);
                a.setFkEndereco(fk_Endereco);
                a.setFkCurso(fk_Curso);
                alunos[i] = a;
                i++;
            }
            rs.close();
            return alunos;
        }
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public static Professor[] selectAllProfessor(){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from professor");
            linhas.next();
            Professor[] professores = new Professor[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select * from professor;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
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
                p.setEspecialidade(especialidade);
                p.setFkEndereco(fk_endereco);
                p.setMaiorTitulacao(titulacao);
                professores[i] = p;
                i++;
            }
            return professores;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    public static Disciplina[] selectAllDisciplina(){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from disciplina");
            linhas.next();
            Disciplina[] disciplinas = new Disciplina[linhas.getInt(1)];
            int i = 0;

            String query = "select * from disciplina;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String descricao = rs.getString(3);
                String carga_horaria = rs.getString(4);
                int num_credito = rs.getInt(5);
                Disciplina d = new Disciplina();
                d.setIdDis(id);
                d.setCodigo(codigo);
                d.setDescricao(descricao);
                d.setCargaHoraria(carga_horaria);
                d.setNumeroCreditos(num_credito);
                disciplinas[i] = d;
                i++;
            }
            return disciplinas;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    public static Turma[] selectAllTurma(){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from turma");
            linhas.next();
            Turma[] turmas = new Turma[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select * from turma;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String sala = rs.getString(3);
                String horario = rs.getString(4);
                int fk_professor_disciplina = rs.getInt(5);
                Turma t = new Turma();
                t.setIdTur(id);
                t.setCodigo(codigo);
                t.setSala(sala);
                t.setHorario(horario);
                t.setFK_Professor_Disciplina(fk_professor_disciplina);
                turmas[i] = t;
                i++;
            }
            return turmas;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    public static Curso[] selectAllCurso(){
        try {
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from curso");
            linhas.next();
            Curso[] cursos = new Curso[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select * from curso;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt(1);
                int codigo = rs.getInt(2);
                String nome = rs.getString(3);
                String descricao = rs.getString(4);
                int num_periodo = rs.getInt(5);
                Curso c = new Curso();
                c.setIdCurso(id);
                c.setCodigo(codigo);
                c.setNome(nome);
                c.setDescricao(descricao);
                c.setNumeroPeriodos(num_periodo);
                cursos[i] = c;
                i++;
            }
            return cursos;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    public static Professor[] selectAllAluProf(int alunoId){
        try{
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();
            //pegar todos os orientadores de certo aluno
//            select p.nome
//            from aluno_professor ap
//            join aluno a on a.id = ap.fk_aluno
//            join professor p on p.id = ap.fk_professor
//            where a.id = 1
            ResultSet linhas = stmt.executeQuery("select count(*) from aluno_professor ap join aluno a on a.id = ap.fk_aluno join professor p on p.id = ap.fk_professor where a.id = "+alunoId);
            linhas.next();
            Professor[] aluProf = new Professor[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select p.nome from aluno_professor ap join aluno a on a.id = ap.fk_aluno join professor p on p.id = ap.fk_professor where a.id = "+alunoId;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String professor = rs.getString(1);
                Professor p = new Professor();
                p.setNome(professor);
                aluProf[i] = p;
                i++;
            }
            return aluProf;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ProfessorDisciplina[] selectAllProfessorDisciplina(){
        try{
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from professor_disciplina");
            linhas.next();
            ProfessorDisciplina[] pds = new ProfessorDisciplina[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select * from professor_disciplina;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id =  rs.getInt(1);
                int fk_professor = rs.getInt(2);
                int fk_disciplina = rs.getInt(3);
                ProfessorDisciplina prodi = new ProfessorDisciplina();
                prodi.setid(id);
                prodi.setFkProfessor(fk_professor);
                prodi.setFkDisciplina(fk_disciplina);
                pds[i] = prodi;
                i++;
            }

            return pds;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    public static String[] selectAlunoCurso(int idcurso){
        try{
            Connection con = conexao.fazerConexao();
            Statement stmt = con.createStatement();

            ResultSet linhas = stmt.executeQuery("select count(*) from aluno join curso on aluno.fk_curso = "+idcurso);
            linhas.next();
            String[] alunos = new String[linhas.getInt(1)];//lista de todos os enderecos
            int i = 0;

            String query = "select a.nome from aluno a join curso c on a.fk_curso = "+idcurso;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                String aluno = rs.getString(1);
                alunos[i] = aluno;
                i++;
            }

            return alunos;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}

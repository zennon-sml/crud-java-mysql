package printar;

import consultas.SelectAll;
import consultas.SelectById;
import entidades.*;

public class PrintById {

    public void printAluno(Aluno a){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+a.getId()+" | Nome: "+a.getNome()+" | idEnd: "+a.getFkEndereco()+" | idCurso: "+a.getFkCurso());
        System.out.println("#----------------------------------------------------#");
    }
    public void printProfessor(Professor p){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+p.getId()+" | Nome: "+p.getNome()+" | idEnd: "+p.getFkEndereco()+" | Especialidade: "+p.getEspecialidade());
        System.out.println("#----------------------------------------------------#");
    }
    public void printCurso(Curso c){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+c.getIdCurso()+" | Nome: "+c.getNome()+" | Num_periodos: "+c.getNumeroPeriodos());
        System.out.println("#----------------------------------------------------#");
    }
    public void printDisciplina(Disciplina d){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+d.getIdDis()+" | Nome: "+d.getDescricao()+" | Carga Horaria: "+d.getCargaHoraria());
        System.out.println("#----------------------------------------------------#");
    }
    public void printTurma(Turma t){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+t.getIdTur()+" | Codigo: "+t.getCodigo()+" | Horario: "+t.getHorario()+" | FK  professor_disciplina: "+t.getFK_Professor_Disciplina());
        System.out.println("#----------------------------------------------------#");
    }
    public void printEndereco(Endereco e){
        System.out.println("#----------------------------------------------------#");
        System.out.println("#ID: "+e.getIdEnd()+" | Rua: "+e.getRua()+" | Cidade: "+e.getCidade());
        System.out.println("#----------------------------------------------------#");
    }


    //-----------------------------------------------------------------------------------------> Consultas
    public void printInfo(Aluno a){
        Endereco e = SelectById.selectEndereco(a.getFkEndereco());
        Curso c = SelectById.selectCurso(a.getFkCurso());

        System.out.println("#----------------------------------------------------");
        System.out.println("#ID: "+a.getId()+"\n" +
                "Nome: "+a.getNome()+"\n" +
                "Matricula: " +a.getMatricula()+"\n" +
                "Data de Nascimento: " +a.getDataNas()+"\n" +
                "Sexo: " +a.getSexo()+"\n" +
                "Telefone: " +a.getTelefone()+"\n" +
                "\n* INFORMA????ES DE ENDERE??O *" +"\n" +
                "CEP: " +e.getCep()+"\n" +
                "Estado: " +e.getEstado()+"\n" +
                "Cidade: " +e.getCidade() +"\n" +
                "Rua: "+ e.getRua()+"\n" +
                "Complemento: " +e.getComplemento()+"\n" +
                "\n* INFORMA????ES CURSO *" +"\n" +
                "Nome do Curso: " +c.getNome()+"\n" +
                "Numero de Periodos: " +c.getNumeroPeriodos()+"\n" );
                for(Professor p : SelectAll.selectAllAluProf(a.getId())){
                    System.out.println("Orientador: " + p.getNome());
                }

        System.out.println("#----------------------------------------------------");
    }
    public void printInfo(Professor p) {
        Endereco e = SelectById.selectEndereco(p.getFkEndereco());
        System.out.println("#ID: " + p.getId() + "\n" +
                "Nome: " + p.getNome() + "\n" +
                "Registro: " + p.getRegistro() + "\n" +
                "Telefone: " + p.getTelefone() + "\n" +
                "Especialidade: " + p.getEspecialidade() + "\n" +
                "Maior titula????o: " + p.getMaiorTitulacao() + "\n" +
                "\n* INFORMA????ES DE ENDERE??O *" + "\n" +
                "CEP: " + e.getCep() + "\n" +
                "Estado: " + e.getEstado() + "\n" +
                "Cidade: " + e.getCidade() + "\n" +
                "Rua: " + e.getRua() + "\n" +
                "Complemento: " + e.getComplemento());

    }
    public void printInfo(Turma t){
        ProfessorDisciplina[] pd = SelectAll.selectAllProfessorDisciplina();
        String professor = "";
        String disciplina = "";
        //join das tabelas sem usar banco de dados
        for(ProfessorDisciplina ppdd : pd){
            if (t.getFK_Professor_Disciplina() == ppdd.getId()){
                 professor = SelectById.selectProfessor(ppdd.getFkProfessor()).getNome();
                 disciplina = SelectById.selectDisciplina(ppdd.getFkDisciplina()).getDescricao();
            }
        }
        System.out.println("#----------------------------------------------------");
        System.out.println("#ID: " + t.getIdTur() + "\n" +
                "Codigo: " + t.getCodigo() + "\n" +
                "Sala: " + t.getSala() + "\n" +
                "Horario: " + t.getHorario()+ "\n" +
                "Professor: "+professor+ "\n" +
                "Disciplina: "+disciplina);
        System.out.println("#----------------------------------------------------");

    }
    public void printInfo(Curso c) {
        System.out.println("#----------------------------------------------------");
        System.out.println("#ID: " + c.getIdCurso() + "\n" +
                "Nome: " + c.getNome() + "\n" +
                "Codigo: " + c.getCodigo() + "\n" +
                "Descri????o: " + c.getDescricao() + "\n" +
                "N??mero de Periodos: " + c.getNumeroPeriodos()+"\n"+
                "Alunos matriculados:");
        int i = 1;
        for(String alunos: SelectAll.selectAlunoCurso(c.getIdCurso())){
            System.out.println("ID: "+i+" - "+alunos);
            i++;
        }
        System.out.println("#----------------------------------------------------");
    }
    public void printInfo(Disciplina d) {
        System.out.println("#----------------------------------------------------");
        System.out.println("#ID: " + d.getIdDis() + "\n" +
                "Codigo: " + d.getCodigo() + "\n" +
                "Carga Horaria: " + d.getCargaHoraria() + "\n" +
                "N??mero de Creditos" + d.getNumeroCreditos()+ "\n" +
                "Descri????o: " + d.getDescricao());
        System.out.println("#----------------------------------------------------");
    }

}

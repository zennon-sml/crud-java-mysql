package printar;

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
}

package printar;

import entidades.*;

public class PrintAll {
    public static void printAllAluno(Aluno[] alunos){
        System.out.println("Printando todos os alunos");
        for(Aluno a : alunos){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+a.getId()+" | Nome: "+a.getNome()+" | idEnd: "+a.getFkEndereco()+" | idCurso: "+a.getFkCurso());
        }
        System.out.println("#----------------------------------------------------#");
    }
    public static void printAllProfessor(Professor[] professores){
        System.out.println("Printando todos os Professores");
        for(Professor p : professores){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+p.getId()+" | Nome: "+p.getNome()+" | idEnd: "+p.getFkEndereco()+" | Especialidade: "+p.getEspecialidade());
        }
        System.out.println("#----------------------------------------------------#");
    }
    public static void printAllDisciplina(Disciplina[] disciplinas){
        System.out.println("Printando todos os Disciplinas");
        for(Disciplina d : disciplinas){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+d.getIdDis()+" | Nome: "+d.getDescricao()+" | Carga Horaria: "+d.getCargaHoraria());
        }
        System.out.println("#----------------------------------------------------#");
    }
    public static void printAllTurma(Turma[] turmas){
        System.out.println("Printando todos os Turmas");
        for(Turma t : turmas){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+t.getIdTur()+" | Codigo: "+t.getCodigo()+" | Horario: "+t.getHorario()+" | FK  professor_disciplina: "+t.getFK_Professor_Disciplina());
        }
        System.out.println("#----------------------------------------------------#");
    }
    public static void printAllCurso(Curso[] cursos){
        System.out.println("Printando todos os Cursos");
        for(Curso c : cursos){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+c.getIdCurso()+" | Nome: "+c.getNome()+" | Num_periodos: "+c.getNumeroPeriodos());
        }
        System.out.println("#----------------------------------------------------#");
    }
    public static void printAllEndereco(Endereco[] enderecos){
        for(Endereco e : enderecos){
            System.out.println("#----------------------------------------------------#");
            System.out.println("#ID: "+e.getIdEnd()+" | Rua: "+e.getRua()+" | Cidade: "+e.getCidade());
        }
        System.out.println("#----------------------------------------------------#");
    }
    //TODO criar uma classe para print de escolha
    public  static void printEscholhaCurso(Curso[] cursos){
        System.out.println("* Qual curso o aluno vai cursar: (Aguarde o carregamento!)");
        for(Curso c : cursos) {
            System.out.println(c.getIdCurso()+ " - " + c.getNome());
        }
    }

}

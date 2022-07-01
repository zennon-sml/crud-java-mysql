package printar;

import entidades.Aluno;
import entidades.Curso;

public class PrintAll {
    public static void printAllAluno(Aluno[] alunos){
        System.out.println("Printando todos os alunos");
        for(Aluno a : alunos){
            System.out.println(a.getId()+"-"+a.getNome()+"-"+a.idEnd+"-"+a.rua);
        }
    }
    public  static void printEscholhaCurso(Curso[] cursos){
        System.out.println("Escolha o ID, do curso vc faz parte:");
        for(Curso c : cursos) {
            System.out.println("ID: " + c.getIdCurso()+ "\nNome: " + c.getNome());
        }
    }
}

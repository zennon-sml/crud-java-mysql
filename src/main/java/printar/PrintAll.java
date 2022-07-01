package printar;

import entidades.Aluno;

public class PrintAll {
    public static void printAllAluno(Aluno[] alunos){
        System.out.println("Printando todos os alunos");
        for(Aluno a : alunos){
            System.out.println(a.getId()+"-"+a.getNome()+"-"+a.idEnd+"-"+a.rua);
        }
    }
}

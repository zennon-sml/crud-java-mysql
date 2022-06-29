import escolha.Escolha;
import java.util.Scanner;
public class Controller {
//    public static void main(String[] args){
//
//        //Aluno aluno = new Aluno();
//        //Views.printarEntidade(Models.selectAll("endereco"));

//        Scanner input = new Scanner(System.in);
//        System.out.print("1-Aluno\n2-Professor\n3-Disciplina\n4-Curso\n5-Turma\nR:");
//        int resposta = input.nextInt();
//
//        Escolha esc = new Escolha();
//        if (resposta == 1){esc.aluno();}
//        else if (resposta == 2) {esc.professor();}
//        else if (resposta == 3) {esc.disciplina();}
//        else if (resposta == 4) {esc.curso();}
//        else if (resposta == 5) {esc.turma();}
//    }
    public static void main(String[] args){
        //Models.customQuery("INSERT into endereco (rua,numero,cidade,cep,estado) VALUES (?,?,?,?)",);


        //Aluno aluno = new Aluno();
        //Views.printarEntidade(Models.selectAll("endereco"));
//        Scanner input = new Scanner(System.in);
//        System.out.print("1-Aluno\n2-Professor\nR:");
//        int resposta = input.nextInt();
//        Escolha esc = new Escolha();
//        if (resposta == 1){
//            esc.aluno();
//        } else if (resposta == 2) {
//            esc.professor();
//        }
        System.out.println("Enderecos:");
        Views.printar(Models.selectAllEndereco());

        System.out.println("Professores:");
        Models.selectAllProfessor();
        System.out.println("Alunos:");
        Models.selectAllAluno();

        System.out.println("Disciplinas:");
        Models.selectAllDisciplina();
        System.out.println("Cursos:");
        Models.selectAllCurso();
    }
}
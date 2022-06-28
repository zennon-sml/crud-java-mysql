import escolha.Escolha;
import java.util.Scanner;
public class Controller {
    public static void main(String[] args){

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
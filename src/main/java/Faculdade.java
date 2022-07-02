import escolha.Escolha;
import java.util.Scanner;

public class Faculdade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("1-Aluno\n2-Professor\n3-Disciplina\n4-Curso\n5-Turma\nR:");
        int resposta = input.nextInt();

        Escolha esc = new Escolha();
        if (resposta == 1){esc.aluno();}
        else if (resposta == 2) {esc.professor();}
        else if (resposta == 3) {esc.disciplina();}
        else if (resposta == 4) {esc.curso();}
        else if (resposta == 5) {esc.turma();}
    }
}
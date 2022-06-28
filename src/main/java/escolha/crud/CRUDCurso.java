package escolha.crud;

import entidades.Curso;
import java.util.Scanner;

public class CRUDCurso {
    Curso curso = new Curso();
    Scanner input = new Scanner(System.in);

    public void createCurso() {
        System.out.println("CREATE CURSO");
        System.out.print("Codigo: ");
        curso.setCodigo(input.nextInt());
        System.out.print("Nome: ");
        curso.setNome(input.nextLine());
        System.out.print("Descrição: ");
        curso.setDescricao(input.nextLine());
        System.out.print("Numero de Periodos: ");
        curso.setNumeroPeriodos(input.nextInt());
    }
    public void readCurso(){

    }
    public void updateCurso(){

    }
    public void deleteCurso(){

    }
}

package escolha.crud;

import entidades.Disciplina;
import java.util.Scanner;

public class CRUDDisciplina {
    Disciplina dis = new Disciplina();
    Scanner input = new Scanner(System.in);

    public void createDisciplina(){
        System.out.println("CREATE DISCIPLINA");
        System.out.print("Codigo: ");
        dis.setCodigo(input.nextInt());
        System.out.print("Descrição: ");
        dis.setDescricao(input.nextLine());
        System.out.print("Carga Horaria: ");
        dis.setCargaHoraria(input.nextLine());
        System.out.print("Numero de creditos: ");
        dis.setNumeroCreditos(input.nextInt());
    }
    public void readDisciplina(){

    }
    public void updateDisciplina(){

    }
    public void deleteDisciplina(){

    }
}

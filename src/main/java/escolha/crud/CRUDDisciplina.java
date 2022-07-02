package escolha.crud;

import consultas.SelectAll;
import consultas.SelectById;
import entidades.Disciplina;
import printar.PrintAll;
import printar.PrintById;

import java.util.Scanner;

public class CRUDDisciplina {
    Disciplina dis = new Disciplina();
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    PrintById pb = new PrintById();

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
        System.out.println("Digite o ID do Disciplina que deseja ver:\nR: ");
        int disciplinaid = inputInt.nextInt();
        pb.printDisciplina(SelectById.selectDisciplina(disciplinaid));
    }
    public void updateDisciplina(){

    }
    public void deleteDisciplina(){

    }
    public void printAllDisciplina(){
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
    }
}

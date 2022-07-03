package entidades;

public class ProfessorDisciplina {
    int id;
    int fkDisciplina;
    int fkProfessor;

    public void setFkDisciplina(int fkDisciplina) {
        this.fkDisciplina = fkDisciplina;
    }
    public void setid(int id) {this.id = id;}
    public void setFkProfessor(int fkProfessor) {
        this.fkProfessor = fkProfessor;
    }

    public int getFkDisciplina() {
        return fkDisciplina;
    }

    public int getFkProfessor() {
        return fkProfessor;
    }
    public int getId(){return id;}
}

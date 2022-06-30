package entidades;

public class AlunoProfessor {
    int fkAluno;
    int fkProfessor;

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public void setFkProfessor(int fkProfessor) {
        this.fkProfessor = fkProfessor;
    }

    public int getFkProfessor() {
        return fkProfessor;
    }

    public int getFkAluno() {
        return fkAluno;
    }
}

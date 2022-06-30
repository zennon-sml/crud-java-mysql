package entidades;

public class TurmaAluno {
    int fkTurma;
    int fkAluno;

    public void setFkAluno(int fkAluno) {
        this.fkAluno = fkAluno;
    }

    public void setFkTurma(int fkTurma) {
        this.fkTurma = fkTurma;
    }

    public int getFkAluno() {
        return fkAluno;
    }

    public int getFkTurma() {
        return fkTurma;
    }
}

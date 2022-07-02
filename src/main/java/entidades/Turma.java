package entidades;

public class Turma {
    int idTur;
    int codigo;
    String sala;
    String horario;
    int FK_Professor_Disciplina;

    //--------------------------------> sets

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setFK_Professor_Disciplina(int FKPD){FK_Professor_Disciplina = FKPD; }
    public void setIdTur(int idTUr){this.idTur = idTUr; }

    //-------------------------------------------> gets

    public  int getIdTur(){return idTur;}
    public int getCodigo() {
        return codigo;
    }

    public String getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }
    public int getFK_Professor_Disciplina(){return FK_Professor_Disciplina;}
}

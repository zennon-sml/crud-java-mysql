package entidades;

public class Turma {
    int codigo;
    String sala;
    String horario;

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

    //-------------------------------------------> gets

    public int getCodigo() {
        return codigo;
    }

    public String getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }
}

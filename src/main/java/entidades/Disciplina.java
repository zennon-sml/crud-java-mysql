package entidades;

public class Disciplina {
    int idDis;
    int codigo;
    String descricao;
    String cargaHoraria;
    int numeroCreditos;

    //---------------------------------------------> sets


    public void setIdDis(int idDis) {
        this.idDis = idDis;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    //---------------------------------------------------> gets


    public int getIdDis() {
        return idDis;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }
}

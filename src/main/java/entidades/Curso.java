package entidades;

public class Curso {
    int idEnd;
    int codigo;
    String nome;
    String descricao;
    int numeroPeriodos;

    //-------------------------------------------> sets


    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumeroPeriodos(int numeroPeriodos) {
        this.numeroPeriodos = numeroPeriodos;
    }

    //---------------------------------------------> gets


    public int getIdEnd() {
        return idEnd;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroPeriodos() {
        return numeroPeriodos;
    }
}

package entidades;

public interface IPessoa {
    void setId(int id);
    void setNome(String nome);
    void setTelefone(String telefone);
    int getId();
    String getNome();
    String getTelefone();
}

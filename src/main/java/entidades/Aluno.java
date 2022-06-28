package entidades;

public class Aluno extends Endereco implements IPessoa {
    String matricula;
    String nome;
    String telefone;
    String dataNas;
    String sexo;

    //------------------------------------> sets

    @Override
    public void setId(String matricula){
        this.matricula = matricula;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setDataNas(String data){
        this.dataNas = data;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //-----------------------------------> gets

    @Override
    public String getId() {
        return matricula;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public String getDataNas() {
        return dataNas;
    }

    public String getSexo() {
        return sexo;
    }
}

package entidades;

public class Aluno extends Endereco implements IPessoa {
    int id;
    String matricula;
    String nome;
    String telefone;
    String dataNas;
    String sexo;

    //------------------------------------> sets

    @Override
    public void setId(int id){
        this.id = id;
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

    public  void setMatricula(String matricula) {this.matricula = matricula; }

    //-----------------------------------> gets

    @Override
    public int getId() {
        return id;
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

    public String getMatricula(){return matricula;}
}

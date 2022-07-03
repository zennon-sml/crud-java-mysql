package entidades;

public class Professor extends Endereco implements IPessoa{
    int id;
    int registro;
    String nome;
    String telefone;
    String especialidade;
    String maiorTitulacao;
    int fkEndereco;

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

    public void setRegistro(int registro) {this.registro = registro;}
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setMaiorTitulacao(String maiorTitulacao){
        this.maiorTitulacao = maiorTitulacao;
    }
    public void setFkEndereco(int fkEndereco) {this.fkEndereco = fkEndereco;}

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

    public String getEspecialidade() {
        return especialidade;
    }

    public String getMaiorTitulacao() {
        return maiorTitulacao;
    }

    public int getRegistro(){return registro; }
    public int getFkEndereco() {return fkEndereco;}
}



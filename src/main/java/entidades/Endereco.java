package entidades;

public class Endereco {
    public int idEnd;
    public String rua;
    public String numero;
    public String cidade;
    public String cep;
    public String estado;
    public String complemento;

//-----------------------------------------> sets

    public void setIdEnd(int idEnd) {
        this.idEnd = idEnd;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

//-----------------------------------------> gets

    public int getIdEnd() {
        return idEnd;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento(){
        return complemento;
    }
}

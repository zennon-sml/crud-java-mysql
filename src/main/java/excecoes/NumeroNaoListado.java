package excecoes;

public class NumeroNaoListado extends Exception{
    private int num;
    public NumeroNaoListado(int num){
        super();
        this.num = num;
    }

    @Override
    public String toString() {
        return "O número " +num+ " não é uma escolha disponivel";
    }
}

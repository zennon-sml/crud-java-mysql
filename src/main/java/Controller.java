public class Controller {
    public static void main(String[] args){
        Views.printarEntidade(Models.selectAll("endereco"));
    }
}

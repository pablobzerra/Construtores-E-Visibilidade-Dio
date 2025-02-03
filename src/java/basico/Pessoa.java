package java.basico;


public class Pessoa {

    // ----------------------
    // é como se fosse o __init__(params) do python 
    private  String nome = null;
    private String cpf = null;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Classe so com 1 parametro e o resto se torna nao obrigatorio
    public Pessoa(String nome) {
        super();
        this.nome = nome;
    }


    //Classe sem parametro (os parametro se torna nao obrigatorio)
    public Pessoa() {
        super();
    }




    //---------------
    public static void main(String[] args) {

    }
}
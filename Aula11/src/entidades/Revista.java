package entidades;
import interfaces.Imprimivel;

public class Revista implements Imprimivel{

    private String nome;
    private int numero;

    public Revista(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // método imprimivel

    @Override
    public void imprimir(){
        System.out.println(
                "Nome: " + this.nome +"Numero: "+this.numero);

    }
}

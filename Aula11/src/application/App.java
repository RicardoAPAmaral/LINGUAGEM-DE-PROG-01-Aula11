package application;
import entidades.Livro;
import entidades.Revista;
import interfaces.Imprimivel;

public class App {
    public static void main(String[] args) {

        //Instância de vetor

        Imprimivel[] vetorImprimiveis = new Imprimivel[2];

        // guardar um livro

        vetorImprimiveis[0]= new Livro(
                "linux, um guia prático",
                "Sobell");

        // guardar uma revista
        vetorImprimiveis[1]= new Revista(
                "Actia Sentia",
                2023);

        for (Imprimivel item: vetorImprimiveis){
            item.imprimir();

        }


    }
}

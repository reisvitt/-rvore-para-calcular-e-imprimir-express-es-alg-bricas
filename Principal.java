import models.arvore.Arvore;
import models.analise_lexica.AnaliseLexica;
import models.pilha.PilhaEncadeada;
import models.analise_sintaxe.AnaliseSintaxe;
import java.util.Scanner;


public class Principal{
    public static void main(String args[]){
    Scanner ler = new Scanner(System.in);

    AnaliseLexica analise = new AnaliseLexica();
    AnaliseSintaxe sintaxe = new AnaliseSintaxe();

    String frase = ler.next();

    if((analise.analisador(frase)) && (sintaxe.analisador(frase))){


    }




    }// fim método main
}// fim classe Principal

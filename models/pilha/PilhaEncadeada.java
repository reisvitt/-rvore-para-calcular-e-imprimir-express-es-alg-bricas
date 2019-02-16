package models.pilha;
public class PilhaEncadeada{
    private int count;
    ListaEncadeada lista;


    public PilhaEncadeada(){
        this.lista = new ListaEncadeada();
        this.count = 0;
    }

    public void fazVazia(){
        lista.fazerVazia();
        this.count = 0;
    }

    public Object getTop(){
        if(this.count == 0){
            System.out.println("Lista vazia");
            return null;
        }else{
            return lista.getPrimeiro();
        }
    }

    public boolean estaVazia(){
        return this.count == 0;
    }

    public void push(Object elemento){
        lista.inserirFinal(elemento);
        this.count++;
    }

    public Object pop(){
        if(this.count == 0){
            System.out.println("Lista vazia");
            return null;
        }else{
            Object retornar = lista.getPrimeiro();
            lista.extrair(retornar);
            this.count--;
            return retornar;
        }
    }

    public void mostrarLista(){
        lista.exibir();
    }

    public int getCount(){
        return this.count;
    }


}//fim classe

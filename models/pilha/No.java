package models.pilha;

/************************************************************
NÓ DA PILHA ENCADEADA SIMPLES COM HEAD MAS SEM TAIL
************************************************************/

public class No{
    private Object elemento;
    private No proximo;

    public No(Object element){
        this.elemento = element;
        this.proximo = null;
    }

    public void setElemento(Object element){
        this.elemento = element;
    }

    public Object getElemento(){
        return this.elemento;
    }

    public void setProximo(No proxim){
        this.proximo = proxim;
    }

    public No getProximo(){
        return this.proximo;
    }

}//fim classe

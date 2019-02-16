package models.arvore;

public class Arvore{
    private No raiz;


    public void adicionar(int elemento){
        No novo = new No(elemento);

        if(isEmpty()){ // raiz está vazia
            this.raiz = novo;
        }else{ // raiz diferente de vazia
            adicionar(this.raiz, novo);
        }

    }

    protected void adicionar(No noAtual, No novo){
        int valor = novo.getElemento();

        if(noAtual.getElemento() < valor){
            if(noAtual.getRight() != null){
                adicionar(noAtual.getRight(), novo);
            }else{
                noAtual.setRight(novo);
                System.out.println("Filho adicionado");
            }
        }else{
            if(noAtual.getLeft() != null){
                adicionar(noAtual.getLeft(), novo);
            }else{
                noAtual.setLeft(novo);
                System.out.println("Filho adicionado");
            }
        }
    }// fim método adicionar


    // public void remover();


    public void imprimir(){
        if(!isEmpty()){
            System.out.print("{");
            System.out.print(this.raiz.getElemento());
            imprimir(this.raiz);
            System.out.println();
        }
    }//fim método imprimir

    protected void imprimir(No noAtual){
        if(noAtual.getLeft() != null){
            System.out.print(", {");
            System.out.print(noAtual.getLeft().getElemento());
            imprimir(noAtual.getLeft());
        }

        if(noAtual.getRight() != null){
            System.out.print(", {");
            System.out.print(noAtual.getRight().getElemento());
            imprimir(noAtual.getRight());
        }
        System.out.print("}");
    }

    public boolean isEmpty(){
        return (this.raiz == null);
    }

    public No getRaiz(){
        return this.raiz;
    }


}// fim classe

package models.pilha;

public class ListaEncadeada{
    private No head, tail;

    public ListaEncadeada(){
        this.head = null;
        this.tail = null;
    }


    public void inserirFinal(Object elemento){
        No novo = new No(elemento);

        if(this.tail != null){
            this.tail.setProximo(novo);
            this.tail = novo;
        }else{
            this.head = novo;
            this.tail = novo;
        }
    }

    public void inserirInicio(Object elemento){
        No novo = new No(elemento);
        if(this.head != null){
            novo.setProximo(this.head);
            this.head = novo;
        }else{
            this.head = novo;
            this.tail = novo;
        }
    }

    public void extrair(Object elemento){
        if(this.head != null){
            if(this.head.getElemento().equals(elemento)){
                this.head = this.head.getProximo();
                if(this.head == null){
                    this.tail = null;
                }
            }else{
                No aux = this.head;
                while(aux != null){
                    if((aux.getProximo().getElemento().equals(elemento)) && (aux.getProximo().equals(this.tail))){
                        aux.setProximo(null);
                        this.tail = aux;
                        break;
                    }
                }
            }



        }
    }

    public void fazerVazia(){
        this.tail = null;
        this.head = null;
    }

    public void exibir(){
        if(this.head != null){
            No aux = this.head;
            System.out.println();
            System.out.print("Elementos: ");
            while(aux !=  null){
                System.out.print(aux.getElemento() + " ");
                aux = aux.getProximo();
            }
            System.out.println();
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public No getTail(){
        return this.tail;
    }

    public No getHead(){
        return this.head;
    }

    public boolean estaVazia(){
        return this.head == null;
    }

    public Object getPrimeiro(){
        return this.tail.getElemento();
    }

    public Object getUltimo(){
        return this.head.getElemento();
    }

    public void atribuir(ListaEncadeada l){
        /*
        não entendi esse método
        */
    }

}// fim classe

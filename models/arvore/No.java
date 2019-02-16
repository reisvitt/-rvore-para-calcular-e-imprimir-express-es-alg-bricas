package models.arvore;



//sem profundidade

public class No{
    private int elemento;
    private No rightChildren;
    private No leftChildren;

    public No(int elemento){
        this.elemento = elemento;
    }


	public int getElemento() {
		return this.elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public No getRight() {
		return this.rightChildren;
	}

	public void setRight(No rightChildren) {
		this.rightChildren = rightChildren;
	}

	public No getLeft() {
		return this.leftChildren;
	}

	public void setLeft(No leftChildren) {
		this.leftChildren = leftChildren;
	}

}// fim classe

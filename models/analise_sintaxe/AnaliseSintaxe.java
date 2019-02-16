package models.analise_sintaxe;
import models.pilha.PilhaEncadeada;

public class AnaliseSintaxe{

    PilhaEncadeada pilha;

    public AnaliseSintaxe(){
        pilha = new PilhaEncadeada();
    }

    public boolean analisador(String frase){
        int tam = frase.length() - 1;

        for(int i = 0; i <= tam; i++){

            // não é número?
            char l = frase.charAt(i);
            if(!number(l)){
                // não é operador
                if(!operador(l)){
                    if(parenteses(l) == 1){
                        if(pilha.estaVazia()){
                            pilha.push(l);
                        }else{
                            char aux = pilha.pop().toString().charAt(0);
                            if(operador(aux)){
                                pilha.push(l);
                            }else if(parenteses(aux) == 1){
                                pilha.push(aux);
                                pilha.push(l);
                            }else if(parenteses(aux) == 2){
                                return false;
                            }
                        }
                    }else if(parenteses(l) == 2){
                        if(pilha.estaVazia()){
                            return false;
                        }else{
                            char aux = pilha.pop().toString().charAt(0);
                            if(parenteses(aux) != 1){
                                return false;
                            }
                        }
                    }
                }
                // é operador
                else{
                    if(pilha.estaVazia()){
                        pilha.push(l);
                    }else{
                        char aux = pilha.pop().toString().charAt(0);
                        if(operador(aux)){
                            return false;
                        }else{
                            pilha.push(aux);
                            pilha.push(l);
                        }

                    }
                }
            }else{
                if(!pilha.estaVazia()){
                    char aux = pilha.pop().toString().charAt(0);
                    if(!operador(aux)){
                        if(parenteses(aux) == 2){
                            return false;
                        }
                        pilha.push(aux);
                    }
                }
            }// if number


        }//fim for

        if(pilha.estaVazia()){
            return true;
        }else{
            return false;
        }
    }//fim método


    private int parenteses(char par){
        if(par == '('){
            return 1;
        }else if(par == ')'){
            return 2;
        }else{
            return 0;
        }

    }

    private boolean operador(char op){
        switch(op){
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }


    private boolean number(char numb){
        switch(numb){
            case '0':
                return true;

            case '1':
                return true;

            case '2':
                return true;

            case '3':
                return true;

            case '4':
                return true;

            case '5':
                return true;

            case '6':
                return true;

            case '7':
                return true;

            case '8':
                return true;

            case '9':
                return true;
            default:
                return false;
        }
    }

}//fim classe

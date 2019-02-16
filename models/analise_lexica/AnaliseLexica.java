package models.analise_lexica;

public class AnaliseLexica{
    private String frase;

    public boolean analisador(String frase){
        int tam = frase.length() - 1;

        for(int i = 0; i <= tam; i++){
            if(!verificar(frase.charAt(i))){
                return false;
            }
        }
        return true;

    }

    protected boolean verificar(char carac){

        switch(carac){
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

            case '-':
                return true;

            case '+':
                return true;

            case '/':
                return true;

            case '*':
                return true;

            case '(':
                return true;

            case ')':
                return true;

            default:
                return false;

        }
    }


}// fim classe

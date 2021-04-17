package application.errors;
import application.Controllers.*;

public class Valida {
    public FeedBack validaSaldo(String titulo, double valor) {
        FeedBack resposta = new FeedBack("Saldo valido !!", true);
        if(titulo instanceof String && titulo.length() > 2){
            if(valor > 0) {
                return resposta;
            }
            else {
                resposta.setMensagem("Valor invalido !!");
                resposta.setStatus(false);
                return resposta;
            }
        }
        else {
            resposta.setMensagem("Titulo Invalido !!");
            resposta.setStatus(false);
            return resposta;
        }

    }

    public FeedBack validaTitulo(String titulo) {
        FeedBack resposta = new FeedBack("titulo valido!!", true);
        if(titulo instanceof String && titulo.length() > 2){
            return resposta;
        }
        else {
            resposta.setMensagem("Titulo Invalido: Adicione mais caracteres");
            resposta.setStatus(false);
            return resposta;
        }
    }

    public FeedBack validaValor(double valor) {
        FeedBack resposta = new FeedBack("Valor Valido!!", true);
        if(valor > 0){
            return resposta;
        }
        else {
            resposta.setMensagem("Valor Invalido : Não coloque valor negativo");
            resposta.setStatus(false);
            return resposta;
        }
    }

}

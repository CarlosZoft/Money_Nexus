package application.errors;
import application.Controllers.*;

public class Valida {
    
    
    
    public String Erro(int tipo){
        if(tipo==1)
            return "Selecione um item da lista";
        
     
        return "nada";    
    }
    
    /**
     *
     * @param titulo Titulo do saldo
     * @param valor Valor do saldo
     * @return FeedBack - True ou False
     */
    public FeedBack validaSaldo(String titulo, double valor) {
        FeedBack resposta = new FeedBack("Saldo Adicionado com Sucesso !!", true);
        if(titulo instanceof String && titulo.length() > 2 && !titulo.equals("Descricao")){
            if(valor <= 0) {
                resposta.setMensagem("Valor invalido !!");
                resposta.setStatus(false);
                return resposta;
            }
            else {
                return resposta;
            }
        }
        else {
            resposta.setMensagem("Titulo Invalido !!");
            resposta.setStatus(false);
            return resposta;
        }

    }

    /**
     *
     * @param titulo Titulo do Saldo;
     * @return FeedBack - True ou Falso
     */
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

    /**
     *
     * @param valor Valor a ser Adicionado
     * @return
     */
    public FeedBack validaValor(double valor) {
        FeedBack resposta = new FeedBack("Valor Adicionado!!", true);
        if(valor > 0){
            return resposta;
        }
        else {
            resposta.setMensagem("Valor Invalido : Não coloque valor negativo");
            resposta.setStatus(false);
            return resposta;
        }
    }

    /**
     *
     * @param valor Campo String a ser verificada
     * @return True ou false
     */
    public boolean verificaString(String valor){
        if(valor.isBlank()){
            return false;
        }
        for(int i = 0 ; i < valor.length(); ++i){
           char aux = valor.charAt(i);
           if((aux >= 65 && aux <= 90) || (aux >= 97 && aux <= 122)){
               return false;
           }
        }
        return true;
    } 

}

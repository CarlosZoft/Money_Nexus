package application.errors;

/**
 * Classe responsavel por validar entradas
 * @author Carlos Rafael 
 * @version 1.0.0
 */
public class Valida {
    
    
    /**
     * Metodo responsavel por organizar mensagens de erros conhecidos
     * @param tipo tipo de erro
     * @return Mensagem de erro
     */
    public String Erro(int tipo){
        if(tipo==1)
            return "Selecione um item da lista";
        if(tipo==2)
            return"Selecione a divida fixa a ser excluida";
        if(tipo==3)
            return "Nao foi possivel excluir despesa, devido a um erro desconhecido";
        if(tipo==4)
            return "Selecione o tipo de despesa";
        if(tipo==5)
            return "Nao foi possivel adicionar despesa, devido a um erro desconhecido";
        if(tipo==6)
            return "Selecione a divida fixa a ser excluída";
        if(tipo==7)
            return "Nao foi possivel excluir despesa, devido a um erro desconhecido";
        if(tipo==8)
            return "Nao foi possível adicionar saldo.";
        if(tipo==9)
            return "Nao foi possível retirar saldo."; 
        if(tipo==10)
            return "Nao foi possivel adicionar Economia";
        if(tipo==11)
            return "Nao foi possivel excluir economia";
        if(tipo==12)
            return "Despesa Adicionada com sucesso";
        return "nada";    
    }
    
    /**
     * Metodo responsavel por organizar mensagens
     * @param tipo tipo de situa��o
     * @return Mensagem auxiliar 
     */
    public String Others (int tipo){
        if(tipo==1)
           return "Saldo retirado com Sucesso!";
        if(tipo==2)
            return "Economia removida com sucesso";
        return "";
    }
    
    
    /**
     * Metodo responsavel por validar saldo (Titulo, Valor)
     * @param titulo tipo do saldo 
     * @param valor valor do saldo
     * @return Feedback 
     */
    public FeedBack validaSaldo(String titulo, double valor) {
        FeedBack resposta = new FeedBack("Saldo Adicionado com Sucesso !!", true);
        if(titulo instanceof String && titulo.length() > 2 && !titulo.equals("Descricao") && !titulo.isBlank()){
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
     * Metodo responsavel por validar titulo 
     * @param titulo titulo 
     * @return Feedback 
     */
    public FeedBack validaTitulo(String titulo) {
        
        FeedBack resposta = new FeedBack("titulo valido!!", true);
        if(titulo instanceof String && titulo.length() > 2 && !titulo.isBlank()){
            return resposta;
        }
        else {
            resposta.setMensagem("Titulo Invalido: Adicione mais caracteres");
            resposta.setStatus(false);
            return resposta;
        }
        
    }

    /**
     * Metodo responsavel por validar valor
     * @param valor valor a ser validado
     * @return Feedback 
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
     * Metodo responsavel por validar string de entrada 
     * @param valor string a ser validada
     * @return true or false
     */
    public boolean verificaString(String valor){
        
        if(valor.isBlank()){
            return false;
        }
        for(int i = 0 ; i < valor.length(); ++i){
           char aux = valor.charAt(i);
           if(aux < 48 || aux > 57){
               return false;
           }
        }
        return true;
        
    } 

}

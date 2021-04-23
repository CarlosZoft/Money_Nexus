package application.errors;
/**
 * Class responsavel por dar feedback 
 * @author Helder Lourenço
 * @version 1.0.0
 */
public class FeedBack {
    private String Mensagem;
    private boolean Status;
    
    /**
     * Metodo construtor
     * @param Mensagem Descricao do feedback
     * @param Status Status do feedback True ou False 
     */
    public FeedBack(String Mensagem, Boolean Status){
        this.Mensagem = Mensagem;
        this.Status = Status;
    }
    /**
     * Metodo responsavel por retornar a mensagem
     * @return mensagem 
     */
    public String getMensagem() {
        return Mensagem;
    }
    /**
     * Metodo responsavel por setar mensagem
     * @param mensagem Mensagem
     */
    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }
    /**
     * Metodo responsavel por retornar o status
     * @return status 
     */
    public boolean isStatus() {
        return Status;
    }
    /**
     * Metodo para setar status
     * @param status Status
     */
    public void setStatus(boolean status) {
        Status = status;
    }
}

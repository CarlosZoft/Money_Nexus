package application.errors;

public class FeedBack {
    private String Mensagem;
    private boolean Status;

    public FeedBack(String Mensagem, Boolean Status){
        this.Mensagem = Mensagem;
        this.Status = Status;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}

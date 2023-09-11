public class Entrega{

    private int codigo;
    private double valor;
    private String descricao;
    private String emailCliente;


    public Entrega (int codigo, double valor, String descricao, String emailCliente){
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
        this.emailCliente = emailCliente;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void add(Entrega entrega) {
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
            return this.descricao;
        }

    public String getEmailCliente() {
            return this.emailCliente;
        }

}
import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String email;
    private String endereco;


    public Cliente (String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }


    public boolean addEntrega(Entrega entrega) {

        return false;
    }


    public ArrayList<Entrega> pesquisaEntregas(){

        return null;
    }


    public String getEmail(){
        return this.email;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
            return this.endereco;
        }
}
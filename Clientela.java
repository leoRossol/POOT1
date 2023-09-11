import java.util.ArrayList;

public class Clientela {
    private ArrayList<Cliente> clientes;

    public Clientela() {
        clientes = new ArrayList<>();
    }

    public boolean cadastraCliente(Cliente cliente) {
        if (verificaEmail(cliente.getEmail())) {
            System.out.println("CLIENTE JA CADASTRADO");
            return false;
        } else {
            clientes.add(cliente);
            System.out.println("Cliente cadastrado");
            return true;
        }
    }

    public boolean verificaEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public int qtdClientes(){
        return clientes.size();
    }


    public Cliente pesquisaCliente(String email2) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email2)) {
                return cliente;
            }
        }
        return null;
    }

    public String pesquisaEnderecoCliente(String email) {
    for (Cliente cliente : clientes) {
        if (cliente.getEmail().equals(email)) {
            return cliente.getEndereco();
        }
    }
    return null;
}


}
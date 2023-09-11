import java.util.ArrayList;

public class ACMEDelivery {

    private static CadastroEntregas cadastroEntregas;
    private static Clientela clientela;

    

    public ACMEDelivery() {
        this.cadastroEntregas = new CadastroEntregas();
        this.clientela = new Clientela();
    }

    public void executa(String filePOO, String email2, String email3, String email4, int codigo2, int codigo3) {

        // 1. Cadastrar clientes
        Leitor.LerClienteEntrega(filePOO, clientela, cadastroEntregas);
        
        // 2. Cadastrar entregas
        Leitor.LerClienteEntrega(filePOO, clientela, cadastroEntregas);

        // 3. Mostrar quantos clientes foram cadastrados 
        int qtdClientes = clientela.qtdClientes();
        System.out.println("3;" + qtdClientes + " clientes cadastrados");

        // 4. Mostrar quantas entregas foram cadastradas 
        int qtdEntregas = cadastroEntregas.qtdEntregas();
        System.out.println("4;" + qtdEntregas + " entregas cadastradas");

        // 5. Mostrar os dados de um determinado cliente 
        if (email2 != null) {
            Cliente encontrar = clientela.pesquisaCliente(email2);
                if (encontrar != null) {
                System.out.println("5;" + encontrar.getEmail() + ";" + encontrar.getNome() + ";" + encontrar.getEndereco());
            } else {
                System.out.println("5;Cliente inexistente");
            }

        
        // 6. Mostrar os dados de uma determinada entrega 
        if (codigo2 != 0) {
            Entrega encontrar2 = cadastroEntregas.pesquisaEntrega(codigo2);
                if (encontrar2!= null) {
                System.out.println("6;" + encontrar2.getCodigo() + ";" + encontrar2.getDescricao() + ";" + encontrar2.getValor());
            } else {
                System.out.println("6;Entrega inexistente");
            }
        }

    // 7. Mostrar os dados das entregas de um determinado cliente
       if (email3 != null) {
        ArrayList<Entrega> dadosEntrega = cadastroEntregas.pesquisaEntrega(email3);
            if (dadosEntrega != null) {
                for (Entrega entrega : dadosEntrega) {
                System.out.println("7;" + entrega.getCodigo() + ";" + entrega.getDescricao() + ";" + entrega.getValor());
                }
         } else {
            System.out.println("7;Entrega inexistente");
    }
}

        // 8. Mostrar os dados da entrega de maior valor 
        Entrega entregaMaiorValor = cadastroEntregas.entregaComMaiorValor();
        if (entregaMaiorValor != null) {
        System.out.println("8;" + entregaMaiorValor.getCodigo() + ";" + entregaMaiorValor.getDescricao() + ";" + entregaMaiorValor.getValor());
        } else {
        System.out.println("8;Nenhuma entrega cadastrada");
        }


        // 9. Mostrar o endereço de uma determinada entrega 
        if (codigo3 != 0) {
        String emailCliente = cadastroEntregas.pesquisaEmailEntrega(codigo3);
        if (emailCliente != null) {
            String enderecoCliente = clientela.pesquisaEnderecoCliente(emailCliente);
            if (enderecoCliente != null) {
                System.out.println("9;" + enderecoCliente);
            } else {
                System.out.println("9;Endereço do cliente não encontrado");
            }
        } else {
            System.out.println("9;Entrega não encontrada");
        }
    }

        // 10. Mostrar o somatório de valores de entregas de determinado cliente 
         if (codigo3 != 0) {
        String emailCliente = cadastroEntregas.pesquisaEmailEntrega(codigo3);
        if (emailCliente != null) {
            String enderecoCliente = clientela.pesquisaEnderecoCliente(emailCliente);
            if (enderecoCliente != null) {
                System.out.println("9;" + enderecoCliente);
            } else {
                System.out.println("9;Endereço do cliente não encontrado");
            }
        } else {
            System.out.println("9;Entrega não encontrada");
        }
    }

   }
  }

    }

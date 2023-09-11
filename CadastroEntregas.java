import java.util.ArrayList;

public class CadastroEntregas{
    private Entrega entrega;
    public ArrayList<Entrega> entregas;


    public boolean cadastraEntrega(Entrega entregas) {
        if (verificaCodigo(entrega.getCodigo())) {
            System.out.println("CLIENTE JA CADASTRADO");
            return false;
        } else {
            entregas.add(entrega);
            System.out.println("Cliente cadastrado");
            return true;
        }
    }



  public boolean verificaCodigo(int codigo){
        for (Entrega entrega : entregas){
            if (entrega.getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }



    public Entrega pesquisaEntrega (int codigo){
        return null;
    }


    public ArrayList<Entrega> pesquisaEntrega(String email){
        return null;
    }


    public int qtdEntregas(){
        return entregas.size();
    }

    public String pesquisaEmailEntrega(int codigo){
        for (Entrega entrega : entregas){
            if (entrega.getCodigo() == codigo){
                return entrega.getEmailCliente();
            }
        }
        return null;
}


public Entrega entregaComMaiorValor() {
        if (entregas.isEmpty()) {
            return null; 
        }

        Entrega maiorEntrega = entregas.get(0);
        double maiorValor = maiorEntrega.getValor();

        for (int i = 1; i < entregas.size(); i++) {
            Entrega entregaAtual = entregas.get(i);
            double valorAtual = entregaAtual.getValor();

            if (valorAtual > maiorValor) {
                maiorValor = valorAtual;
                maiorEntrega = entregaAtual;
            }
        }
        return maiorEntrega;
    }
}

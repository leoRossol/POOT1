import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {
    public static void LerClienteEntrega(String filePOO, Clientela clientela, CadastroEntregas cadastroEntregas) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePOO));
            String linha;
            boolean lerClientes = true;
            boolean lerEntregas = false;
            int cont = 0;
            String email2 = null;
            int codigo2 = 0;
            String email3 = null;
            int codigo3 = 0;
            String email4 = null;

            while ((linha = reader.readLine()) != null) {
                if (linha.equals("-1")) {
                    cont++;
                
                
                } else if (cont == 0) {
                    String[] dados = linha.split("\n");
                    if (dados.length == 1) {
                        String[] info = dados[0].split(" ");
                        if (info.length == 3) {
                            String nome = info[0];
                            String email = info[1];
                            String endereco = info[2];
                            if (clientela.verificaEmail(email)) {
                                System.out.println("CLIENTE JA CADASTRADO");
                            } else {
                                Cliente cliente = new Cliente(nome, email, endereco);
                                clientela.cadastraCliente(cliente);
                            }
                        } else {
                            System.out.println("FORMATO INVALIDO");
                        }
                    } else {
                        System.out.println("FORMATO INVALIDO");
                    }


                } else if (cont == 1) {
                    String[] dados = linha.split("\n");
                    if (dados.length == 1) {
                        String[] info = dados[0].split(" ");
                        if (info.length == 4) {
                            int codigo = Integer.parseInt(info[0]);
                            double valor = Double.parseDouble(info[1]);
                            String descricao = info[2];
                            String emailCliente = info[3];
                            if (cadastroEntregas.verificaCodigo(codigo)) {
                                System.out.println("ENTREGA JA CADASTRADA");
                            } else {
                                Entrega entrega = new Entrega(codigo, valor, descricao, emailCliente);
                                cadastroEntregas.cadastraEntrega(entrega);
                            }
                        } else {
                            System.out.println("FORMATO INVALIDO");
                        }
                    } else {
                        System.out.println("FORMATO INVALIDO");
                    }


                } else if (cont == 2) {
                    String[] dados = linha.split("\n");
                    if (dados.length == 1) {
                        String[] info = dados[0].split(" ");
                        if (info.length == 5) {
                            email2 = info[0];
                            codigo2 = Integer.parseInt(info[1]);
                            email3 = info[2];
                            codigo3 = Integer.parseInt(info[3]);
                            email4 = info[4];
                        }
                    }
                    cont = 0;
                }
                if (cont == 0) {
                    ACMEDelivery.executa(email4, clientela, cadastroEntregas, email2, codigo2, email3, codigo3, email4);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }

    public static void lerEntregas(String filePOO, ArrayList<Entrega> entregas) {
    }
}

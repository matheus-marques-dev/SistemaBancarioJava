package servico;

import modelo.Conta;
import java.util.ArrayList;
import java.util.List;

public class BancoServico {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("DEBUG: Conta adicionada! Total de contas agora: " + contas.size());
    }

    public Conta buscarConta(String numero) {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }

    public void listarContas() {
        System.out.println("DEBUG: INICIANDO LISTAGEM");
        System.out.println("DEBUG: O tamanho da lista é: " + contas.size());

        if (contas.isEmpty()) {
            System.out.println("AVISO: A lista está vazia.");
        } else {
            for (Conta c : contas) {
                System.out.println("IMPRIMINDO: " + c);
            }
        }
        System.out.println("DEBUG: FIM DA LISTAGEM");
    }
}
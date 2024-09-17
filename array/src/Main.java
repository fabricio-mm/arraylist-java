
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        // Add elemento ao final
        contatos.add(new Contato("Domartelo", "domartela@gmail.com", "4002-8922"));
        contatos.add(new Contato("Da20", "da20@gmail.com", "3254-8845"));

        // Verifica a quantidade de elementos
        System.out.println("Quantidade de contatos: " + contatos.size());

        // Printa elementos do array
        System.out.println("Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }

        // Obter contato de uma posição do array
        int pos = 1; // Exemplo de posição
        System.out.println("Contato na posição " + pos + ": " + contatos.get(pos));

        // Verificar se elemento existe no array
        String emailParaBuscar = "domartela@gmail.com";
        boolean encontrado = contatos.stream().anyMatch(c -> c.getEmail().equals(emailParaBuscar));
        System.out.println("Contato com e-mail " + emailParaBuscar + " encontrado: " + encontrado);

        // Add elemento em qualquer posição do array
        contatos.add(1, new Contato("CharlieChapinha", "charliechapinha@gmail.com", "1234-5678"));

        // Dobra o tamanho do vetor
        int tamanhoOriginal = contatos.size();
        System.out.println("Duplicando o tamanho da lista. Tamanho original: " + tamanhoOriginal);
        for (int i = 0; i < tamanhoOriginal; i++) {
            contatos.add(contatos.get(i)); // Adiciona novamente os elementos existentes
        }

        // Remove
        contatos.remove(1);

        // Pesquisa por nome
        String nomeParaBuscar = "CharlieChapinha";
        System.out.println("Pesquisa por nome:");
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeParaBuscar)) {
                System.out.println("Contato encontrado: " + contato);
            }
        }

        // Pesquisa por e-mail
        String emailParaBuscar2 = "da20@gmail.com";
        System.out.println("Pesquisa por e-mail:");
        for (Contato contato : contatos) {
            if (contato.getEmail().equals(emailParaBuscar2)) {
                System.out.println("Contato encontrado: " + contato);
            }
        }

        // Pesquisa por telefone
        String telefoneParaBuscar = "4002-8922";
        System.out.println("Pesquisa por telefone:");
        for (Contato contato : contatos) {
            if (contato.getTelefone().equals(telefoneParaBuscar)) {
                System.out.println("Contato encontrado: " + contato);
            }
        }
    }
}

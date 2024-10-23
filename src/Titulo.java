public class Titulo implements Comparable<Titulo> {
    private String nome;

    // Construtor
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodo compareTo da interface Comparable
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    // facilitar a exibição
    @Override
    public String toString() {
        return "Linguagem de Programacao: " + "'" + nome + '\'';
    }
}
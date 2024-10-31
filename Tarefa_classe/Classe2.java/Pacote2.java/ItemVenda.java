public class ItemVenda {

    private int quantidade;
    private int codigo;
    private String nome;
    private String endereco;

    // Construtor
    public ItemVenda(int quantidade, int codigo, String nome, String endereco) {
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters
    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    // Setters
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para mostrar os detalhes do ItemVenda
    public void mostrarDetalhes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Endereço: " + endereco);
    }
}

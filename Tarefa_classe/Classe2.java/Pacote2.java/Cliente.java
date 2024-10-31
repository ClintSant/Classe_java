public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String retornarNomeCliente(){
        return "Endereço do Clinton";
    }
    // Método para cadastrar o endereço
    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco; // Usa o endereço passado como argumento
        setEndereco(endereco); // Pode até chamar o setter, mas aqui não seria necessário
    }
    public void imprimirEndereco () {
        System.out.println(this.endereco);

    public int getValorTotal(){
        return 20;
    }

    }
}

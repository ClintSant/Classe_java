public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Clinton");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(end);
        System.out.println(client.getValorTotal);
    }
} 

class Cliente {
    private int codigo;
    private String endereco;

    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void imprimirEndereco() {
        System.out.println("Endereço: " + this.endereco);
    }
}

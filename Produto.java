public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private int quantidade;

    public Produto() { };

    public Produto(String nome, String marca, double valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.println("---------------- Informação do Produto ---------------");
        System.out.println("Nome" + getNome());
        System.out.println("Marca"+ getMarca());
        System.out.println("Valor" + getValor());
        System.out.println("Quantidade" + getQuantidade());

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Ciclano");
        System.out.println(p1.getNome());
        Produto p2 = new Produto("Mouse", "logitech", 130, 12);
        p2.exibirProduto();
        Produto p3 = new Hardware();
        p3.setQuantidade(19);
        Produto p4 = new Hardware("Memoria RAMz", "Kingston", 680.00, 12, "DDR4 16GB 3600Ghz");
        p4.exibirProduto();
        Produto p5 = new Periferico("teclado", "Corsair", 3459.80, 5, "USB");
        p5.exibirProduto();
    }
}
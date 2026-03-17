public class EscolaApp {
    public String nomeEscola;
    public String cidade;
    public int quantidadeSalas;

    // Metodos públicos
    public void abrirEscola() {
        System.out.println("A escola está aberta! \n");
    }

    public void mostrarDadosEscola() {
        System.out.println("Escola: " + nomeEscola);
        System.out.println("Cidade: " + cidade);
        System.out.println("Numero de salas: " + quantidadeSalas + "\n");
    }

    public void fecharEscola() {
        System.out.println("\nA escola está fechada!");
    }
}

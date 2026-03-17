public class Aluno {
    public String nome;
    public int matricula;
    public int idade;
    public double notaFinal;

    // Metodos públicos
    public void exibirAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
        System.out.println("Nota Final: " + notaFinal);
    }

    public void estudar() {
        System.out.println(nome + " está estudando!");
    }

    public void fazerProva() {
        System.out.print("Aluno: " + nome + " fez a prova \n");
        notaFinal = 7.5;
    }

    public void consultarResultado() {
        if (notaFinal > 7 ) {
            System.out.println("Foi aprovado com sucesso, com a nota final: " + notaFinal);
        } else {
            System.out.println("Não conseguiu a média nescessária, nota final: " + notaFinal);
        }
    }
}

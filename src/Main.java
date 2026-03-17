public class Main {
    public static void main(String[] args) {

        // Objeto escola
        EscolaApp escola = new EscolaApp();

        escola.nomeEscola = "Eeep luiza de teodoro vieira";
        escola.cidade = "Pacatuba - CE";
        escola.quantidadeSalas = 9;

        // Objeto estudante
        Aluno estudante = new Aluno();

        estudante.nome = "Micael";
        estudante.matricula = 4931832;
        estudante.idade = 17;

        // Usando os metodos publicos
        escola.abrirEscola();
        escola.mostrarDadosEscola();

        estudante.exibirAluno();
        estudante.estudar();
        estudante.fazerProva();
        estudante.consultarResultado();

        escola.fecharEscola();

    }
}
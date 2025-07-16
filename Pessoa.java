class Pessoa {
    private String nome;
    private int idade;
    private Data nascimento = new Data();

    Pessoa(String nome) {
        this.nome = nome;
    }

    public void ajustarData(int dia, int mes, int ano) {
        nascimento.ajustarData(dia, mes, ano);
    }

    public void calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - nascimento.ano;
        if (mesAtual < nascimento.mes || (mesAtual == nascimento.mes && diaAtual < nascimento.dia)) {
            idade--;
        }
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarIdade() {
        return idade;
    }

    public void imprimirDataNascimento() {
        nascimento.imprimirData();
    }
}

public class Principal {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        pessoas[0] = new Pessoa("Grace Hopper");
        pessoas[0].ajustarData(9, 12, 1906);

        pessoas[1] = new Pessoa("Ada Lovelace");
        pessoas[1].ajustarData(10, 12, 1815);

        for (Pessoa p : pessoas) {
            p.calcularIdade(16, 7, 2025);
            System.out.println("Nome: " + p.retornarNome());
            System.out.print("Data de nascimento: ");
            p.imprimirDataNascimento();
            System.out.println("Idade: " + p.retornarIdade() + " anos\n");
        }

        System.out.println("\n--- EXERCÍCIO CONTADOR ---");
        Contador c = new Contador();
        c.incrementar(); c.incrementar();
        c.decrementar();
        System.out.println("Valor do contador: " + c.getValor());
    }
}

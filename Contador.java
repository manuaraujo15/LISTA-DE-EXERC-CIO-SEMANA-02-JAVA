public class Contador {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor >= 0) this.valor = valor;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0) valor--;
    }
}

/*
Exemplos de classes que poderiam usar Contador:
1. CarrinhoDeCompras (contar itens)
2. Elevador (contar pessoas dentro)
3. Jogador (contar número de vidas ou pontos)
4. Impressora (contar número de páginas impressas)
5. Sistema de Login (contar tentativas de acesso)
*/

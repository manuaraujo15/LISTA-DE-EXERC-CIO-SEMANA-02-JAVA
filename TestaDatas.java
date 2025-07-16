public class TestaDatas {
    public static void main(String[] args) {
        Data d1 = new Data(); d1.ajustarData(15, 6, 2020);
        Data d2 = new Data(); d2.ajustarData(10, 7, 2023);
        Data d3 = new Data(); d3.ajustarData(1, 1, 2021);

        Data maior = d1;
        Data menor = d1;

        if (d2.posterior(maior)) maior = d2;
        if (d3.posterior(maior)) maior = d3;

        if (d2.anterior(menor)) menor = d2;
        if (d3.anterior(menor)) menor = d3;

        System.out.println("Maior data: " + maior);
        System.out.println("Menor data: " + menor);
    }
}

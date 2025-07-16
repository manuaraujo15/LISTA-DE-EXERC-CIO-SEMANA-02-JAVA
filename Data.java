public class Data {
    int dia, mes, ano;

    void ajustarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    boolean anterior(Data outra) {
        if (ano < outra.ano) return true;
        if (ano == outra.ano && mes < outra.mes) return true;
        return ano == outra.ano && mes == outra.mes && dia < outra.dia;
    }

    boolean posterior(Data outra) {
        if (ano > outra.ano) return true;
        if (ano == outra.ano && mes > outra.mes) return true;
        return ano == outra.ano && mes == outra.mes && dia > outra.dia;
    }

    boolean equals(Data outra) {
        return dia == outra.dia && mes == outra.mes && ano == outra.ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

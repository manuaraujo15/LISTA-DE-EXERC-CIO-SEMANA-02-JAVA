public class Time {
    int hora, minuto;

    Time(int h, int m) {
        hora = h;
        minuto = m;
    }

    boolean anterior(int h, int m) {
        return (hora < h) || (hora == h && minuto < m);
    }

    boolean posterior(int h, int m) {
        return (hora > h) || (hora == h && minuto > m);
    }

    boolean equals(int h, int m) {
        return hora == h && minuto == m;
    }

    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}

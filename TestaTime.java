class TestaTime {
    public static void main(String[] args) {
        Time t1 = new Time(14, 30);
        Time t2 = new Time(16, 0);

        System.out.println("Hora 1: " + t1);
        System.out.println("Hora 2: " + t2);

        if (t1.anterior(t2.hora, t2.minuto))
            System.out.println("A primeira hora é anterior.");
        else if (t1.posterior(t2.hora, t2.minuto))
            System.out.println("A primeira hora é posterior.");
        else
            System.out.println("As horas são iguais.");
    }
}

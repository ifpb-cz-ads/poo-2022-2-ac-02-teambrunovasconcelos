public class BMQuestao3 {
    public static void main(String[] args) {
        double pastel = 2.95;
        double esfirra = 3.50;
        double total = pastel + esfirra;
        double taxaCalculada = total * 8.25 / 100;
        double novoCusto = taxaCalculada * 2 + total;
        boolean muitoCaro = novoCusto > 10;

        System.out.println("O pastel custa:" + pastel);
        System.out.println("A esfirra item custa:" + esfirra);
        System.out.println("O valor total eh " + total);
        System.out.println("A taxa eh: " + taxaCalculada);
        System.out.println("O valor com a taxa eh: " + novoCusto);
        System.out.println(muitoCaro);

    }

}

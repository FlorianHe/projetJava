class CandyCount {

    /**
     * @param args aucun argument n'est utilisÃ© ici
     */
    public static void main(final String[] args) {
        double money = 12.4;
        double price = 1.2;
        int candies = 0;

        if (money > 0 && price > 0) {
            while (money - price >= 0) {
                candies += 1;
                money -= price;
            }
        }
        System.out.println(candies);
    }
}

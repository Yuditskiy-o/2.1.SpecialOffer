public class SpecialOffer {
    public static void main(String[] args) {
        long transactionInKopecks = 150000;
        long bonusPointsInKopecks;
        long valueInKopecks = 100000;
        if (transactionInKopecks > valueInKopecks) {
            bonusPointsInKopecks = transactionInKopecks / 10000;
        } else {
            bonusPointsInKopecks = 0;
        }
        long balanceInKopecks = 500000;
        long totalBalanceInKopecks = (balanceInKopecks + transactionInKopecks + bonusPointsInKopecks) / 100;
        System.out.println("Всего бонусных баллов — " + bonusPointsInKopecks);
        System.out.println("Всего средств на счету — " + totalBalanceInKopecks);
    }
}

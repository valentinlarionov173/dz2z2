public class Main {
    public static void main(String[] args) {
        int InitAmount = 100;
        int TopUpSum = 1100;

        int BonusRuble;
        if (TopUpSum > 1000) {
            BonusRuble = TopUpSum / 100;
        } else {
            BonusRuble = 11;
        }
        int FinalAmount = InitAmount + TopUpSum + BonusRuble;

        System.out.println("Итоговый счёт:" + FinalAmount);
        System.out.println("Количество бонусных рублей:" + BonusRuble);
    }
}
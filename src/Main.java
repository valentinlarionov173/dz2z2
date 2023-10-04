public class Main {
    public static void main(String[] args) {
        int initAmount = 100;
        int topUpSum = 1100;

        int bonusRuble;
        if (topUpSum > 1000) {
            bonusRuble = topUpSum / 100;
        } else {
            bonusRuble = 11;
        }
        int finalAmount = initAmount + topUpSum + bonusRuble;

        System.out.println("Итоговый счёт:" + finalAmount);
        System.out.println("Количество бонусных рублей:" + bonusRuble);
    }
}
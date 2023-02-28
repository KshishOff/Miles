public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_020;
        int bonus = service.calculate(price);
        System.out.println("Ваши бонусные мили:" + bonus);
    }
}

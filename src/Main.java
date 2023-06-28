public class Main {
    public static void main(String[] args) {

        int ticket = 350_99;
        int limit = 20;
        int round = ticket / limit / 100;
        int bonus = round * 100;
        System.out.println(bonus);
    }
}
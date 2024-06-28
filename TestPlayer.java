public class TestPlayer {
    public static void main(String[] args) {
        Player player1 = new Player("张三", 25, 180.5, false);
        player1.show();
        player1.honor(5);

        Player player2 = new Player("李四", 30, 175.0, true);
        player2.show();
        player2.honor(10);
    }
}
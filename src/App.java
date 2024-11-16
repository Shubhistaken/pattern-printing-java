public class App {
    public static void main(String[] args) throws Exception {
        problem1(5);
    }

    public static void problem1(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

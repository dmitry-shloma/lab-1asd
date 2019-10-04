public class Main {
    public static void main(String[] args) {
        String text = "";
        try {
            text = Console.read("Введите кол-во строк: ");
            int count = Integer.parseInt(text);

            text = Console.read("Введите текст: ");
            Algorythm algorythm = new Algorythm();
            algorythm.start(count, text);
            String[] lines = algorythm.getLines();

            for (int i = 0; i < count; ++i) {
                System.out.println(String.format("%s (%d)", lines[i], lines[i].length()));
            }

        } catch(Exception e) {
            Console.out(e.toString());
        }
    }
}

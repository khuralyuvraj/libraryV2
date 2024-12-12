public class Main {
    public static void main(String[] args) {
        Library m = new Library();
        m.add(new Game("Red", 64));
        m.getFirst().printInfo();
    }
}
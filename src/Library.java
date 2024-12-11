public class Library {
    public static void main(String[] args) {
        MediaList m = new MediaList();
        m.add(new Game("Red", 64));
        m.getFirst().getTitle();
    }
}
public class Book {
    static int test = 0;
    int id;
    public Book() {
        id = getNewID();
        System.out.println(id);
    }

    static int getNewID() {
        return ++test;
    }
}

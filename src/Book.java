public class Book {
    static int test = 0;
    int id;
    public Book() {
        id = getNewID();
    }

    static int getNewID() {
        return test++;
    }
}

package javarush;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Books {

    public static void main(String[] args) {

        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));

        System.out.println(books);
    }

    abstract static class Book {

        private final String author;

        public abstract Book getBook();
        public abstract String getTitle();

        public Book(String author) {
            this.author = author;
        }

        private String getOutputByBookType() {

            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
            String output = "output";
            if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            } else if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    static class MarkTwainBook extends Book {

        private final String title;

        public MarkTwainBook(String title) {

            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    static class AgathaChristieBook extends Book {

        private final String title;

        public AgathaChristieBook(String title) {

            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}

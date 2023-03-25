public class Main {



    public static void main(String[] args) {

        Author author = new Author("Джим Коллинз");
        Author author1 = new Author("Талеб Нассим Николас");


        Book book = new Book("От хорошего к великому",2022,author);
        System.out.println("Автор - " + author.getName());
        System.out.println("Название - " + book.getName());
        System.out.println("Год - " + book.getYear());

        Book book1 = new Book("Рискуя собственной шкурой", 2022,author);
        System.out.println("Автор - " + author1.getName());
        System.out.println("Название - " + book1.getName());
        System.out.println("Год - " + book1.getYear());

    }
}



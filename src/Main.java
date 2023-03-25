public class Main {



    public static void main(String[] args) {

        Author author = new Author("Джим Коллинз");
        Author author1 = new Author("Талеб Нассим Николас");


        Book book = new Book("От хорошего к великому",2022,author);
        System.out.println(book);

        Book book1 = new Book("Рискуя собственной шкурой", 2022, author1);
        System.out.println(book1);


    }
}



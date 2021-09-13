import ru.biblio.*;

public class Main {
    public static void main(String[] args){
        Biblio<Book> bibB=new Biblio(2);
        Book b=new Book("Война и Мир том первый");
        Book b1=new Book("Война и мир том второй");

        System.out.println("Книги:");
        try {
            bibB.add(b);
            bibB.add(b1);
            bibB.add(b1);
        }catch (Exception ex) {}
        for (int i=0; i<bibB.size(); i++) {
            try {
                System.out.println(bibB.get(i).getName());
            }catch (Exception ex) {}
        }
        Biblio<Video> bibV=new Biblio(2);
        Video v=new Video("Криминальное Чтиво");
        Video v1=new Video("Большой Лебовски");
        try {
            bibV.add(v);
            bibV.add(v1);
        }catch (Exception ex){}

        System.out.println("Фильмы: ");
        try {
            System.out.println("Третий фильм из списка - " + bibV.get(2).getName());
        }catch (Exception ex) {
            System.out.println("Неверный индекс");
        }
        System.out.println("Газеты: ");
        Biblio<Magazine> bibM=new Biblio(2);
        Magazine m=new Magazine("Комсомольская правда");
        try {
            bibM.add(m);
        }catch (Exception ex){}

        try {
            bibM.remove(0);
        }catch (Exception ex){
            System.out.println("Неверный индекс");
        }
    }
}

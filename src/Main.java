import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        //5 cuốn sách thuộc lớp ProgrammingBook
        books[0] = new ProgrammingBook("English", "A1", "truyen tranh", "tac gia1", 20000, "AB");
        books[1] = new ProgrammingBook("java", "A2", "truyen co tich", "tac gia 2", 30000, "AC");
        books[2] = new ProgrammingBook("tieng viet", "A3", "truyen thieu nhi", "tac gia 3", 40000, "AD");
        books[3] = new ProgrammingBook("java", "A4", "truyen ngay xua", "tac gia 4", 30000, "AE");
        books[4] = new ProgrammingBook("php", "A5", "truyen thuyet", "tac gia 5", 50000, "AF");
        //5 cuốn sách thuộc lớp FictionBook
        books[5] = new FictionBook("vien tuong", "truyen tieu lam", "tac gia 6", 100000, "AB");
        books[6] = new FictionBook("hanh dong", "truyen ngu ngon ", "tac gia 7", 30000, "AC");
        books[7] = new FictionBook("nghiep du", "truyen sam", "tac gia 8", 40000, "AD");
        books[8] = new FictionBook("vien tuong", "truyen linh tinh", "tac gia 9", 100000, "AE");
        books[9] = new FictionBook("hanh dong", "truyen tro", "tac gia 10", 50000, "AF");
        Tinhtong(books);
        Programming(books);
        Fiction(books);
        //tìm kiếm sách
        System.out.println("Mời bạn nhập sách muốn tìm : ");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i <books.length; i++) {
            if (books[i].getName().equals(name)) {
                System.out.println("Tên sách : " + books[i].getName());
                System.out.println("Tác giả : " + books[i].getAuthor());
                System.out.println("Giá sách :" + books[i].getPrice() );
                check = true;
                break;
            }
        }
        if(!check)
            System.out.println(" Sách bạn tìm không có ");
    }
    //tinh tong tien cua 10 cuon sach
    public static void Tinhtong(Book[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        System.out.println("Tong tien cua 10 cuon sach la : " + sum);
    }
    // số sách ProgrammingBook có language là "Java"
    public static void Programming(Book[] books) {
        int cnt = 0;
        for (Book i: books) {
            if (i.getLanguage() == "java")
                cnt++;
        }
        System.out.println("So sach co language la java : " + cnt);
    }

    //số sách Fiction có giá <100 nghin.
    public static void Fiction(Book[] books){
    int cnt =0;
    //chua lam duoc.
    }
}

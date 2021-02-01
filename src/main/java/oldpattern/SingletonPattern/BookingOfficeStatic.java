package oldpattern.SingletonPattern;

public class BookingOfficeStatic {
    private static final BookingOfficeStatic sBookingOffice = new BookingOfficeStatic();

    public static BookingOfficeStatic get() {

        return sBookingOffice;
    }

    private BookingOfficeStatic() {
        // Just for hide constructor.
        System.out.println("此处调用了一次私有constructor()");
    }

    public void print() {
        System.out.println("当前对象：" + this.toString());
    }
}

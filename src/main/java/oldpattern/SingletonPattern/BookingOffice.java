package oldpattern.SingletonPattern;

public class BookingOffice {
    private static BookingOffice sBookingOffice;

    public static BookingOffice get() {
        if (sBookingOffice == null) {
            sBookingOffice = new BookingOffice();
        }
        return sBookingOffice;
    }

    private BookingOffice() {
        // Just for hide constructor.
        System.out.println("此处调用了一次私有constructor()");
    }

    public void print() {
        System.out.println("当前对象：" + this.toString());
    }
}

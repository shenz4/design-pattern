package oldpattern.SingletonPattern;

public class BookingOfficeHolder {

    private static class SingletonHolder {
        private static final BookingOfficeHolder sBookingOffice = new BookingOfficeHolder();

    }

    public static BookingOfficeHolder get() {

        return SingletonHolder.sBookingOffice;
    }

    private BookingOfficeHolder() {
        // Just for hide constructor.
        System.out.println("此处调用了一次私有constructor()");
    }

    public void print() {
        System.out.println("当前对象：" + SingletonHolder.sBookingOffice.toString());
    }
}

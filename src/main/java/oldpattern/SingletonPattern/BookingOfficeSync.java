package oldpattern.SingletonPattern;

public class BookingOfficeSync {
    private static volatile BookingOfficeSync sBookingOffice;

    public static BookingOfficeSync get() {

        if (sBookingOffice == null) {
            synchronized (BookingOfficeSync.class) {
                if (sBookingOffice == null) {
                    sBookingOffice = new BookingOfficeSync();
                }
            }
        }

        return sBookingOffice;
    }

    private BookingOfficeSync() {
        // Just for hide constructor.
        System.out.println("此处调用了一次私有constructor()");
    }

    public void print() {
        System.out.println("当前对象：" + this.toString());
    }
}

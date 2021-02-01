package oldpattern.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        BookingOffice.get().print();
        BookingOffice.get().print();
        BookingOfficeSync.get().print();
        BookingOfficeSync.get().print();
        BookingOfficeStatic.get().print();
        BookingOfficeStatic.get().print();
        BookingOfficeHolder.get().print();
        BookingOfficeHolder.get().print();
    }
}

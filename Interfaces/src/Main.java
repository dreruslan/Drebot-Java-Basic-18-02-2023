public class Main {
    public static void main(String[] args) {
        Smartphones android = new Androids();
        android.call();
        android.sms();
        android.internet();
        LinuxOS linuxOS = (LinuxOS) android;
        linuxOS.boot();
        linuxOS.shutDown();

        Smartphones iphone = new iPhones();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iOS iOS = (iOS) iphone;
        iOS.boot();
        iOS.shutDown();
    }
}
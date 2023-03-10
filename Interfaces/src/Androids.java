public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Дзвінок на Андроїді");
    }

    @Override
    public void sms() {
        System.out.println("SMS на Андроїді");
    }

    @Override
    public void internet() {
        System.out.println("Інтернет на Андроїді");
    }

    @Override
    public void boot() {
        System.out.println("Андроїд запускається");
    }

    @Override
    public void shutDown() {
        System.out.println("Андроїд вимикається");
    }
}

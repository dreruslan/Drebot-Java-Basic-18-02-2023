public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Дзвінок на iPhone");
    }

    @Override
    public void sms() {
        System.out.println("SMS на iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Інтернет на iPhone");
    }

    @Override
    public void boot() {
        System.out.println("iPhone запускається");
    }

    @Override
    public void shutDown() {
        System.out.println("iPhone вимикається");
    }
}


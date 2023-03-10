public class Main {
    public static void main(String[] args) {
        // Створення музичних гуртів
        MusicStyles[] musicStyles = new MusicStyles[] {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        // Виклик методу playMusic() у всіх спадкоємцях
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}

public class Music {
    private int volume = 100;
    private String song;
    public void turnOn() {
        System.out.println("Włączono muzykę.");
    }

    public void turnOff() {
        System.out.println("Wyłączono muzykę.");
    }

    public void changeVolume(int volume) {
        this.volume = volume;
        System.out.println("Ustawiono głośność muzyki na " + volume + "db");
    }

    public void changeSong(String song) {
        this.song = song;
        System.out.println("Teraz będziemy słuchać: " + song);
    }
}
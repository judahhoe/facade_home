public class Home {
    private final Lighting lighting;
    private final AirCondition airCondition;
    private final Doors doors;
    private final Music music;

    public Home() {
        this.lighting = new Lighting();
        this.airCondition = new AirCondition();
        this.doors = new Doors();
        this.music = new Music();
    }

    public void startDay() {
        System.out.println("Rozpoczęto dzień.");
        lighting.turnOn();
        setLightingColor(255,255,255);
        airCondition.turnOn();
        setTemperatureValue(20);
        doors.open();
    }

    public void endDay() {
        System.out.println("Zakończono dzień.");
        lighting.turnOff();
        airCondition.turnOff();
        doors.close();
    }

    public void makeParty() {
        System.out.println("IMPREZA ROZPOCZĘTA");
        lighting.turnOn();
        setLightingColor(250,100,250);
        doors.open();
        music.turnOn();
        setMusicVolume(100);
    }
    public void setTemperatureValue(int temperature) {
        airCondition.changeTemp(temperature);
    }

    public void setLightingColor(int r, int g, int b) {
        lighting.changeColor(r, g, b);
    }

    public void setMusicVolume(int volume) {
        music.changeVolume(volume);
    }

    public void setSong(String song) {
        music.changeSong(song);
    }
}
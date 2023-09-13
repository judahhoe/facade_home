public class AirCondition {
    private int temperature = 25; // Domyślna temperatura

    public void turnOn() {
        System.out.println("Włączono klimatyzację. Temperatura: " + temperature + "°C");
    }

    public void turnOff() {
        System.out.println("Wyłączono klimatyzację.");
    }

    public void changeTemp(int temperature) {
        this.temperature = temperature;
        System.out.println("Ustawiono temperaturę klimatyzacji na " + temperature + "°C");
    }
}
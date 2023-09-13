public class Lighting {
    private final int[] color = {255, 255, 255}; // Domyślny kolor biały

    public void turnOn() {
        System.out.println("Włączono oświetlenie. Kolor: R=" + color[0] + ", G=" + color[1] + ", B=" + color[2]);
    }

    public void turnOff() {
        System.out.println("Wyłączono oświetlenie.");
    }

    public void changeColor(int r, int g, int b) {
        this.color[0] = r;
        this.color[1] = g;
        this.color[2] = b;
        System.out.println("Ustawiono kolor oświetlenia na: R=" + r + ", G=" + g + ", B=" + b);
    }
}
import java.util.Scanner;

public class kolyok {
    public String name;
    public int x;
    public int y;

    public kolyok(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ").append(x).append("/").append(y);

        return sb.toString();
    }
}

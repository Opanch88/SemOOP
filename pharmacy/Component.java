package pharmacy;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weigth, int power) {
        this.name = name;
        this.weight = weigth;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }
}

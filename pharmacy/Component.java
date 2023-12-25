package pharmacy;

public class Component implements Comparable<Component> {
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

    @Override
    public int compareTo(Component o) {
        return Integer.compare(o.power, this.power);
//        if (this.power > o.power) return -1;
//        if (this.power < o.power) return  1;
//        return 0;
    }
}

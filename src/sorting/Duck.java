package sorting;

public class Duck implements Comparable{

    String name;

    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;

        if (weight < otherDuck.weight) {
            return -1;
        } else if (weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}

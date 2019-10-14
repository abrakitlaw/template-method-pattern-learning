public class Tea extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping tea through filter");
    }

    @Override
    public boolean needCondiments() {
        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making Tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffee.prepareRecipe();
    }
}

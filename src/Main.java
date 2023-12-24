public class Main {

    public static void main(String[] args) {

        GeometricFigure geometricFigure = new Triangle();
        geometricFigure.area();
        geometricFigure.peremetr();

        System.out.println();

        GeometricFigure geometricFigure1 = new Trapezium();
        geometricFigure1.area();
        geometricFigure1.peremetr();

        System.out.println();

        Animal dog = new Dog();
        dog.setName("Dog");
        System.out.println(dog.getName());
        dog.sound();

        System.out.println();

        Animal duck = new Duck();
        duck.setName("Duck");
        System.out.println(duck.getName());
        duck.sound();

        System.out.println();

        Animal cat = new Cat();
        cat.setName("Cat");
        System.out.println(cat.getName());
        cat.sound();
    }
}

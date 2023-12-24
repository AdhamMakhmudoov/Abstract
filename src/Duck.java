public class Duck extends Animal {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public void sound() {
        System.out.println("Quack quack");
    }
}

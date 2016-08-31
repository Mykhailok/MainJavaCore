package offline_now.question;

public class Animal {
    private  int weight;
    private int height;
    private int age;

    public Animal(final int age, final int height ){
        this.age = age;
        this.height = height;

        System.out.println("Animal()");
    }

    protected void doSOmething(){
        System.out.println("doSomething from Cat");
    }

    public void sleep(){

    }

}

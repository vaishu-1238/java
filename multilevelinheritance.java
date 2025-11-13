public class multilevelinheritance {
    public static void main(String[] args) {
         Puppy d =new Puppy();
        d.bark();
        d.eat();
        d.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("Animals can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy can weep");
    }
}
public class hierachy {
  
    public static void main(String[] args) {
         Puppy d =new Puppy();
        d.bark();
        d.eat();
        d.weep();
        System.out.println();
        Cat c = new Cat();
        c.eat();
      
        c.meow();
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
class Cat extends Animal{
    void meow(){
        System.out.println("Cat can meow");
    }
}
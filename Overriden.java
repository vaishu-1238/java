public class Overriden {
    public static void main(String[] args) {
        Book b = new Book("Java", 500);
        System.out.println(b);

        Car c = new Car();
        System.out.println(c.getClass());

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(101, "Bob");
        System.out.println(s1.equals(s2));

        Movie m = new Movie("Inception", "Christopher Nolan", 2010);
        System.out.println(m);

        Player p1 = new Player("John", 25);
        Player p2 = new Player("Mike", 25);
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}

class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {
}

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }
}

class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie[title=" + title + ", director=" + director + ", year=" + year + "]";
    }
}

class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(age);
    }
}
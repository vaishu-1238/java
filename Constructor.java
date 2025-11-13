class student{
    String Name;
    int  age;
    int Roll_no;
    String Branch;
    double cgpa;
    student(String name,int a,int r,String b,double c){
        Name=name;
        age=a;
        Roll_no=r;
        Branch=b;
        cgpa=c;
    }
    void display(){
        System.out.println("Student Name:"+Name);
        System.out.println("Student Age:"+age);
        System.out.println("Student Roll_no:"+Roll_no);
        System.out.println("Student Branch:"+Branch);
        System.out.println("Student CGPA:"+cgpa);
    }
}

public class Constructor{
    public static void main(String[] args) {
        student stu1=new student("vaishnavi", 19, 47, "AIML", 9.07);
        student stu2=new student("meghana", 19, 61, "CSE", 9.24);
        student stu3=new student("bhavya", 19, 4, "AIML", 9.01);
        stu1.display();
        stu2.display();
        stu3.display();
    }
}


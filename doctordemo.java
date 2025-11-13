public class doctordemo{
    public static void main(String[] args) {
        Doctor d=new Doctor();
        d.consulationFees();
        Dentist de=new Dentist();
        de.consulationFees();
        Cardiologist c=new Cardiologist();
        c.consulationFees();
        Surgeon s=new Surgeon();
        s.consulationFees();
    }
}
class  Doctor{
    void consulationFees(){
        System.out.println("General doctor consulation fees:500");
    }
}
class Dentist extends Doctor{
    void consulationFees(){
        System.out.println("Dentist doctor consulation fees:1000");
    }
}
class Cardiologist extends Doctor{
    void consulationFees(){
        System.out.println("Cardiologist doctor consulation fees:1500");
    }
}
class Surgeon extends Doctor{
    void consulationFees(){
        System.out.println("Surgeon doctor consulation fees:2000");
    }
}
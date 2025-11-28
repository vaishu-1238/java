public class Bankdetails {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Rate of Interest: " + sbi.rateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + hdfc.rateOfInterest() + "%");
    }
}

interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    public double rateOfInterest() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double rateOfInterest() {
        return 7.2;
    }
}
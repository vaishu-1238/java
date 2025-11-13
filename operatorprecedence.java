/*public class operatorprecedence {
    public static void main(String[] args) {
        int result=10+5*3;
        System.out.println("Result without parentheses:"+result);
    }
}*/


/*public class operatorprecedence {
    public static void main(String[] args) {
        int a=5,b=4;                                           //prefix example
        int result=++a*b+2;
        System.out.println("Result:"+result);
    }
}*/

/*public class operatorprecedence {
    public static void main(String[] args) {                  // bitwisenot example
        int a=6;                                              // ~a=bitwise not example 5 -6                                                            
        int result=(~a+1)*2;                                  //~a+1=-5
        System.out.println("Result:"+result);
    }
}*/

/*public class operatorprecedence {                          //parentheses override
    public static void main(String[] args) {
        int result=(10+5)*2;
        System.out.println("Result with parentheses:"+result);
    }
}*/

public class operatorprecedence {
    public static void main(String[] args) {                            //mixedoperators
        int a=4,b=2,c=7;
        int result=++a*(b--+~c)-(-b);//5*(-6)-(-1)
        System.out.println("Result:"+result);
    }
}
public class Ex1 {

    public static void main(String args[]){
        int number1=3; 
        String name="Kenny";
        double taxes=0.16;
        boolean job=true;
        
        System.out.println(name);
        name="Rienecker";
        System.out.println(name);

        //Arithmetic operators
        int num1=100;
        int num2=20;

        System.out.println("num1+num2= "+ (num1+num2));
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        
        //Assignment operators

        num1=10;
        num2=20;
        num1=num2;
        System.out.println("= Output "+num1);
        //num1=num1+num2;
        num1+=num2;
        System.out.println("+= Output "+num1);

        num1-=num2;
        System.out.println("+= Output "+num1);

        num1++;
        System.out.println("num1++ output" + num1);
        num2--;
        System.out.println("num2-- output" + num2);

        //logical operators
        boolean b1=true;
        boolean b2=false;

        System.out.println("b1 && b2"+ (b1&&b2)); //AND 
        System.out.println("b1 || b2" +(b1||b2)); //OR 
        System.out.println("!b1" + !b1);  //NOT

        //Create a program where you register a name, price and add taxes to a product.
        
        //Varaible name, price, taxes
        //Date type (Stirng, int,double) then variable names i.e. varName = value;
        String product= "Computer";
        double price = 250.00;
        double tax = 1.16;
        double result;

        result= price*tax;
        System.out.println(product+result);
        System.out.println("  price -------------" +price);
        System.out.println("  taxes -------------" +price*0.16);
        System.out.println("  Total -------------" +result);

        //math operator *  
       
        
    }
}
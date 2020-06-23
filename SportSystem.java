public class SportSystem {
    
    public static void main(String args[]){
        //DataType(class) varName = new Class():
        Player messi = new Player("Lionel Messi", "Argentina", 123246.36,33);
        messi.printName();
        System.out.println(messi.getAge());

       Player cr7 = new Player("Christiano Ronaldo", "Portugal", 132459304.87,33);
       
       cr7.printName();

       // add an object

       Player kr7 = new Player("Kenny Rienecker", "USA", 85000, 33);
      
       kr7.printName();
    }
}
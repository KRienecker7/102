class Player {
    // attributes
    // visibilty dataType nameVar;
    public String name;
    public String nationality;
    public double salary;
    private int age;

    // methods
    public Player(String name,String nationality,double salary, int age){
        this.name=name;
        this.nationality=nationality;
        this.salary=salary;
        setAge(age);
    }



    // visibility returnDataType nameMethod(parameter1,parameter2,etc.){
        //body of the method
    //}
        public void printName(){
            System.out.println(name);
        }


        //setter and getter methods
        public void setAge(int a){
        if (a<100){
            age=a;
        }
        else{
            System.out.println("Invalid Age");
        }
        }    
         

        public int getAge(){
            return age;
        }
}
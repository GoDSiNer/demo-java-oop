class student{
    private int id;
    private String name;
    private double gpa;
    private double onetEng;
    private double onetMath;
    private double onetScience;
    public student(int ID, String Name, double Gpa, double OnetEng, double OnetMath, double OnetScience){
        this.id = ID;
        this.name = Name;
        this.gpa = Gpa;
        this.onetEng = OnetEng;
        this.onetMath = OnetMath;
        this.onetScience = OnetScience;
        
    }
    public double calPoint(){
        double point = ((gpa/4*10)+(onetEng/100*20)+(onetMath/100*40)+(onetScience/100*30));
        return point;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public double getEng(){
        return onetEng;
    }
    public double getMath(){
        return onetMath;
    }
    public double getScience(){
        return onetScience;
    }
}
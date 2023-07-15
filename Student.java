public class Student{
    String name;
    int gradelvl;
    

    public Student(String pName, int pGradelvl){
        name = pName;
        gradelvl = pGradelvl;

    }

    void init(){
        System.out.println(name + " Grade " + gradelvl);
    }
}
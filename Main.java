import java.util.Scanner;


public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       while(true){

       
       System.out.println("do you want to add a new student?");
       System.out.println("1 for yes 2 for no");
       int option = scanner.nextInt();
       scanner.nextLine();
       if(option == 1){
        
        System.out.println("enter the name of the student");
        String pName = scanner.nextLine();

        System.out.println("Enter the grade lvl of the student");
        int pLevel = scanner.nextInt();
        scanner.nextLine();

        Student s1 = new Student(pName, pLevel);

        s1.init();
        
        

        
       }
       else{
        System.out.println("ok ");
        System.out.println("if you ever want to add a student just run the program again");
        System.out.println("Have a nice day");
        scanner.close();
        System.exit(1);
       }
    }
  
    } 
}

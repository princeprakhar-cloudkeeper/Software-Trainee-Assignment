import java.util.*;
class Student{
    private  String name;
    private int[] marks;
    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }
    public int getTotalMarks(){
        return Arrays.stream(marks).sum();
    }
    public double getAverageMarks(){
        return (double)Arrays.stream(marks).sum()/(double)3;
    
    }
    public String getName(){
        return name;
    }
}
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data for Student");
        System.out.println("Enter Name: ");
        String name= sc.nextLine();
        int[] marks = new int[3];
        System.out.println("Enter 3 subject marks: ");
        for(int idx = 0;idx<3;idx ++){
            marks[idx] = sc.nextInt();
        }   
        Student student = new Student(name,marks);
        System.out.println("Here is Student report: ");
        System.out.println("Student "+student.getName()+" has total marks: "+student.getTotalMarks());
        System.out.println("Avarage Marks: "+ student.getAverageMarks());
    }
}

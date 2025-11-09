import java.util.Scanner;
class ObjectCount{
    private static int counter;

    public ObjectCount(){
        counter++;
    }

    public static int getObjectCounter(){
        return counter++;
    }
}
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();


        System.out.println("Object Count: "+ ObjectCount.getObjectCounter() );
    }
}

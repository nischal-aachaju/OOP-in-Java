
import java.util.ArrayList;

public class StoreNameArrList {
    static ArrayList <String> students=new ArrayList<>();
        public static void addStudent(String name){
            students.add(name);
        };
        public static void remove(String name) {
            students.remove(name);
        };

        public static void searchName(String name){
            if (students.contains(name)){
                System.out.println("Student is in array");
            }
            else {
                System.out.println("Student is not in array");
            }
        }
        
public static void main(String[] args) {
addStudent("Nischal");
searchName("Nischal");
remove("Nischal");
searchName("Nischal");
}
}

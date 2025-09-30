/**
 * 在这里给出对类 MapTester 的描述。
 * 
 * @author (你的名字)
 * @version (一个版本号或者一个日期)
 */
import java.util.HashMap;

public class MapTester {
    private HashMap<String, String> phoneBook;

    public MapTester() {
        phoneBook = new HashMap<>();
    }

    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    public String lookupNumber(String name) {
        return phoneBook.get(name);
    }

    public static void main(String[] args) {
        MapTester tester = new MapTester();
        tester.enterNumber("Alice", "555-1234");
        tester.enterNumber("Bob", "555-5678");
        
        System.out.println(tester.lookupNumber("Alice")); 
        System.out.println(tester.lookupNumber("Charlie")); 
    }
}
public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> si = new Stack<Integer>();
        
        si.push(10);
        si.push(12);
        si.push(15);
        si.push(100);
        
        si.display();
        
        System.out.println("si.peek() returned " + si.peek() ); // should return 100
        
        int value = si.pop();
        si.display(); // should display 15 12 10
        
        value = si.pop();
        si.display(); // should display 12 10
        
        Stack<String> s = new Stack<String>();
        s.push("cat");
        s.push("dog");
        s.push("owl");
        
        s.display();
        
        String val = s.pop();
        s.display();
    }
    
}

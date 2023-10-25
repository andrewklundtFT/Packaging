import mypkg.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> a = new Stack<Integer>();
        a.push(1);
        a.push(2);
        System.out.println(a.Pop());
        System.out.println(a.Pop());
    }
}

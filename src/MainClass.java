import java.util.Stack;

 public class MainClass {
        public static void main(String[] args) {

            Stack<Integer> stack = new Stack<>();
            stack.push(56);
            System.out.println(stack.peek());
            stack.push(30);
            System.out.println(stack.peek());
            stack.push(70);
            System.out.println(stack.peek());

            stack.pop();
           System.out.print(stack.peek());
           stack.pop();
            System.out.println("->" +stack.peek());
            stack.pop();
            //System.out.println("->" +stack.peek());

        }

    }


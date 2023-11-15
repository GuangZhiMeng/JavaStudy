public class demo {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("1111111");
        myStack.print();

        myStack.push("2222222");
        myStack.print();

        myStack.pop();
        myStack.print();

        myStack.push("3333333");
        myStack.print();

        myStack.pop();
        myStack.print();
    }
}

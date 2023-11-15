public class MyStack<T> {
    private T data[];
    private int top;
    private int maxSize = 8;

    public MyStack(){
        data = (T[]) new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (maxSize -1);
    }

    public boolean push(T e){
        if (!isFull()){
            System.out.println("栈满！无法入栈");
            return false;
        }
        data[++top] = e;
        return true;
    }

    public T pop()
    {
        if (isEmpty()){
            System.out.println("栈空");
            return null;
        }
        return data[top--];
    }

    public void print(){
        for(int i = 0;i <=top;i++){
            System.out.println(data[i] + "\t");
        }
    }
}

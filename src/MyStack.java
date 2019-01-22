public class MyStack {
    int size;
    int top;
    int stackarray[];


    public MyStack() {
        size = 10;
        top = -1;
        stackarray = new int[size];
    }


    public void push(int x) {
        if (!isFull()) {
            top++;
            stackarray[top] = x;
        }
    }
        public void pop()
        {
            top--;
        }
    public boolean isFull(){
        if(top==9)
            return true;
        else
            return false;
    }
   public boolean isEmpty()
   {
       if(top==-1)
           return true;
       else
           return false;
   }
}

public class StackItem {

    private Object data;
    private StackItem next;

    public StackItem(Object data) {
        this.data = data;
    }

    public void setNext(StackItem previousTop) {
        this.next = next;

    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public StackItem getNext() {
        return next;
    }
}

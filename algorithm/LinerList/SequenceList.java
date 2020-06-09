public class SequenceList implements LinerList {
    private Object[] sList;
    private int size;
    
    public SequenceList(int length) {
        if (length == 0) {
            this.sList = new Object[0];
        }
        this.sList = new Object[length];
    }

    public SequenceList(){
        this(10);
    }

    public boolean isEmpty() {
        return this.size == 0 ? true : false;
    }

    public int size() {
        return this.size;
    } 

    public Object get(int index) {
        System.out.println(sList[index]);
        return new Object();
        //return (Object)sList[index];
    }
    
    public void set(int index, Object ele) {
        this.sList[index] = ele;
        
    }
    
    public boolean add(int index, Object ele) {
        if (index > this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index);
        }

        for (int i=this.size-1; i>=index; i--) {
            sList[i+1] = sList[i];
        }
        sList[index] = ele;
        this.size++;
        return true;
    }
    
    public boolean add(Object ele) {
        return add(this.size,ele);
    }
    
    public Object remove(int index) {
        return false;
    }
    
    public void clear() {

    }
}

public interface LinerList {

    public boolean isEmpty();

    public int size();
    
    public Object get(int index);
    
    public void set(int index, Object ele);
    
    public boolean add(int index, Object ele);
    
    public boolean add(Object ele);
    
    public Object remove(int index);
    
    public void clear();
}
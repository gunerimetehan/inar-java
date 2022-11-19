package chapters.chapters_11.Listings;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {


    public boolean isEmpty(){
        return isEmpty();
    }
    public int getSize(){
        return size();
    }
    public Object peek(){
        return get(getSize()-1);
    }
    public Object pop(){
        Object o=get(getSize()-1);
        remove(getSize()-1);
        return o;
    }
    public void push(Object o){
        add(0);
    }
    @Override
    public String toString(){
        return "stack" +toString();
    }
}

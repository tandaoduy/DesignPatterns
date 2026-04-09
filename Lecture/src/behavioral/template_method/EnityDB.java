package behavioral.template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class EnityDB<T> {
    List<T> list = new ArrayList<>();
    protected abstract int getKey(T t);
   public T findById(int id){
       return  list.get(id);
   }
    public boolean add (T t){
        for (var item: list){
            if(getKey(item) == getKey(t))
                return false;
        }
        list.add(t);
        return true;
    };

    public int delete(T t){
        T temp = findById(getKey(t));
        if (temp == null)
            return 0;
        list.remove(temp);
        return 1;
    }

    public int update(T t){
        T temp = findById(getKey(t));
        if (temp != null){
            int index = list.indexOf(temp);
            list.set(index, t);
            return 1;
        }
        return 0;
    }

    public void printInfo(){
        for (T t: list){
            System.out.println("---------------------");
            System.out.println(t.toString());
        }
    }
}

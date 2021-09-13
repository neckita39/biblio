package ru.biblio;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Biblio<T> {
    private ArrayList<T> els;
    private int s;

    public Biblio(int s){
        this.s=s;
        els=new ArrayList<T>(s);
    }
    public void add(T obj) throws Exception{
        try {
            if (els.size() < s)
                this.els.add(obj);
            else throw new Exception();
        }catch (Exception e){
            System.out.println("Больше нельзя добавлять");
        }
    }
    public void remove(int i) throws Exception{
        try {
            if (i >= 0 && i < s)
                this.els.remove(i);
            else
                throw new Exception();
        }catch (Exception e) {
            System.out.println("Список пуст");
        }
    }
    public T get(int i) throws Exception {
        try {
            if (i >= 0 && i < s)
                return els.get(i);
            else {
                throw new Exception();
            }
        }catch (Exception e) {
            return null;

        }

    }
    public int size(){
        return s;
    }



}

package main;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {


    private List<T> list = new ArrayList<>();

    public GenericList(List<T> list) {
        this.list = list;
    }

    public GenericList() {

    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void addItem(T element) {
        this.list.add(element);
    }

    public int getIndex(int index) {
        //neres koristin indexof
        System.out.println("---------Printing element------------");
        Integer findNumber = (Integer) list.get(index);
        return findNumber;
    }

    public void remove(int index) {
        System.out.println("---------Removing element------------");
        Integer removeNumber = (Integer) list.remove(index);
        System.out.println("Removed element " + removeNumber);
    }

    public void size() {
        System.out.println("Size of list: " + list.size());
    }

    //    ????????
    public List<String> toString(List<T> list) {
        return (List<String>) list;
    }
}

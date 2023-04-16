import main.GenericList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        GenericList<Object> genericList = new GenericList<>();
        GenericList<Integer> genericList = new GenericList<>();
//        GenericList<String> genericList = new GenericList<>();

        genericList.addItem(22);
        genericList.addItem(11);
        genericList.addItem(43);
        genericList.addItem(58);
        genericList.addItem(667);
//        genericList.addItem("string0");
//        genericList.addItem("String1");

//        List<Object> newList = genericList.getList();
        List<Integer> newList = genericList.getList();
        printGenericListMethod(newList);


        List<Integer> listaNova = genericList.getList();
        //filter i any ne prihvacaju predikat
        System.out.println("Test copy list and stream with terminal opreation ------->: " + listaNova.stream().count());

        System.out.println("Return element value by given index: " + genericList.getIndex(4));

        genericList.size();

        genericList.remove(4);
        System.out.println("New list after removal");
        printGenericListMethod(newList);

        System.out.println("Find first: " + newList.stream().findFirst().get());

        Optional<Integer> first = newList.stream().findFirst();
        System.out.println("Find first: " + first.get());

        genericList.toString();

        System.out.println("finished");
    }

    public static <T> void printGenericListMethod(List<T> inputList) {
        for (T element : inputList) {
            if(element instanceof String) {
                System.out.println("Strings in mixed list: " + element);
            } else {
                System.out.println("Integers in mixed list: " + element);
            }
        }
    }
}
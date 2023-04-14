import main.GenericList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        GenericList<Object> gen = new GenericList<>();
//        GenericList<Integer> genInteger = new GenericList<>();
//        GenericList<String> genString = new GenericList<>();

        gen.addItem(22);
        gen.addItem(11);
        gen.addItem(43);
        gen.addItem(58);
        gen.addItem(667);
//        gen.addItem("string0");
//        gen.addItem("String1");

        List<Object> newList = gen.getList();
        printGenericListMethod(newList);


//        List listaNova = gen.getList();
        //filter i any ne prihvacaju predikat
//        System.out.println("Test copy list and stream with terminal opreation ------->: " + listaNova.stream().count());

        System.out.println("Return element value by given index: " + gen.getIndex(4));

        gen.size();

        gen.remove(4);
        System.out.println("New list after removal");
        printGenericListMethod(newList);

        System.out.println("Find first: " + newList.stream().findFirst().get());

//        Optional<Object> first = newList.stream().findFirst();
//        System.out.println("Find first: " + first.get());

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
package exercise.exercise2;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collection;
=======
import java.util.*;
import java.lang.Integer;
>>>>>>> origin/master

/**
 * Created by Radu.Hoaghe on 20.04.2015.
 *
 * Exercise 2: Create a class that inherits ArrayList<Integer> (class MyList<Integer>).
 *
 *             This list (MyList) should have the following functionality, besides the functionality
 *             that ArrayList already offers: it should retain in every moment how many different
 *             elements exist in the list.
 *                  
 *                  Examples: 1. If you have a List that contains: 7 5 3 2 4 1, there are 6 different elements.
 *                            2. If you have a List that contains: 5 6 1 2 5 6, there are 4 different elements.
 *
 *             A variable that retains the number of different elements that exist in the list in
 *             every moment was already defined (differentElements).
 *
 *             First of all, you will need to override the add methods so that every time a different
 *             element is added the counter will be updated.
 *                      Hint : check out the List documentation to see the methods signatures.
 *
 *             Secondly, you will also need to override the remove methods (Hint: of course, the List
 *             documentation) because the number of different elements in the list could change if
 *             the last element of its kind in the list is removed and by not overrriding it the
 *             counter will remain unchanged.
 *
 *             Finally, you will need to override the clear method and create a getter method for the
 *             counter (in order to access it outside the class).
 *
 *             In order to add/remove/clear the elements into/from the list you will need to use the
 *             add/remove/clear methods inherited from ArrayList.
 *
 *             To test your implementation run the Exercise2Test class.
 *
 */
public class MyList<Integer> extends ArrayList<Integer> {

    // A counter to hold the number of adds that were made on the list
    private int differentElements;

    public MyList(){
        differentElements = 0;
    }

    @Override
    public boolean add(Integer integer){
        if(super.contains(integer)==false){
            differentElements++;
        }
        return super.add((Integer) integer);
    }

    @Override
    public void add(int index, Integer element) {
        if(super.contains(element)==false){
            differentElements++;
        }
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c){
        Integer[] a= (Integer[]) c.toArray();
        for(int i=0; i<a.length;i++){
            if(super.contains(a[i]) == false){
                differentElements++;
            }
        }
        return super.addAll((Collection<? extends Integer>) c);
    }



    @Override
    public  boolean addAll(int index,Collection<? extends Integer> c) {
        Integer[] a = (Integer[]) c.toArray();
        for (int i = 0; i < a.length; i++) {
            if (super.contains(a[i]) == false) {
                differentElements++;
            }
        }
            return super.addAll(index, c);

    }
    @Override
    public Integer remove(int index) {
            int count=0;
            Object o = super.get(index);
            Integer[] a = (Integer []) super.toArray();
            for(int i=0; i<a.length; i++){
                if(a[i] == o){
                    count ++;
                }
            }
            if(count==1){
                differentElements --;
            }
            return super.remove(index);
        }

    @Override
    public boolean remove(Object o) {
        int count=0;
        Integer[] a = (Integer []) super.toArray();
        for(int i=0; i<a.length; i++){
            if(a[i] == o){
                count ++;
            }
        }
        if(count==1){
            differentElements --;
        }
        return super.remove(o);
    }

    @Override
    public void clear(){
        differentElements=0;
        super.clear();
    }
    // TODO Exercise #2 a) Override add() and addAll() methods so that the list should retain the number of
    // TODO Exercise #2 a) different elements (Hint: check out the methods signatures on the List documentation)

    @Override
    public boolean add(Integer integer) {
        boolean result =  super.add(integer);
        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }

        if (!newList.contains(integer))
            newList.add(integer);

        this.differentElements = newList.size();
        return result;
    }

    @Override
    public void add(int index, Integer element) {
        super.add(index, element);
        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }

        if (!newList.contains(element))
            newList.add(element);

        this.differentElements = newList.size();


    }

    @Override
    public boolean addAll(Collection c) {
       boolean result = super.addAll(c);

        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }

        this.differentElements = newList.size();

        return result;
    }

    @Override
    public boolean addAll(int index, Collection c) {
      boolean result =  super.addAll(index, c);

        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }


        this.differentElements = newList.size();
        return result;
    }

    @Override
    public Integer remove(int index) {
        Integer result =  super.remove(index);
        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }

        this.differentElements = newList.size();
        return result;
    }



    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);

        ListIterator<Integer> li = this.listIterator();
        List<Integer> newList = new ArrayList<Integer>();
        Integer value;

        while (li.hasNext()) {
            value = li.next();
            if (!newList.contains(value)) {
                newList.add(value);
            }


        }

        this.differentElements = newList.size();
        return result;

    }
// TODO Exercise #2 b) Override the remove methods so that the number of different elements is updated when
    // TODO Exercise #2 b) an element is removed
    // TODO Exercise #2 b) hint: you need to update the number of different elements only when
    // TODO Exercise #2 b) the element that needs to be removed is the last element of its kind in the list

    // TODO Exercise #2 c) Override the clear method and reset the number of different elements

    // TODO Exercise #2 d) Return the number of different elements that exist into the list
    public int getDifferentElements() {
        return differentElements;
    }
}

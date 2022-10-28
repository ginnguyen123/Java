import java.util.Arrays;

public class Mylist<E>  {
     private int size = 0;
     private static final int DEFAULT_CAPACITY = 10;
     private Object elements[];
     public Mylist(){
         elements = new Object[DEFAULT_CAPACITY];
     };
     public Mylist(int capacity) {
         elements = new Object[capacity];
     }
     private void ensureCapacity(){
         if (size>= elements.length){
             elements = Arrays.copyOf(elements, elements.length + 1);
         }
     }
     public void ensureCapacity(int minCapacity){
         elements = Arrays.copyOf(elements, elements.length + minCapacity);
     }
     public void add(int index, E element){
         if (index<0 || index >= elements.length){
             throw new IndexOutOfBoundsException("index " + index + " out of bounds");
         }else {
             for (int i = index; i <= size; i++){
                 elements[i + 1] = elements[i];
                 if (i == index){
                     elements[i] = element;
                 }
             }
             size++;
         }
     }
     public void remove(int index){
         if (index<0 || index >= elements.length){
             throw new IndexOutOfBoundsException("index " + index + " out of bounds");
         }else {
             for (int i = index; i<= size; i++){
                 elements[i] = elements[i+1];
             }
         }
         size--;
     }
     public int getSize(){
         return size;
     }
     public Object clone(){
         Object[] elementsArrList = new Object[size];
         for (int i = 0; i <= size; i++){
             elementsArrList[i] = elements[i];
         }
        return elementsArrList.toString();
     }
     public Object contains (Object o){
         for (Object i : elements){
             if (i.equals(o))
                 return true;
         }
         return false;
     }
     public int indexOf(E o){
         for (int i = 0; i <= size; i++){
             if (elements[i].equals(o)){
                 return i;
             }
         }
         return -1;
     }
     public E get(int index){
         if (index<0 || index >= elements.length){
             throw new IndexOutOfBoundsException("index " + index + " out of bounds");
         }
         return (E) elements[index];
     }
     public void clear(){
         for (int i = 0; i<= size; i++){
             elements[i] = null;
         }
         size = 0;
     }
}


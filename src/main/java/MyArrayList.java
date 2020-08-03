public class MyArrayList <T> {
    private Integer size = 20;
    private T[] myArray;
    private Integer currentElement = 0; 


    public MyArrayList() {
        myArray = (T[]) new Object[size];  
    }

    public MyArrayList(Integer i) {
        myArray = (T[]) new Object[i];
        size = 0;
    }

    public Boolean add(T type){
        Boolean canAdd = false;
        if(currentElement < size) {
            canAdd = true;
            myArray[currentElement] = type;
            currentElement++;
        } else {
            T[] newArray = (T[]) new Object[size * 2];
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            myArray[currentElement] = type;
            currentElement++;
            myArray = newArray;
        }
        return canAdd;
    }

    public Boolean remove(Integer index) {
        Boolean canRemove = false;
        Integer indextoRemove = index;
        if (currentElement >= index) {
            canRemove = true; 
            for (int i = indextoRemove; i < myArray.length -1; i++) {
                myArray[i] = myArray[i+1];    
            }
            currentElement--;
        } 
        return canRemove;
    }

    public Object get(Integer index) {
        Object got = myArray[index];
        return got; 
    }

    public void set(Integer index, T element) {
        myArray[index] = element;
    }

    public Boolean contains(Object o) {
        Boolean doesContain = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == o) {
                doesContain = true;
                return doesContain;   
            }    
        }
        return doesContain;
    }

    public Boolean isEmpty(){
        Boolean empty = true;
        if (currentElement > 0) {
            empty = false; 
            return empty;    
        }
        return empty;
    }

    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= null;    
        }
         currentElement = 0;
    }

    public Integer indexOf(T type){
        Integer index = -1; 
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i].equals(type) == true){
                index = i ;
                return index;
            }    
        }
        return index;
    }

    public Integer size(){
        Integer size = currentElement;
        return size;
    }

    public T[] getArray(){
        return myArray;
    }
    
}
public class MySet<T>
{
    private Integer size = 20;
    private T[] myArray;
    private Integer curInteger= 0;

    public MySet()
    {
        myArray =(T[]) new Object[size];
    }
    public MySet(Integer s)
    {
        myArray = (T[]) new Object[s];
    }
    public Boolean add(T type)
    {
        Boolean canAdd = false;
        if (contains(type) == false) 
        {
            canAdd = true;
            myArray[curInteger] = type;
            curInteger++;    
        }
        else
        {
            canAdd = false; 
            return canAdd;
        }

        return canAdd;
    }
    public Boolean remove(Integer index)
    {
        Boolean canRemove = false;
        if(curInteger>= index)
        {
            canRemove = true;
            for (int i = index; i < myArray.length - 1; i++) 
            {
                myArray[i] = myArray[i+1];   
            }
            curInteger--;
        }

        return canRemove;
    }
    private Integer find(Object o)
    {
        Integer index = 0;
        for (int i = 0; i < myArray.length; i++) 
        {
            if(myArray[i] == o)
            {
                index = i ;
            }
            else
            {
                index = -1;
            }
        }
        
        return index;
    }
    public Boolean remove(Object o)
    {
        Boolean canRemove = false;
        Integer found = find(o);
        if(found != -1)
        {
                remove(found);
        }
        else
        {
            canRemove = false;
            return false;
        }
        
       
        return canRemove;
    }
    public Boolean contains(Object o)
    {
        Boolean doesContain = false;
        for (int i = 0; i < myArray.length; i++) 
        {
            if(myArray[i] == o)
            {
                doesContain = true;
                return doesContain;
            }    
        }
        return doesContain;
    }
    public Boolean isEmpty()
    {
        Boolean isEmpty = true;
        if(this.size() != 0)
        {
            isEmpty= false;
            return isEmpty;
        }

        return isEmpty;
    }
    public Integer size()
    {
        Integer s = curInteger;
        return s;
    }
    public T[] getArray()
    {
        return myArray;
    }

}
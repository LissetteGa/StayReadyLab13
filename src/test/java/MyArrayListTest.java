import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest 
{

   @Test
    public void MyArrayListTest1()
    {
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        //When
        Integer expected = 20; 
        Integer actual = myArrayList.getArray().length;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void MyArrayListTest2()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>(40);
        //When
        Integer expected = 40;
        Integer actual = myArrayList.getArray().length;
        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void addTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        Integer type = 10; 
        Object[] array = myArrayList.getArray();
        //Then 
        myArrayList.add(type);
        Object actual = array[0];
        Object expected = 10;
        //When 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        Integer type1 = 10; 
        Integer type = 5;
        myArrayList.add(type);
        myArrayList.add(type1);
        //when
        myArrayList.remove(0);
       //Then 
       Integer expected = 1;
       Integer actual = myArrayList.size();
       Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTest()
    {
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(10);
        //When
        Object expected = 5; 
        Object actual = myArrayList.get(0);
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.set(0,5);
        Object[] array = myArrayList.getArray();
        Object actual = array[0];
        Object expected = 5;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void containsTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(15);
        //When
        Boolean actual =myArrayList.contains(15);
        Boolean expected = true;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void isEmptyTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        //When 
        Boolean actual = myArrayList.isEmpty();
        Boolean expected = false;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void clearTest()
    {
        //Given 
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(20);
        //When
        myArrayList.clear();
        Integer expected = 0; 
        Integer actual = myArrayList.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void indexOfTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(5);
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(10);
        //When 
        Integer actual = myArrayList.indexOf(10);
        Integer expected = 1;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sizeTest()
    {
        //Given
        MyArrayList<Object> myArrayList = new MyArrayList<>();
        myArrayList.add(20);
        myArrayList.add(10); 
        //When 
        Integer expected = 2;
        Integer actual = myArrayList.size();
        //Then
        Assert.assertEquals(expected, actual);
    }


}
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest{
    MyArrayList myArr;

    @Before
    public void initial() {
        myArr = new MyArrayList<>();
    }

   @Test
    public void myArrayListTest() {
        //Given
        Integer expected = 20;

        //When
         Integer actual = myArr.getArray().length;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        //Given
        Integer type = 10; 
        Object[] array = myArr.getArray();
        Object expected = 10;

        //Then 
        myArr.add(type);
        Object actual = array[0];
        
        //When 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest() {
        //Given
        Integer type1 = 10; 
        Integer type = 5;
        myArr.add(type);
        myArr.add(type1);
        Integer expected = 1;

        //when
        myArr.remove(0);
        Integer actual = myArr.size();

       //Then 
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
       // Given
        Object expected = 5; 
        myArr.add(5);
        myArr.add(10);

        //When
        Object actual = myArr.get(0);

        //Then 
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTest(){
        //Given
        myArr.set(0,5);
        Object expected = 5;

        //When
        Object[] array = myArr.getArray();
        Object actual = array[0];
        
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void containsTest(){
        //Given
        myArr.add(15);
        Boolean expected = true;

        //When
        Boolean actual =myArr.contains(15);
        
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isEmptyTest(){
        //Given
        myArr.add(10);
        Boolean expected = false;

        //When 
        Boolean actual = myArr.isEmpty();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clearTest(){
        //Given 
        myArr.add(20);
        Integer expected = 0; 

        //When
        myArr.clear();
        Integer actual = myArr.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfTest(){
        //Given
        myArr.add(5);
        myArr.add(10);
        myArr.add(20);
        myArr.add(10);
        Integer expected = 1;

        //When 
        Integer actual = myArr.indexOf(10);
        
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        //Given
        myArr.add(20);
        myArr.add(10); 
        Integer expected = 2;

        //When 
        Integer actual = myArr.size();
        
        //Then
        Assert.assertEquals(expected, actual);
    }

}
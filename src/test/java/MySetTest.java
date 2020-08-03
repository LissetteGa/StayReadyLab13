import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void MySetTest1() {
        //Given
        MySet<Object> mySet = new MySet<Object>();
        //When 
        Integer expected = 20;
        Integer actual = mySet.getArray().length;
        //Then
        Assert.assertEquals(expected, actual);
    } 

    @Test   
    public void MySetTest2(){
        //Given
        MySet<Object> mySet = new MySet<>(30);

        //When
        Integer expected = 30; 
        Integer actual = mySet.getArray().length;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        //Given
        MySet<Object> mySet = new MySet<>();
        Integer type =10;
        Object[] array = mySet.getArray(); 
        mySet.add(type);

        //When
        Object actual = array[0];
        Object expected = type;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test    
    public void removeTest(){
        //Given
        MySet<Object> mySet = new MySet<>();
        Integer type1 = 10; 
        Integer type = 5; 
        mySet.add(type);
        mySet.add(type1); 

        //When 
        mySet.remove(1);
        Integer expected = 1;
        Integer actual = mySet.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        //Given
        MySet<Object> mySet = new MySet<>();
        mySet.add(50);

        //When
        Boolean actual = mySet.contains(50);
        Boolean expected = true;

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isEmptyTest(){
        //Given
        MySet<Object> mySet = new MySet<>();
        mySet.add(50);

        //When 
        Boolean expected = false;
        Boolean actual = mySet.isEmpty();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        //Given
        MySet<Object> mySet = new MySet<>();
        mySet.add(45);
        mySet.add(35);
        
        //When
        Integer expected =2;
        Integer actual = mySet.size();
        //Then 
        Assert.assertEquals(expected, actual);
    }
}
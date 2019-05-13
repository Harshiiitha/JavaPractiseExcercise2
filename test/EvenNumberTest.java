import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
   EvenNumber even;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        even=new EvenNumber();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        even=null;

        System.out.println("Inside After");

    }

    @Test
    public void isEven()
    {


        //act
        boolean result=even.isEven(20);

        //assert
        assertEquals(true,result);
    }
    @Test
    public void isOdd()
    {


        //act
        boolean result=even.isEven(23);

        //assert
        assertEquals(false,result);
    }

}
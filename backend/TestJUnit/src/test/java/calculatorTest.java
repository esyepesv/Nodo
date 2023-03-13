import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    private calculator calculadora;


    @BeforeAll
    public static void beforeall(){
        System.out.println("@beforeAll");
    }

    @BeforeEach
    public void setUp(){
        calculadora = new calculator();
        System.out.println("@beforeEach");
    }

    @Test
    public void test1(){
        System.out.println("soy test 1");
        Assertions.assertNotNull(calculadora);
    }
    @Test
    public void test2(){
        Assertions.assertEquals(5, calculadora.add(1,2));
    }

    @AfterEach
    public void tearDown(){
        System.out.println("@afterEach --> teraDown()");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@afterAll");
    }



}
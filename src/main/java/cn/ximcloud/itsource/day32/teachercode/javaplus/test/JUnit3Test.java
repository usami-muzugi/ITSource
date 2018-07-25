package cn.ximcloud.itsource.day32.teachercode.javaplus.test;


import org.junit.*;

public class JUnit3Test {

    private String name = null;

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @BeforeClass
    public static void a() {
        System.out.println("a");
    }

    @Before
    public void b() {
        name = "xxx";
        System.out.println("b");
    }

    @AfterClass
    public static void c() {
        System.out.println("c");
    }

    @After
    public void d() {
        System.out.println("d");
    }

}

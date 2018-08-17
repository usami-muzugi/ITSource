package cn.ximcloud.itsource.day1_day47.day32_java_plus.teachercode.javaplus.test;


import org.junit.*;

public class JUnit3Test {

    private String name = null;

    @BeforeClass
    public static void a() {
        System.out.println("a");
    }

    @AfterClass
    public static void c() {
        System.out.println("c");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Before
    public void b() {
        name = "xxx";
        System.out.println("b");
    }

    @After
    public void d() {
        System.out.println("d");
    }

}

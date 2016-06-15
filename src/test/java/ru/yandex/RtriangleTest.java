package ru.yandex;

import java.util.Arrays;

import org.junit.*;

import static org.junit.Assert.*;

public class RtriangleTest {

    public Rtriangle triangle = RtriangleProvider.getRtriangle();

    @Test
    public void triangleShouldBeRectangularTest() {

        int aSquare = (int) Math.pow((triangle.getApexX1() - triangle.getApexX2()), 2) + (int) Math.pow((triangle.getApexY1() - triangle.getApexY2()), 2);
        int bSquare = (int) Math.pow((triangle.getApexX2() - triangle.getApexX3()), 2) + (int) Math.pow((triangle.getApexY2() - triangle.getApexY3()), 2);
        int cSquare = (int) Math.pow((triangle.getApexX3() - triangle.getApexX1()), 2) + (int) Math.pow((triangle.getApexY3() - triangle.getApexY1()), 2);
        int[] list = {aSquare, bSquare, cSquare};
        Arrays.sort(list);

        int squareLengthCathetus = list[0] + list[1];
        int squareLengthHypotenuse = list[2];
        assertEquals("Данная фигура не является прямым треугольником.", squareLengthCathetus, squareLengthHypotenuse);
    }

    @Before
    public  void doBeforeTest (){
        //
    }
    @After
    public  void doAfterTest (){
        //
    }
    @BeforeClass
    public static void doBeforeClass (){
        //
    }
    @AfterClass
    public static void doAfterClass (){
        //
    }
    @Ignore
    @Test
    public void ignoreTest (){
        System.out.println("Тест на игнор не пройден");
    }
}

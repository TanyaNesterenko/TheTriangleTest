package triangle.cases.trianglesType;

import triangle.utils.BaseForTests;
import triangle.utils.RND;

/**
 * Базовый класс от которого наследуются все тесты в пакете triangles.
 */
public class BaseForTrianglesType extends BaseForTests {
    private Integer sideA;
    private Integer sideB;
    private Integer sideV;


    public String getSideA() {
        return sideA.toString();
    }

    public String getSideB() {
        return sideB.toString();
    }

    public String getSideV() {
        return sideV.toString();
    }

    /**
     * Задаёт длины сторон для равностороннего треугольника
     */
    public void makeEquilateralTriangle() {
        Integer length = RND.randomInteger();
        sideA = length;
        sideB = length;
        sideV = length;
    }

    /**
     * Задаёт длины сторон для равнобедренного треугольника
     */
    public void makeIsoscelesTriangle(Character ch) {
        Integer length = RND.randomInteger()/2;
        Integer anotherLength = length * 2 - 1;
        if (anotherLength > 2 && RND.randomInteger() % 2 == 0) anotherLength--;
        sideA = ch.equals('A') ? anotherLength : length;
        sideB = ch.equals('B') ? anotherLength : length;
        sideV = ch.equals('V') ? anotherLength : length;
    }

    /**
     * Задаёт длины сторон для равнобедренного нетреугольника
     */
    public void makeIsoscelesNotTriangle(Character ch) {
        Integer length = RND.randomInteger() / 2;
        Integer anotherLength = length * 2;
        if (anotherLength != Integer.MAX_VALUE && RND.randomInteger() % 2 == 0) anotherLength++;
        sideA = ch.equals('A') ? anotherLength : length;
        sideB = ch.equals('B') ? anotherLength : length;
        sideV = ch.equals('V') ? anotherLength : length;
    }

    /**
     * Задаёт длины сторон для разностороннего треугольника
     */
    public void makeScaleneTriangle(Character ch) {
        if (ch.equals('A')) {
            sideB = RND.randomInteger() / 2;
            sideV = RND.randomInteger() / 2;
            sideA = (sideB + sideV) - 1;
        } else if (ch.equals('B')) {
            sideA = RND.randomInteger() / 2;
            sideV = RND.randomInteger() / 2;
            sideB = (sideA + sideV) - 1;

        } else if (ch.equals('V')) {
            sideA = RND.randomInteger() / 2;
            sideB = RND.randomInteger() / 2;
            sideV = (sideA + sideB) - 1;
        }
    }

    /**
     * Задаёт длины сторон для разностороннего треугольника
     */
    public void makeNotTriangle(Character ch) {
        if (ch.equals('A')) {
            sideB = RND.randomInteger() / 2;
            sideV = RND.randomInteger() / 2;
            sideA = RND.randomInteger() % 2 == 0 ? (sideB + sideV) : (sideB + sideV) + 1;
        } else if (ch.equals('B')) {
            sideA = RND.randomInteger() / 2;
            sideV = RND.randomInteger() / 2;
            sideB = RND.randomInteger() % 2 == 0 ? (sideA + sideV) : (sideA + sideV) + 1;

        } else if (ch.equals('V')) {
            sideA = RND.randomInteger() / 2;
            sideB = RND.randomInteger() / 2;
            sideV = RND.randomInteger() % 2 == 0 ? (sideA + sideB) : (sideA + sideB) + 1;
        }
    }

    /**
     * Задаёт длины сторон для прямоугольного треугольника
     */
    //TODO: Подобрать формулу подсчёта гипотенузы, чтобы подходила к форме
    public void makeRectangularTriangle(Character ch) {
        Integer[] cathetus1 = {3, 5, 15, 7, 21, 35, 9, 45, 63};
        Integer[] cathetus2 = {4, 12, 8, 24, 20, 12, 40, 28, 16};
        Integer[] hypotenuse = {5, 13, 17, 25, 29, 37, 41, 53, 65};
        int index = RND.randomInteger(cathetus1.length);
        if (ch.equals('A')) {
            sideA = hypotenuse[index];
            sideB = cathetus1[index];
            sideV = cathetus2[index];
        } else if (ch.equals('B')) {
            sideA = cathetus1[index];
            sideB = hypotenuse[index];
            sideV = cathetus2[index];
        } else if (ch.equals('V')) {
            sideA = cathetus1[index];
            sideB = cathetus2[index];
            sideV = hypotenuse[index];
        }
    }
}

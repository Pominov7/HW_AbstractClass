package com.company.abstractClass_2;

public class ShowFigure {

    //метод тестирования фигуры
    static void printGeometricFigure(GeometricFigure figure) {
        System.out.println("S = " + figure.S());
        System.out.println("P = " + figure.P());
    }

    // тестирование фигуры и интерфейсов
    static void testFigureAndInterfaces(GeometricFigure figure) {
        // безопасный вызов печати
        if (figure instanceof IPrintable)
            makeConsolePrint((IPrintable) figure);
        else
            System.out.println("IPrintable не поддерживается");
        // безопасный вызов отрисовки
        if (figure instanceof IDrawable)
            makeConsoleDraw((IDrawable) figure);
        else
            System.out.println("IDrawable не поддерживается");
    }

    // тестирование интерфейса IPrintable
    static void makeConsolePrint(IPrintable printable) {
        printable.consolePrint();
    }

    // тестирование интерфейса IDrawable
    static void makeConsoleDraw(IDrawable drawable) {
        drawable.consoleDraw();
    }

    public static void main(String[] args) {

        System.out.println("1.Тестирование интерфейсов \"IPrintable и IDrawable \": \n");
        // содаём объект прямоугольник
        Rectangle rect = new Rectangle("Rectangle", 4, 8);
        testFigureAndInterfaces(rect);//печать и отрисовка фигуры в консоль
        printGeometricFigure(rect);//вывод площади и периметра
        System.out.println();

        //содаём объект треугольник
        Triangle triangle = new Triangle("Triangle", 4, 5, 6);
        testFigureAndInterfaces(triangle);//печать и отрисовка фигуры в консоль
        printGeometricFigure(triangle);//вывод площади и периметра
        System.out.println();

        //содаём объект квадрат
        Square square = new Square("Square", 4);
        testFigureAndInterfaces(square);//печать и отрисовка фигуры в консоль
        printGeometricFigure(square);//вывод площади и периметра
        System.out.println();

        //содаём объект окружность
        Circle circle = new Circle("Circle", 3);
        testFigureAndInterfaces(circle);//печать и отрисовка фигуры в консоль
        printGeometricFigure(circle);//вывод площади и периметра
        System.out.println();

        System.out.println("2.Тестирование класса \"Сцена фигур\": ");
        FigureScene comp = new FigureScene(4);
        // поместили прямоугольник в класс «Сцена фигур», на 1-е место в массиве
        comp.setFigure(rect, 0);

        // поместили треугольник в класс «Сцена фигур», на 2-е место в массиве
        comp.setFigure(triangle, 1);

        // поместили квадрат в класс «Сцена фигур», на 3-е место в массиве
        comp.setFigure(square, 2);

        // поместили окружность в класс «Сцена фигур», на 4-е место в массиве
        comp.setFigure(circle, 3);
        makeConsolePrint(comp);
        makeConsoleDraw(comp);

        //Вывод  в консоль общей площади и периметра всех фигур массива
        System.out.println("Общая площадь S = " + comp.generalAreaFigure());
        System.out.println("Общий периметр P = " + comp.generalPerimeterFigure());

    }
}

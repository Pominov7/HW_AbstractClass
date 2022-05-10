package com.company.abstractClass_1;

public class ShowFigure {
    //метод тестирования фигуры
    static void printGeometricFigure(GeometricFigure figure) {
        System.out.println(figure);
        System.out.println("S = " + figure.S());
        System.out.println("P = " + figure.P());
    }

    public static void main(String[] args) {

        System.out.println("1.Тестирование класса \"Геометрическая фигура\": ");
        // содаём объект прямоугольник
        Rectangle rect = new Rectangle("Rectangle", 3, 4);
        printGeometricFigure(rect);//вывод площади и периметра
        System.out.println();

        //содаём объект треугольник
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        printGeometricFigure(triangle);//вывод площади и периметра
        System.out.println();

        //содаём объект квадрат
        Square square = new Square("Square", 3);
        printGeometricFigure(square);//вывод площади и периметра
        System.out.println();

        //содаём объект окружность
        Circle circle = new Circle("Circle", 3);
        printGeometricFigure(circle);//вывод площади и периметра
        System.out.println();

        //Создание составной фигуры
        System.out.println("2.Тестирование класса \"Составная фигура\": ");
        CompoundFigure comp = new CompoundFigure(4);//Массив из 4-х фигур

        //поместили прямоугольник в класс «Составная фигура», на 1-е место в массиве
        comp.setFigure(rect, 0);

        //поместили треугольник в класс «Составная фигура», на 2-е место в массиве
        comp.setFigure(triangle, 1);

        //поместили квадрат в класс «Составная фигура», на 3-е место в массиве
        comp.setFigure(square, 2);

        //поместили окружность в класс «Составная фигура», на 4-е место в массиве
        comp.setFigure(circle, 3);

        //вывод в консоль массива составной фигуры
        System.out.println(comp);

        //добавляем новую фигуру в массив
        comp.addFigure();
        System.out.println("Добавляем новую фигуру в массив фигур: ");
        comp.setFigure(new Square("Square2", 8), 4);

        //вывод всех параметров фигур массива с учетом новой добавленной фигурой
        comp.allOptionsFigure();
        System.out.println();

        //Вывод  в консоль общей площади и периметра всех фигур массива
        System.out.println("Общая площадь S = " + comp.generalAreaFigure());
        System.out.println("Общий периметр P = " + comp.generalPerimeterFigure());
    }
}

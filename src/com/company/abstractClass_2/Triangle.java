package com.company.abstractClass_2;

// класс треугольник
public class Triangle extends GeometricFigure implements IPrintable, IDrawable {

    // поля треугольника
    private double a;       // сторона a
    private double b;       // сторона b
    private double c;       // сторона b

    // 1. конструктор без параметров
    public Triangle() {
        this.name = "name";
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    // 2. конструктор с 4-мя параметрами
    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // методы
    // 1. метод получения площади - перегрузка метода S() базового класса
    @Override
    public double S() {
        double halfP = P() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    // 2. метод получения периметра - перегрузка метода P() базового класса
    @Override
    public double P() {
        return a + b + c;
    }

    // 3. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + ": a = " + a + ", b = " + b + ", c = " + c;
    }

    // 4. метод печати фигуры на консоль
    @Override
    public void consolePrint() {
        System.out.println(this);
    }

    // 5. метод отрисовки фигуры в консоль
    @Override
    public void consoleDraw() {
        // Прямоугольный треугольник
        for (int i = 1; i <= (int) a; ++i) { //Получаем строки
            for (int j = (int) b; j > i; --j) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; ++j) { // Выводим фигуру звездочками
                System.out.print("*");
            }
            System.out.println();//Переходим на новую строку после прохода основного цикла for
        }
    }
}

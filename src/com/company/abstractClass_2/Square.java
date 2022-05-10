package com.company.abstractClass_2;

// класс квадрат
public class Square extends GeometricFigure implements IPrintable, IDrawable {

    // поля квадрата
    private double a;

    // конструкторы
    //1. конструктор без параметров
    public Square() {
        a = 0;
    }

    //2. конструктор с двумя параметрами
    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    // методы
    // 1. метод получения площади - перегрузка метода S() базового класса
    @Override
    public double S() {
        return a * a;
    }

    // 2. метод получения периметра - перегрузка метода P() базового класса
    @Override
    public double P() {
        return a * 4;
    }

    // 3. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + ": a = " + a;
    }

    // 4. метод печати фигуры на консоль
    @Override
    public void consolePrint() {
        System.out.println(this);
    }

    // 5. метод отрисовки фигуры в консоль
    @Override
    public void consoleDraw() {
        for (int i = 0; i < (int) a; i++) {
            for (int j = 0; j < (int) a; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}

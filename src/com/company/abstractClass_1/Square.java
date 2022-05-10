package com.company.abstractClass_1;

// класс квадрат
public class Square extends GeometricFigure {

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
}

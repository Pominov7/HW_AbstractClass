package com.company.abstractClass_1;

// класс окружность
public class Circle extends GeometricFigure {

    // поля окружности
    private double r;   // радиус окружности

    // конструкторы
    //1. конструктор без параметров
    public Circle() {
        r = 0;
    }

    //2. конструктор с одним параметром
    public Circle(double r) {
        this.r = r;
    }

    //3. конструктор с двумя параметрами
    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    // методы
    // 1. метод получения площади - перегрузка метода S() базового класса
    @Override
    public double S() {
        return Math.PI * r * r;
    }

    // 2. метод получения периметра - перегрузка метода P() базового класса
    @Override
    public double P() {
        return 2 * Math.PI * r;
    }

    // 3. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + ": r = " + r;
    }

}

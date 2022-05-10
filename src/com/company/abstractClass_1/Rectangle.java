package com.company.abstractClass_1;


// класс прямоугольник
public class Rectangle extends GeometricFigure {

    // поля прямоугольника
    private double a;
    private double b;

    // конструкторы
    //1. конструктор без параметров
    public Rectangle() {
        a = b = 0;
    }

    //2. конструктор с 3 параметрами
    public Rectangle(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    //3. делегируем конструктор с 3 параметрами
    public Rectangle(String name, double x) {
        this(name, x, x);
    }

    // методы
    // 1. метод получения площади - перегрузка метода S() базового класса
    @Override
    public double S() {
        return a * b;
    }

    // 2. метод получения периметра - перегрузка метода P() базового класса
    @Override
    public double P() {
        return (a + b) * 2;
    }

    // 3. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return name + ": a = " + a + "," + " b = " + b;
    }
}
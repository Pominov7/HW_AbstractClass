package com.company.abstractClass_1;

//Абстрактный класс «геометрическая фигура»
public abstract class GeometricFigure {

    // имя фигуры
    protected String name;

    // конструкторы
    //1. конструктор без параметров
    public GeometricFigure() {
        name = "";
    }

    //2. конструктор с одним параметром
    public GeometricFigure(String name) {
        this.name = name;
    }

    // методы
    // 1. метод получения площади
    public abstract double S();

    // 2. метод получения периметра
    public abstract double P();

    // 3. метод представления класса в виде строки
    @Override
    public String toString() {
        return name;
    }
}

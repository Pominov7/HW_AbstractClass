package com.company.abstractClass_2;

//Абстрактный класс «геометрическая фигура»
public abstract class GeometricFigure {

    // имя фигуры
    protected String name;

    // конструкторы
    //1. конструктор по умолчанию
    public GeometricFigure() {
        name = "";
    }

    //2. конструктор с 1 параметром
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

package com.company.abstractClass_1;

import java.util.Arrays;

// класс «составная фигура»
public class CompoundFigure {

    // поля составной фигуры
    private GeometricFigure[] figures;

    // конструкторы
    //1. конструктор без параметров
    public CompoundFigure() {
        figures = new GeometricFigure[0];
    }

    //2. конструктор с одним параметром
    public CompoundFigure(int figure) {
        figures = new GeometricFigure[figure];
    }

    //setter
    public void setFigure(GeometricFigure figure, int pos) {
        figures[pos] = figure;
    }

    // методы
    // 1. метод добавления новой фигуры в массив
    public void addFigure() {
        figures = Arrays.copyOf(figures, figures.length + 1);
    }

    // 2. метод вывода параметров всех фигур
    public void allOptionsFigure() {
        for (GeometricFigure figure : figures) {
            if (figure != null)
                System.out.println(figure + ", S = " + figure.S() + ", P = " + figure.P());
        }
    }

    // 3. метод вывода общей площади составной фигуры
    public double generalAreaFigure() {
        double res = 0;
        for (GeometricFigure figure : figures) {
            res += figure.S();
        }
        return res;
    }

    // 4. метод вывода общего периметра составной фигуры
    public double generalPerimeterFigure() {
        double res = 0;
        for (GeometricFigure figure : figures) {
            res += figure.P();
        }
        return res;
    }

    // 5. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (GeometricFigure figure : figures) {
            if (figure == null)
                sb.append("empty seat");
            else
                sb.append(figure).append("\n");
        }
        return sb.toString();
    }
}

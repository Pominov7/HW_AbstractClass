package com.company.abstractClass_2;

import java.util.Arrays;

// класс «Сцена фигур»
public class FigureScene implements IPrintable, IDrawable {

    // поля
    private GeometricFigure[] figures;

    // конструктор с одним параметром
    public FigureScene(int figure) {
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

    // 3. метод вывода общей площади фигур
    public double generalAreaFigure() {
        double res = 0;
        for (GeometricFigure figure : figures) {
            res += figure.S();
        }
        return res;
    }

    // 4. метод вывода общего периметра фигур
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

    // 6. метод печати  фигур на консоль
    @Override
    public void consolePrint() {
        System.out.println(toString());
    }

    // 7. метод отрисовки фигур в консоль
    @Override
    public void consoleDraw() {
        for (GeometricFigure figure : figures) {
            if (figure instanceof IDrawable) {
                ((IDrawable) figure).consoleDraw();
            } else {
                System.out.println("Error: " + figure + " IDrawable не поддерживается");
            }
            System.out.println();
        }
    }
}

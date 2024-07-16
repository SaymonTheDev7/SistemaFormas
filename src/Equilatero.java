public class Equilatero extends Triangulo {

    private double area = 0;
    private double perimetro = 0;
    private double lado = 0;

    public Equilatero(double area, double perimetro, double lado) {

        super(area, perimetro);
        this.area = area;
        this.perimetro = perimetro;
        this.lado = lado;

    }

    @Override
    public double area() {
        return area = Math.sqrt(3) / 4 * (lado*lado);
    }

    @Override
    public double perimetro() {
        return perimetro = 3 * lado;

    }

    public String toString () {

        return  "/nÁrea:" + area+
                "Perimetro:" + perimetro;

    }
}

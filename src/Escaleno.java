public class Escaleno extends Triangulo {

    private double area = 0;
    private double perimetro = 0;
    private double semiperimetro = 0;
    private double lado1 = 0, lado2 = 0, lado3 = 0;

    public Escaleno(double area, double perimetro, double semiperimetro, double lado1, double lado2, double lado3) {
        super(area, perimetro);

        this.area = area;
        this.perimetro = perimetro;
        this.semiperimetro = semiperimetro;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    @Override
    public void area() {
         area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado3));
    }

    @Override
    public void perimetro() {
         perimetro = lado1 + lado2 + lado3;

    }

    public double semiperimetro() {
        return semiperimetro = perimetro / 2;

    }

    @Override
    public String toString() {

        return "/nTriângulo escaleno:" +
                "/nÁrea:" + area +
                "/nPerimetro:" + perimetro +
                "Semiperímetro:" + semiperimetro;

    }
}

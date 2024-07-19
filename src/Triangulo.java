public abstract class Triangulo extends Forma {

    private double lado1 = 0;
    private double lado2 = 0;
    private double lado3 = 0;

    public Triangulo(double lado1, double lado2, double lado3) {

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    @Override

    public double perimetro() {

        return lado1 + lado2 + lado3;

    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
}
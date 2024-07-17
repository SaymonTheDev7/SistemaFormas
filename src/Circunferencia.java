public class Circunferencia extends Forma {

    private double area = 0;
    private double perimetro = 0;
    private double diametro = 0;
    private double raio = 0;

    public Circunferencia(double area, double raio, double perimetro, double diametro) {

        this.raio = raio;
        this.perimetro = perimetro;
        this.diametro = diametro;
        this.area = area;

    }

    @Override

    public void area() {

         area = Math.PI * (raio * raio);

    }

    @Override

    public void perimetro() {

         perimetro = Math.PI * diametro;

    }

    public void diametro() {

        diametro = raio * (raio * raio);

    }

    public double raio() {

        return raio = diametro / 2;

    }

    @Override
    public String toString() {

        return  "\nCírculo:" +
                "\nÁrea:" + area +
                "\nPerimetro:" + perimetro +
                "\nDiâmetro:" + diametro +
                "\nRaio:" + raio;

    }
}

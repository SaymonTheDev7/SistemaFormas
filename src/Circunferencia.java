public class Circunferencia extends Forma {


    private double raio = 0;

    public Circunferencia(double raio) {

        this.raio = raio;

    }

    @Override

    public double area() {

        return Math.PI * (raio * raio);

    }

    @Override

    public double perimetro() {

        return Math.PI * diametro();

    }

    public double diametro() {

        return 2 * raio;

    }

    @Override
    public String toString() {

        return "\nCírculo:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro() +
                "\nDiâmetro:" + diametro() +
                "\nRaio:" + raio;

    }
}

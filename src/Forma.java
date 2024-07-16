public abstract class Forma {

    private static int gerador = 0;
    private int codigo = 0;

    public Forma () {

        gerador++;
        codigo = gerador;

    }

    public abstract double area();

    public abstract double perimetro();

    @Override

    public String toString () {

        return "\nGerador automático:" + gerador;

    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Professor", "professoradm");

        ArrayList<Forma> FORMAS = new ArrayList<Forma>();

        System.out.println(" Bem vindo a calculadora geométrica ");

        String user = "ProfessorADM";
        String password = "professor";
        int erro = 0;

        while (!user.equals(usuario.getUser())) {

            System.out.println(" Insira o seu login: ");
            user = sc.next();

            if (!user.equals(usuario.getUser())) {

                System.out.println(" Login inválido ");
            }
        }

        while (!password.equals(usuario.getPassword())) {

            System.out.println(" Insira sua senha: ");
            password = sc.next();

            if ( !password.equals(usuario.getPassword())) {

                erro++;

            }

            if (erro == 1) {

                System.out.println(" Senha incorreta: 2 tentativas restantes. ");

            }

            if (erro == 2) {

                System.out.println(" Senha incorreta: 1 tentativa restante. ");

            }

            if (erro == 3) {

                System.out.println(" Senha incorreta: Sistema finalizado. ");
                System.exit(0);

            }
        }


        int escolha = 77;

        while (escolha != 0) {


            System.out.println(" --------------------------------------------------------- ");
            System.out.println(" |                                                        |");
            System.out.println(" |   1 - Adicionar forma               2 - Ver formas     |");
            System.out.println(" |                                                        |");
            System.out.println(" |   3 - Menu de listas                0 - Logout         |");
            System.out.println(" |                                                        |");
            System.out.println(" --------------------------------------------------------- ");
            escolha = sc.nextInt();

            if ( escolha == 1 ) {

                int escolhaMenu = 0;
                while ( escolhaMenu != 4 ) {

                    System.out.println(" 1 - Adicionar Círculo ");
                    System.out.println(" 2 - Adicionar Quadrado ");
                    System.out.println(" 3 - Adicionar Triângulos ");
                    System.out.println(" 4 - Voltar");
                    escolhaMenu = sc.nextInt();

                    switch (escolhaMenu) {

                        case 1: {

                            System.out.println("Insira o raio do círculo");
                            double raio = sc.nextDouble();

                            if (raio < 0) {

                                System.out.println("Raio inválido");

                            } else if (raio > 0) {

                                Forma circulo = new Circunferencia(0, raio, 0, 0);
                                ((Circunferencia) circulo).diametro();
                                circulo.perimetro();
                                circulo.area();
                                FORMAS.add(circulo);

                                System.out.println("Círculo cadastrado com sucesso");

                            }

                            break;

                        }

                        case 2: {

                            System.out.println("Insira o lado do quadrado");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado invalído");

                            } else if (lado > 0) {

                                Forma quadrado = new Quadrado(lado, 0);
                                quadrado.area();
                                quadrado.perimetro();
                                FORMAS.add(quadrado);

                                System.out.println("Quadrado cadastrado com sucesso");

                            }

                            break;
                        }

                        case 3: {

                            System.out.println("Insira o valor do primeiro lado");
                            int lado1 = sc.nextInt();

                            System.out.println("Insira o valor do segundo lado");
                            int lado2 = sc.nextInt();

                            System.out.println("Insira o valor do terceiro lado");
                            int lado3 = sc.nextInt();

                            Forma trianguloIsosceles = new Isosceles(0, 0, 0, 0);
                            trianguloIsosceles.area();
                            trianguloIsosceles.perimetro();
                            ((Isosceles) trianguloIsosceles).altura();
                            FORMAS.add(trianguloIsosceles);

                            Forma trianguloEquilatero = new Equilatero(0, 0, 0);
                            trianguloEquilatero.area();
                            trianguloEquilatero.perimetro();
                            FORMAS.add(trianguloEquilatero);

                            Forma trianguloEscaleno = new Escaleno(0, 0, 0, lado1, lado2, lado3);
                            trianguloEscaleno.area();
                            trianguloEscaleno.perimetro();
                            ((Escaleno) trianguloEscaleno).semiperimetro();
                            FORMAS.add(trianguloEscaleno);

                            System.out.println("Triângulo cadastrado com sucesso");

                            break;

                        }
                    }
                }
            }

            else if ( escolha == 2) {

                for ( Forma forma : FORMAS ) {



                }
            }
        }
    }
}
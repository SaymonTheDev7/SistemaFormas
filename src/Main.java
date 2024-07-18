import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Artur", "ArturAdm");
        OperaçoesMain operaçoesMain = new OperaçoesMain();

        System.out.println("Bem vindo a calculadora geométrica ☕");

        String user = "Art";
        String password = "Art";
        int erro = 0;

        while ( ! user.equals(usuario.getUser())) {

            System.out.println("Insira o seu login:");
            user = sc.next();

            if ( ! user.equals(usuario.getUser())) {

                System.out.println("Login inválido, tente novamente:");

            }
        }

        while ( ! password.equals(usuario.getPassword())) {

            System.out.println("Insira a sua senha:");
            password = sc.next();

            if ( ! password.equals(usuario.getPassword())) {

                erro ++;

                if ( erro == 1 ) {

                    System.out.println("Senha inválida. Tentativas restantes: 2");

                }

                if ( erro == 2 ) {

                    System.out.println("Senha inválida. Tentativas restantes: 1");

                }

                if ( erro == 3 ) {

                    System.out.println("Senha inválida. Sistema sendo finalizado.");
                    System.exit(0);

                }
            }
        }

        int escolhaMenu = 1;

        while ( escolhaMenu != 0 ) {

            System.out.println("----------------------------------------------------------");
            System.out.println("|                   Menu de escolhas                      |");
            System.out.println("|                                                         |");
            System.out.println("|     1 - Adicionar forma.          2 - Remover forma.    |");
            System.out.println("|                                                         |");
            System.out.println("|     2 - Listar formas.            3 - Menu de listas    |");
            System.out.println("|                                                         |");
            System.out.println("|                        0 - Logout                       |");
            System.out.println("----------------------------------------------------------");
            escolhaMenu = sc.nextInt();

            int escolhaForma = 1;

            switch ( escolhaMenu ) {

                case 1 : {

                    while ( escolhaForma != 5 ) {

                        System.out.println("1. Adicionar círculo");
                        System.out.println("2. Adicionar quadrado");
                        System.out.println("3. Adicionar retangulo");
                        System.out.println("4. Adicionar triângulo");
                        System.out.println("5. Voltar.");
                        escolhaForma = sc.nextInt();

                        if (escolhaForma == 1) {

                            System.out.println("Insira o raio do círculo");
                            double raio = sc.nextDouble();

                            if ( raio < 0 ) {

                                System.out.println("Raio inválido");

                            }

                            else {

                                Forma circulo = new Circunferencia(raio);
                                operaçoesMain.adicionarItem(circulo);
                                System.out.println("Círculo cadastrado com sucesso");

                            }
                        }

                }
            }
        }
    }
}
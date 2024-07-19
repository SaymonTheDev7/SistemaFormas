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

        while (!user.equals(usuario.getUser())) {

            System.out.println("Insira o seu login:");
            user = sc.next();

            if (!user.equals(usuario.getUser())) {

                System.out.println("Login inválido, tente novamente:");

            }
        }

        while (!password.equals(usuario.getPassword())) {

            System.out.println("Insira a sua senha:");
            password = sc.next();

            if (!password.equals(usuario.getPassword())) {

                erro++;

                if (erro == 1) {

                    System.out.println("Senha inválida. Tentativas restantes: 2");

                }

                if (erro == 2) {

                    System.out.println("Senha inválida. Tentativas restantes: 1");

                }

                if (erro == 3) {

                    System.out.println("Senha inválida. Sistema sendo finalizado.");
                    System.exit(0);

                }
            }
        }

        int escolhaMenu = 1;

        while (escolhaMenu != 0) {

            System.out.println("----------------------------------------------------------");
            System.out.println("|                   Menu de escolhas                      |");
            System.out.println("|                                                         |");
            System.out.println("|    1 - Adicionar forma.          2 - Remover forma.     |");
            System.out.println("|                                                         |");
            System.out.println("|    3 - Listar formas.            4 - Menu de listas.    |");
            System.out.println("|                                                         |");
            System.out.println("|                       0 - Logout                        |");
            System.out.println("----------------------------------------------------------");
            escolhaMenu = sc.nextInt();

            int escolhaForma = 1;

            switch (escolhaMenu) {

                case 0: {

                    password = "Art";

                    while (!password.equals(usuario.getPassword())) {

                        System.out.println("Insira a sua senha para fazer logout:");
                        password = sc.next();

                        if (password.equals(usuario.getPassword())) {

                            System.out.println("Sistema sendo finalizado.");
                            System.exit(0);

                        }
                    }
                }

                break;

                case 1: {

                    while (escolhaForma != 5) {

                        System.out.println("1. Adicionar círculo");
                        System.out.println("2. Adicionar quadrado");
                        System.out.println("3. Adicionar retangulo");
                        System.out.println("4. Adicionar triângulo");
                        System.out.println("5. Voltar.");
                        escolhaForma = sc.nextInt();

                        if (escolhaForma == 1) {

                            System.out.println("Insira o raio do círculo:");
                            double raio = sc.nextDouble();

                            if (raio < 0) {

                                System.out.println("Raio inválido");

                            } else {

                                Forma circulo = new Circunferencia(raio);
                                operaçoesMain.adicionarItem(circulo);
                                System.out.println("Círculo cadastrado com sucesso");

                            }
                        } else if (escolhaForma == 2) {

                            System.out.println("Insira o lado do quadrado:");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido");

                            } else {

                                Forma quadrado = new Quadrado(lado);
                                operaçoesMain.adicionarItem(quadrado);
                                System.out.println("Quadrado castrado com sucesso");

                            }
                        } else if (escolhaForma == 3) {

                            System.out.println("Insira o primeiro lado do retângulo:");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido");

                            }

                            System.out.println("Insira o segundo lado do retângulo:");
                            double lado1 = sc.nextDouble();

                            if (lado1 < 0) {

                                System.out.println("Lado inválido");

                            } else {

                                Forma retangulo = new Retangulo(lado, lado1);
                                operaçoesMain.adicionarItem(retangulo);
                                System.out.println("Retângulo cadastrado com seucesso");

                            }
                        } else if (escolhaForma == 4) {

                            System.out.println("Insira o primeiro lado do triângulo");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido");

                            }

                            System.out.println("Insira o segundo lado do triângulo:");
                            double lado1 = sc.nextDouble();

                            if (lado1 < 0) {

                                System.out.println("Lado inválido");

                            }

                            System.out.println("Insira o segundo lado do triângulo:");
                            double lado2 = sc.nextDouble();

                            if (lado2 < 0) {

                                System.out.println("Lado inválido");

                            } else {

                                if (lado != lado1 && lado != lado2 && lado1 != lado && lado1 != lado2 && lado2 != lado && lado2 != lado1) {

                                    Forma trianguloEscaleno = new Escaleno(lado, lado1, lado2);
                                    operaçoesMain.adicionarItem(trianguloEscaleno);
                                    System.out.println("Triângulo Escaleno adicionado com sucesso.");

                                } else if (lado == lado1 && lado == lado2 || lado1 == lado && lado1 == lado2 || lado2 == lado && lado2 == lado1) {

                                    Forma trianguloEquilatero = new Equilatero(lado, lado1, lado2);
                                    operaçoesMain.adicionarItem(trianguloEquilatero);
                                    System.out.println("Triângulo Equilatero adicionado com sucesso.");

                                } else {

                                    Forma trianguloIsosceles = new Isosceles(lado, lado1, lado2);
                                    operaçoesMain.adicionarItem(trianguloIsosceles);
                                    System.out.println("Triângulo Isósceles adicionado com sucesso.");

                                }
                            }
                        }
                    }
                }

                break;

                case 2: {

                    int codigo = 0;

                    System.out.println(operaçoesMain.listarItens());

                    System.out.println("Insira o código da forma que deseja remover");

                    codigo = sc.nextInt();

                    while (codigo >= operaçoesMain.getFORMAS().size() && codigo <= operaçoesMain.getFORMAS().size()) {

                        System.out.println("Código inexistente. Insira novamente:");
                        codigo = sc.nextInt();

                    }

                    operaçoesMain.removerItem(codigo);
                    System.out.println("Forma removida com sucesso.");

                }

                break;

                case 3: {

                    if (operaçoesMain.getFORMAS().size() == 0) {

                        System.out.println("Nenhuma forma cadastrada.");

                    } else {

                        System.out.println("Lista de formas:");
                        System.out.println(operaçoesMain.listarItens());

                    }
                }

                break;

                case 4 : {

                    int escolhaLista = 0;

                    while (escolhaLista != 5 ) {

                        System.out.println("Insira o número da lista que deseja ver:");
                        System.out.println("1.Listar Círculos.");
                        System.out.println("2.Listar Quadrados.");
                        System.out.println("3.Listar Retangulos");
                        System.out.println("4.Listar Triângulos.");
                        System.out.println("5.Voltar.");
                        escolhaLista = sc.nextInt();

                        if ( escolhaLista == 1) {

                            int contadorCirculo = 0;

                            for ( Forma forma : operaçoesMain.getFORMAS() ) {

                                if ( forma instanceof Circunferencia ) {
                                    System.out.println( forma );
                                    contadorCirculo++;
                                }
                            }

                            if ( contadorCirculo == 0 ) {

                                System.out.println("Nenhum círculo foi adicionado ainda.");

                            }
                        }
                    }
                }
            }
        }
    }
}
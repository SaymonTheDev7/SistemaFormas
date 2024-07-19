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

                } else if (erro == 2) {

                    System.out.println("Senha inválida. Tentativas restantes: 1");

                } else if (erro == 3) {

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

                            System.out.println("Volte sempre ☕");
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

                                System.out.println("Raio inválido.");

                            } else {

                                Forma circulo = new Circunferencia(raio);
                                operaçoesMain.adicionarItem(circulo);
                                System.out.println("Círculo cadastrado com sucesso.");

                            }
                        } else if (escolhaForma == 2) {

                            System.out.println("Insira o lado do quadrado:");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido.");

                            } else {

                                Forma quadrado = new Quadrado(lado);
                                operaçoesMain.adicionarItem(quadrado);
                                System.out.println("Quadrado castrado com sucesso.");

                            }

                        } else if (escolhaForma == 3) {

                            System.out.println("Insira o primeiro lado do retângulo:");
                            double lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido.");

                            }

                            System.out.println("Insira o segundo lado do retângulo:");
                            double lado1 = sc.nextDouble();

                            if (lado1 < 0) {

                                System.out.println("Lado inválido.");

                            } else {

                                Forma retangulo = new Retangulo(lado, lado1);
                                operaçoesMain.adicionarItem(retangulo);
                                System.out.println("Retângulo cadastrado com seucesso.");

                            }
                        } else if (escolhaForma == 4) {

                            double lado = 0;
                            double lado1 = 0;
                            double lado2 = 0;

                            System.out.println("Insira o primeiro lado do triângulo.");
                            lado = sc.nextDouble();

                            if (lado < 0) {

                                System.out.println("Lado inválido.");

                            }

                            System.out.println("Insira o segundo lado do triângulo:");
                            lado1 = sc.nextDouble();

                            if (lado1 < 0) {

                                System.out.println("Lado inválido.");

                            }

                            System.out.println("Insira o terceiro lado do triângulo:");
                            lado2 = sc.nextDouble();

                            if (lado2 < 0 && lado + lado1 <= lado2 || lado1 + lado2 <= lado || lado2 + lado <= lado1 ) {

                                System.out.println("Lado inválido.");

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

                    System.out.println("Insira o código da forma que deseja remover.");

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

                case 4: {

                    int escolhaLista = 0;

                    while (escolhaLista != 5) {

                        System.out.println("Insira o número da lista que deseja ver:");
                        System.out.println("1.Listar círculos.");
                        System.out.println("2.Listar quadrados.");
                        System.out.println("3.Listar retangulos");
                        System.out.println("4.Menu dos triângulos.");
                        System.out.println("5.Voltar.");
                        escolhaLista = sc.nextInt();

                        if (escolhaLista == 1) {

                            int contadorCirculo = 0;

                            for (Forma forma : operaçoesMain.getFORMAS()) {

                                if (forma instanceof Circunferencia) {
                                    System.out.println(forma);
                                    contadorCirculo++;
                                }
                            }

                            if (contadorCirculo == 0) {

                                System.out.println("Nenhum círculo foi adicionado ainda.");

                            }
                        } else if (escolhaLista == 2) {

                            int contadorQuadrado = 0;

                            for (Forma forma : operaçoesMain.getFORMAS()) {

                                if (forma instanceof Quadrado) {
                                    System.out.println(forma);
                                    contadorQuadrado++;

                                }
                            }

                            if (contadorQuadrado == 0) {

                                System.out.println("Nenhum quadrado foi adicionado ainda.");
                            }
                        } else if (escolhaLista == 3) {

                            int contadorRetangulo = 0;

                            for (Forma forma : operaçoesMain.getFORMAS()) {

                                if (forma instanceof Retangulo) {
                                    System.out.println(forma);
                                    contadorRetangulo++;

                                }
                            }

                            if (contadorRetangulo == 0) {

                                System.out.println("Nenhum retângulo foi adicionado ainda");

                            }
                        } else if (escolhaLista == 4) {

                            int escolhaTriangulo = 0;

                            while (escolhaTriangulo != 5) {

                                System.out.println("Insira o número da lista do triângulo que deseja ver:");
                                System.out.println("1.Listar triângulos Isósceles.");
                                System.out.println("2.Listar triângulos Equilateros.");
                                System.out.println("3.Listar triângulos Escalenos.");
                                System.out.println("4.Listar todos os triângulos.");
                                System.out.println("5.Voltar.");
                                escolhaTriangulo = sc.nextInt();


                                if (escolhaTriangulo == 1) {

                                    int contadorIsosceles = 0;

                                    for (Forma forma : operaçoesMain.getFORMAS()) {

                                        if (forma instanceof Isosceles) {

                                            System.out.println(forma);
                                            contadorIsosceles++;

                                        }
                                    }

                                    if (contadorIsosceles == 0) {

                                        System.out.println("Nenhum triângulo Isósceles foi adicionado ainda.");

                                    }
                                } else if (escolhaTriangulo == 2) {

                                    int contadorEquilatero = 0;

                                    for (Forma forma : operaçoesMain.getFORMAS()) {

                                        if (forma instanceof Equilatero) {

                                            System.out.println(forma);
                                            contadorEquilatero++;

                                        }
                                    }

                                    if (contadorEquilatero == 0) {

                                        System.out.println("Nenhum triângulo Equilatero foi adicionado ainda. ");

                                    }
                                } else if (escolhaTriangulo == 3) {

                                    int contadorEscaleno = 0;

                                    for (Forma forma : operaçoesMain.getFORMAS()) {

                                        if (forma instanceof Escaleno) {

                                            System.out.println(forma);
                                            contadorEscaleno++;

                                        }
                                    }

                                    if (contadorEscaleno == 0) {

                                        System.out.println("Nenhum triângulo Escaleno foi adicionado ainda.");

                                    }
                                } else if (escolhaTriangulo == 4) {

                                    int contadorTodos = 0;

                                    for (Forma forma : operaçoesMain.getFORMAS()) {

                                        if (forma instanceof Triangulo) {

                                            System.out.println(forma);
                                            contadorTodos++;

                                        }
                                    }

                                    if (contadorTodos == 0) {

                                        System.out.println("Nenhum triângulo foi adicionado ainda.");

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
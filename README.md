# Java 
- Portatil 
- Facil
- Segura 
- Onipresente

- Pareciada com C++
- Utiliza muitas bibliotecas e tem uma grande comunidade 

## JVM - Máquina Virtual Java 
Para facilitar o entendimento entre o código (executável) e o destino. 
- Ele ira executar o código independente do sistema operacional

* Importancia da Máquina Virtual 
- Multi-Plataforma 
- Gerenciamento de memória 
- Segurança 
- Sandbox
- Otimizações 
- JIT Compiler

## Bytecode
- Não é um código fonte
- Para ser executado precisa da JVM
- É independente do sistema operacional

* Diferença entre o executável do Windows (exe) e o executável do mundo Java (Bytecode)
- Os executáveis do mundo Java são portáveis, os do mundo Windows não. 
- Os executáveis do mundo Windows podem ser executados diretamente no sistema operacional, os do mundo Java precisam da máquina virtual.

## JRE / JDK 
- O JRE é o ambiente para executar uma aplicação Java.
    JRE = JDK + bibliotecas

- O JDK é o ambiente para executar uma aplicação Java e possui várias ferramentas de desenvolvimento. 
    JDK = JRE + ferramentas de desenvolvimento

## Compilamento 
Realizado através do Prompt
    - Entrar na pasta onde o arquivo que vai ser compilado está.
    - javac *nome do arquivo.java*
        Isso vai criar um nome arquivo .class na pasta 
    - java *nome da classe criada*

## IDEs 
Um ambiente integrado de desenvolvimento que centraliza em um único lugar o compilador da linguagem utilizada, editor de texto, documentação e tudo gira em torno de criação de aplicações.

- Utilizamos a IDE Eclipse

## Tipos de prints
- System.out.println - Insere uma nova linha, deixando o marcador posicionado na linha abaixo.
- System.out.print - Mantém o cursor na mesma linha. Geralmente são utilizadas sequências de escape para pular uma linha.
- System.out.printf - Especifica o formato da entrada do tipo de valor, que deve ser o mesmo tipo de dados apontado na
    instrução. Se possuir alguma dúvida verifique a tabela acima dos tipos de dados que podem ser usados.

## Variaveis 
- Java é uma linguagem fortemente tipada, todas as variaveis devem ser decladas com seus tipos.
    EX.: int idade; 
        idade = 21; 
        System.out.println(idade);

* Tipos de variaveis
    char => 'a';
        | Tipos Char so podem receber um único caracter e com aspas simples |

    String => "Alura cursos online de tecnologia"

* Tipos de variaveis numericas
    int => 1;
        | Arredonda o resultado. Int com Int = INT |

    double => 2.8;
        | Pelo menos um dos valores tem que estar em formato double para realizar operações |

    float => flutuante = 3.14f;
        | F obrigatório no final |

    long => grande = 1234567891011L; 
        | L obrigatório no final |

    short => pequeno = 2131;

    byte => b = 127;

* Conversão de variaveis 
    EX.: double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);
    
## Fluxo 
* Tipos de fluxos
    While 
    If
    For 
    Switch

    Boolean
    Break

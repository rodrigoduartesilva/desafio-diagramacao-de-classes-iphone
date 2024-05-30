# [DIO](www.dio.me) - Trilha Java Básico

## Autor
- [Rodrigo Duarte](https://github.com/rodrigoduartesilva)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você deverá modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)

```mermaid
classDiagram

     class Teclado{
        +digitarValor()
     }
    
     Teclado <-- iPod
     Teclado <-- Phone
     Teclado <-- Navegador
        
    class iPod {
        -musica:String
        -artista:String
        
        +tocarMusica(musica)
        +selecionarArtista(artista)
        +selecionarMusica(musica)
        +pausarMusica(musica)
    }

    class Phone {
        -numeroDoTelefone:String
        
        +realizarChamada(numeroDoTelefone)
        +atenderChamada()
        +verificarCorreioDeVoz()
        +enviarSms(numeroDoTelefone)
    }

    class Navegador {
        -url:String
        
        +acessarSite(url)
        +atualizarSite()
        +adicionarAba()
    }

    class iPhone {
    }

    iPhone --> iPod
    iPhone --> Phone
    iPhone --> Navegador
    
    
```

### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO.


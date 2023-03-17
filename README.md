- Boas práticas de código
    
    [https://www.freecodecamp.org/news/search?query=design](https://www.freecodecamp.org/news/search?query=design)
    
    [https://www.alura.com.br/artigos/o-que-e-clean-code](https://www.alura.com.br/artigos/o-que-e-clean-code)
    
    Tell, don't ask e Fail Fast
    
    - Orientação a Objetos
        - Coesão:
            - Uma classe coesa faz bem uma única coisa
            - Classes coesas não devem ter várias responsabilidades
        - Encapsulamento:
            - Getters e setters não são formas eficientes de aplicar encapsulamento
            - É interessante fornecer acesso apenas ao que é necessário em nossas classes
            - O encapsulamento torna o uso das nossas classes mais fácil e intuitivo
        - Acoplamento:
            - Acoplamento é a dependência entre classes
            - Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento
            - Devemos controlar o nível de acoplamento na nossa aplicação
    - Refatoração
        
        Refatorações servem para melhorar o design do código, e não o funcionamento do sistema. 
        
        Refatorações não devem alterar o funcionamento do sistema, não têm como prioridade melhorar a performance, nem corrigir possíveis problemas.
        
    - SOLID
        
        Resumo: [https://cursos.alura.com.br/course/solid-orientacao-objetos-java/task/85742](https://cursos.alura.com.br/course/solid-orientacao-objetos-java/task/85742)
        
        Princípios de design de código pensados para a programação orientada a objetos, que estão compilados no acrônimo **SOLID**.
        
        - Single Responsibility Principle
            - Classes/métodos/funções/módulos devem ter uma única responsabilidade bem definida;
            - Segundo o **Princípio de Responsabilidade Única (SRP)**, uma classe deve ter um e apenas um motivo para ser alterada;
            - Refatoração para aplicar o SRP;
            - Extrair uma classe.
        - Open Closed Principle
            - Cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
            - O princípio **Aberto/Fechado (OCP)** diz que um sistema deve ser aberto para a extensão, mas fechado para a modificação
                - Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes
            - Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.
        - Liskov Substitution Principle
            - Embora a herança favoreça o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
            - O Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.
            - Uma melhor opção para a herança pode ser a composição.
            
        - Interface Segregation Principle
            - As interfaces devem definir apenas os métodos que fazem sentido para seu contexto;
            - O Princípio de Segregação de Interfaces (ISP) diz que uma classe não deve ser obrigada a implementar um método que ela não precisa;
        - Dependency Inversion Principle
            - É mais interessante e mais seguro para o nosso código depender de interfaces (classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
            - As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;
            - Que o Princípio de Inversão de Dependência (DIP) diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
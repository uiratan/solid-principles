- Boas pr�ticas de c�digo
    
    [https://www.freecodecamp.org/news/search?query=design](https://www.freecodecamp.org/news/search?query=design)
    
    [https://www.alura.com.br/artigos/o-que-e-clean-code](https://www.alura.com.br/artigos/o-que-e-clean-code)
    
    Tell, don't ask e Fail Fast
    
    - Orienta��o a Objetos
        - Coes�o:
            - Uma classe coesa faz bem uma �nica coisa
            - Classes coesas n�o devem ter v�rias responsabilidades
        - Encapsulamento:
            - Getters e setters n�o s�o formas eficientes de aplicar encapsulamento
            - � interessante fornecer acesso apenas ao que � necess�rio em nossas classes
            - O encapsulamento torna o uso das nossas classes mais f�cil e intuitivo
        - Acoplamento:
            - Acoplamento � a depend�ncia entre classes
            - Acoplamento nem sempre � ruim, e que � imposs�vel criar um sistema sem nenhum acoplamento
            - Devemos controlar o n�vel de acoplamento na nossa aplica��o
    - Refatora��o
        
        Refatora��es servem para melhorar o design do c�digo, e n�o o funcionamento do sistema. 
        
        Refatora��es n�o devem alterar o funcionamento do sistema, n�o t�m como prioridade melhorar a performance, nem corrigir poss�veis problemas.
        
    - SOLID
        
        Resumo: [https://cursos.alura.com.br/course/solid-orientacao-objetos-java/task/85742](https://cursos.alura.com.br/course/solid-orientacao-objetos-java/task/85742)
        
        Princ�pios de design de c�digo pensados para a programa��o orientada a objetos, que est�o compilados no acr�nimo **SOLID**.
        
        - Single Responsibility Principle
            - Classes/m�todos/fun��es/m�dulos devem ter uma �nica responsabilidade bem definida;
            - Segundo o�**Princ�pio de Responsabilidade �nica (SRP)**, uma classe deve ter um e apenas um motivo para ser alterada;
            - Refatora��o para aplicar o SRP;
            - Extrair uma classe.
        - Open Closed Principle
            - Cada classe deve conhecer e ser respons�vel por suas pr�prias regras de neg�cio;
            - O princ�pio�**Aberto/Fechado (OCP)**�diz que um sistema deve ser aberto para a extens�o, mas fechado para a modifica��o
                - Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes j� existentes
            - Uma classe que tende a crescer "para sempre" � uma forte candidata a sofrer alguma esp�cie de refatora��o.
        - Liskov Substitution Principle
            - Embora a heran�a favore�a o reaproveitamento de c�digo, ela pode trazer efeitos colaterais quando n�o utilizada da maneira correta;
            - O Princ�pio de Substitui��o de Liskov (LSP) diz que devemos poder substituir classes base por suas classes derivadas em qualquer lugar, sem problema.
            - Uma melhor op��o para a heran�a pode ser a composi��o.
            
        - Interface Segregation Principle
            - As interfaces devem definir apenas os m�todos que fazem sentido para seu contexto;
            - O Princ�pio de Segrega��o de Interfaces (ISP) diz que uma classe n�o deve ser obrigada a implementar um m�todo que ela n�o precisa;
        - Dependency Inversion Principle
            - � mais interessante e mais seguro para o nosso c�digo depender de interfaces (classes abstratas, assinaturas de m�todos e interfaces em si) do que das implementa��es de uma classe;
            - As interfaces s�o menos propensas a sofrer mudan�as enquanto implementa��es podem mudar a qualquer momento;
            - Que o Princ�pio de Invers�o de Depend�ncia (DIP) diz que implementa��es devem depender de abstra��es e abstra��es n�o devem depender de implementa��es;
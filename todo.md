# TODO

## QUESTÃO UM
**PROGRESSO: 100%**

Obs: (De acordo com a questao 3, precisaremos ter um controle de carga horaria cursada para cada instancia de curso?)


## QUESTÃO DOIS
**PROGRESSO: 90%**

Vamos precisar de um Builder pro curso:
- metodos que retornam `this` (FEITO)
- metodos build (FEITO)
- metodos `gerarEmenta()` que aplique a tecnica builder para gerar um objeto do tipo EMENTA (FEITO)

Implementar um objeto IMENTABUILDER que:
- devera ser chamado dentro do CURSO concreto (FEITO)
- receba as variaveis do CURSO (FEITO)
- passe esses valores para as variaveis deste objeto atraves do builder (FEITO)
- retorne um objeto tipo ementa para classe curso (FEITO)
- Definir se sera retornada uma EMENTA para o CLIENT ou para CURSO e este fara o `sysout` (FEITO)

**Verificar se os prerequisitos da questão foram atendidos.**

### Diagrama CURSO BUILDER:
```mermaid
sequenceDiagram
CLIENTE ->> CURSOBUILDER: Me dÃª uma instÃ¢ncia de EMENTA
CURSOBUILDER ->> CURSO: gera um build do produto CURSO no final
CURSO-->>CLIENTE : Receba uma instÃ¢ncia de CURSO
```

### Diagrama EMENTA BUILDER:
```mermaid
sequenceDiagram
CURSO->> EMENTABUILDER: Me dÃª uma instÃ¢ncia de EMENTA
EMENTABUILDER->> EMENTA: gera um build do produto EMENTA no final
EMENTA-->>CURSO: Receba uma instÃ¢ncia de EMENTA
```


## QUESTÃO TRÊS
**PROGRESSO: 70%**


Implementar um objeto IMENTABUILDER que:
- Seja montado num singleton (FEITO)
- Checar se é possível criar outra instância de fora 
- Implementar método de busca e retorno de determinado curso (FEITO)
- Retornar um prótipo do curso
- Verificar como é implementado a questão da carga horária cursada

**Verificar se os prerequisitos da questão foram atendidos.**

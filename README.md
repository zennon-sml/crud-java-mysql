<h1 align="center">Faculdade</h1>

<p align="center">Trabalho conjunto de BD I & POO I</p>

-  **Professora:** Bonny Katty

-  **Equipe:** 
    - [Zennon Sampaio](https://github.com/zennon-sml)
    - [Francisco Da Cunha](https://github.com/X1K00)
    - Joyce Teixeira

- **Resumo:** fazer um sistema administrativo para uma faculdade usando java e mysql.

- [Link para Documentação Do Banco De Dados](https://docs.google.com/document/d/1nttEb6SpSEElt89yA9eLjDXuX4N2D2rQxtZH749GG4E/edit?usp=sharing)

### Recursos:

- CRUD das entidades: Aluno, Professor, Disciplina, Curso, Turma.

- Funçôes de consulta: SelectAll, SelectById, Delete, Update, InsertInto.

- **Especificações: usando maven, mysql-connector-java-8.0.29, JDK 18**

### Conceitos usados de Banco De Dados:

- [x] Consultas 1:1
- [x] Consultas 1:N
- [x] Consultas N:N
- [x] Consultas Complexas, Com JOIN de até 3 tables
```sql
select pd.id, p.nome,d.descricao
from professor_disciplina pd
join professor p on pd.fk_professor = p.id
join disciplina d on pd.fk_disciplina = d.id
```
- [x] Tabela com ligação 1:N com outra tabela de ligação N:N(table **turma** com table **professor_disciplina**)
```java
System.out.print("Escolha o ID do professor da turma: ");
        PrintAll.printAllProfessor(SelectAll.selectAllProfessor());
        System.out.print("Professor ID: ");
        int fk_professor = inputInt.nextInt();

        System.out.print("Escolha o ID da disciplina da turma: ");
        PrintAll.printAllDisciplina(SelectAll.selectAllDisciplina());
        System.out.print("Disciplina ID: ");
        int fk_disciplina = inputInt.nextInt();

        InsertInto.fazerTurma(turma, fk_professor, fk_disciplina);
```

### Conceitos usados de Programação Orientada a Objetos:

- [x] Herança
```java
public class Aluno extends Endereco implements IPessoa {}
```
- [x] Interface
```java
public class CRUDAluno implements ICRUD {}
```
- [x] Polimorfismo
```java
public void printInfo(Aluno a){}
public void printInfo(Professor p) {}
public void printInfo(Turma t){}
```
- [x] Tratamento de exceção
```java
try {
  if (escolha == 9) {
    esc.aluno();
  } else if (escolha == 0) {
  esc.menu();
  } else {
    throw new NumeroNaoListado(escolha);
  }
  } catch (NumeroNaoListado e) {
    e.getMessage();
    System.out.println("Escolha uma das opções disponiveis!!");
  }
```
### Estrutura do projeto:

![image](https://user-images.githubusercontent.com/76619871/177071801-c16ebe24-9dde-4e8e-b572-fa6d3570d8a5.png)

### Video De Utilização:

![image](https://user-images.githubusercontent.com/76619871/177070720-dc88ebf9-8514-4f05-9a50-fb857577fd1b.png)



# Linked List

Uma **Linked List** ou **lista encadeada** é uma estrutura de dados linear usada para armazenar coleções de elementos.  

Diferente de um **array**, os elementos não ficam armazenados de forma contígua na memória. Em vez disso, eles estão distribuídos em diferentes locais, mas cada elemento contém um **ponteiro** que indica o endereço do próximo nó.  

---
## Estrutura de um Nó  

Cada nó dentro de uma **Linked List** é composto por duas partes:  

- **`data`**: Contém o valor armazenado no nó.  
- **`next`**: Contém o endereço do próximo nó na lista.  

Além disso, a **Linked List** possui dois nós especiais:  

- **`head`**: O primeiro nó da lista, ou seja, a cabeça da lista.  
- **`tail`**: O último nó da lista. Esse último elemento tem seu ponteiro `next` definido como **nulo**, pois não há um próximo elemento.  

---
## Vantagens da Linked List  

✅ **Estrutura de dados dinâmica** – Ao contrário de arrays, que geralmente precisam de um tamanho fixo, a **Linked List** pode crescer e diminuir dinamicamente durante a execução, alocando e desalocando memória conforme necessário.  

✅ **Uso eficiente da memória** – Não há desperdício de espaço, pois a lista ocupa apenas a quantidade necessária de memória, sem necessidade de pré-alocação como ocorre em algumas linguagens ao criar arrays.  

---
## Desvantagens da Linked List  

❌ **Maior consumo de memória** – Uma **Linked List** consome mais memória do que um **array**, pois cada nó precisa armazenar, além do valor, o ponteiro para o próximo elemento.  

❌ **Dificuldade na travessia reversa** – Em uma **lista encadeada simples**, não é possível percorrer os elementos de trás para frente, pois cada nó possui apenas um ponteiro para o próximo nó. Para suportar essa funcionalidade, seria necessário adicionar um ponteiro para o nó anterior, o que aumentaria ainda mais o consumo de memória.  

---
Principais fontes:
Livro Entendendo Algoritmos - Aditya Y. Bharga
https://www.freecodecamp.org/news/how-linked-lists-work/
https://www.geeksforgeeks.org/advantages-and-disadvantages-of-linked-list/


Essas são algumas características da **Linked List**. Você já usou essa estrutura de dados antes? 💡🚀

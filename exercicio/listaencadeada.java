package exercicio;

public class listaencadeada {
    no cabeca; // A cabeça da lista

    public void adicionar(int dado) {
        no novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            no atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }
}
    

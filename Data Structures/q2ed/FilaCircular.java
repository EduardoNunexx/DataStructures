public class FilaCircular {
    private int capacidade;
    private int primeiro, ultimo;
    private int[] elementos;
    private Boolean isBuffering;

    public FilaCircular(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.primeiro = this.ultimo = -1;
        this.isBuffering = false;
    }

    //No lugar de um atributo de controle, criei dois que verificam e não preciso alterar durante as funções
    private boolean estaVazia() {
        return primeiro == -1;
    }

    private boolean estaCheia() {
        return (((ultimo + 1) % capacidade) == primeiro);
    }

    private int obterBytesDisponiveis() {
        if (this.estaCheia()){
            return capacidade;
        } else if(this.estaVazia()){
            return 0;
        } else {
            return ((ultimo - primeiro + capacidade + 1) % capacidade);
        }
    }

    public void inserirDados(int n, String str){

        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (estaCheia()) {
                enfileirar(Integer.parseInt(String.valueOf(str.charAt(i))));
                contador++;
            } else {
                enfileirar(Integer.parseInt(String.valueOf(str.charAt(i))));
            }    
        }

        if (contador == 0){
            System.out.println("OK");
        } else {
            contador++;
            primeiro++;
            System.out.println("SOBRESCRITA " + contador);
        }
    }

    public void solicitarDados(int num_bytes, int fps, int min_time){
        int bytesNecessariosEmBuffering = num_bytes * fps * min_time;
        
        if ((obterBytesDisponiveis() < num_bytes) || isBuffering) {
            if (bytesNecessariosEmBuffering > obterBytesDisponiveis()){
                this.isBuffering = true;
                System.out.println("BUFFERING");
                return;
            }
        }

        StringBuilder quadro = new StringBuilder();
        for (int i = 0; i < num_bytes; i++) {
            quadro.append(desenfileirar());
        }

        isBuffering = false;
        System.out.println("QUADRO " + quadro.toString());
    } 

    private void enfileirar(int elemento) {

        if (estaCheia()) {
            primeiro++;
        }

        //Caso de ser a primeira inserção
        if (estaVazia()) {
            primeiro = ultimo = 0;
        
        //Caso de ser uma inserção após o preenchimento da última posição do vetor
        } else if (ultimo == capacidade - 1) {
            ultimo = 0;

        //Todos os outros casos em que a inserção se dá na parte central do vetor (excluindo início e fim)
        } else {
            ultimo++;
        }

        //Inserção propriamente dita
        elementos[ultimo] = elemento;
    }

    private int desenfileirar() {

        // // Verificar se está vazia(isso vai ser tratado na principal(solicitação de dados))
        // if (estaVazia()) {
        //     return -1; //Valor para expressar que não encontrou valor a ser desinfileirado
        // }

        //Remoção do vetor 
        int elemento = elementos[primeiro];

        //Caso de tirar o único elemento de uma fila
        if (primeiro == ultimo) {
            primeiro = ultimo = -1;

        // Caso de tirar um elemento que se encontre na última posição do vetor, o primeiro deixa de ser o último e volta para o início do vetor
        } else if (primeiro == capacidade - 1) {
            primeiro = 0;

        //Libera lugar na fila alocando o primeiro para a frente
        } else {
            primeiro++;
        }

        //Retorna o elemento desenfileirado
        return elemento;
    }
}

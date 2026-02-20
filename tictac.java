class TicTac {
    int FilledCells;
    int Cells;
    String letter1 = "X";
    String letter2 = "O";
    
    public void DesenharTabuleiro() { //nao precisava do método células
    int contador = 1;

    for (int linha = 0; linha < 3; linha++) {
        for (int coluna = 0; coluna < 3; coluna++) {
            System.out.print("| " + contador + " ");
            contador++;
        }
        System.out.println("|");
    }
    
    
}
    
    //public void FilledCells() {
        //if (Cells == X || O) {
            //Cells = FilledCells;
            //System.out.println("Essa célula já está preenchida.");
        //}
    //}
    
}

public class Main
{
	public static void main(String[] args) {
		var tictoe = new TicTac();
		tictoe.DesenharTabuleiro();
		System.out.println("");
	}
}

package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        System.out.print("\t");
		for (int i = 0; i < model.getWidth(); i++){
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i < model.getWidth(); i++){
			for (int j = 0; j < model.getWidth(); j++){
				System.out.print(i + " ");
				System.out.println(model.getMark(i,j));
			}
		}

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        if (model.isXTurn() == true){
			System.out.println("Player 1 (X) Move:");
			System.out.println("Enter the row and cloumn numbers,");
			System.out.println("seperated by a space: ");
		}
		else{
			System.out.println("Player 2 (X) Move:");
			System.out.println("Enter the row and cloumn numbers,");
			System.out.println("seperated by a space: ");
		}

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}
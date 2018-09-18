package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        System.out.print("  ");
		for (int i = 0; i < model.getWidth(); i++){
			System.out.print(i);
		}
		System.out.print("\n");
		for (int i = 0; i < model.getWidth(); i++){
			System.out.print(i + " ");
			for (int j = 0; j < model.getWidth(); j++){
				System.out.print(model.getMark(i,j));
			}
			System.out.print("\n");
		}
		System.out.print("\n");
    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        if (model.isXTurn() == true){
			System.out.println("Player 1 (X) Move:");
			System.out.println("Enter the row and cloumn numbers, seperated by a space: ");
			System.out.print("\n");
		}
		else{
			System.out.println("Player 2 (X) Move:");
			System.out.println("Enter the row and cloumn numbers, seperated by a space: ");
			System.out.print("\n");
		}

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        System.out.println("Invalid input!");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}
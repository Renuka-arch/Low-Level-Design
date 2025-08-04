package TicTacToe;

public class GameClient {
    public static void main(String[] args) {
        System.out.println("We will play the game here!");

        GameController gameController = new GameController();
      
        Game game = gameController.startGame();
        // 3. Keep on playing the game until the game is in IN_PROGRESS state
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){

            // 3.1 display the board
            gameController.display(game);
            // 3.2 makeMove : we will also check the winner and update the state if required
            gameController.makeMove(game);
        }
        // 4. Check the winner / Draw and announce the result

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner is : " + gameController.getWinner(game));
        } else if (gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a draw!");
        }


    }
}

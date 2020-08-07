package main.Code;

public class player
{
    static int N = 9;

    grid playerGrid;
    grid actualGrid;

    public grid getPlayerGrid() { return this.playerGrid; }

    public void setPlayerGrid(grid playerGrid) { this.playerGrid = playerGrid; }

    public player(grid actualGrid)
    {
        this.actualGrid = actualGrid;
        playerGrid = new grid();

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(actualGrid.getTiles()[i][j].getFixed())
                {
                    playerGrid.getTiles()[i][j].setValue(actualGrid.getTiles()[i][j].getValue());
                }
                else
                {
                    playerGrid.getTiles()[i][j].setValue(0);
                }
            }
        }
    }

    public boolean determineVictory()
    {
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(playerGrid.getTiles()[i][j].getValue() != actualGrid.getTiles()[i][j].getValue())
                {
                    return false;
                }
            }
        }

        return true;
    }
}

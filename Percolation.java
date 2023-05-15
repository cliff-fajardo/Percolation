import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class Percolation {

    private int SIZE = 0;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if(n <= 0) throw new IllegalArgumentException("n must be greater than 0.");
        SIZE = n;

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(row < 1 || row > SIZE || col < 1 || col > SIZE) {
            throw new IllegalArgumentException("Row and Col must be between 1 and " + SIZE);
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        if(row < 1 || row > SIZE || col < 1 || col > SIZE) {
            throw new IllegalArgumentException("Row and Col must be between 1 and " + SIZE);
        }

        return false;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){
        if(row < 1 || row > SIZE || col < 1 || col > SIZE) {
            throw new IllegalArgumentException("Row and Col must be between 1 and " + SIZE);
        }

        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites(){

        return -1;
    }

    // does the system percolate?
    public boolean percolates(){

        return false;
    }

    // test client (optional)
    public static void main(String[] args){

    }
}

package src;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {

    int[][] site;

    int[] row;
    WeightedQuickUnionUF uf;
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        //check error;
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
//        site =new int[n][n];
        row = new int[n];
        for (int i = 1; i < n; i++) {//n row
            row[i] = new WeightedQuickUnionUF(n);
//            for (int j = 1; j < n; j++) {
//                site[i][j] = 0;
//            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (row <= 0 || col <= 0) throw new IllegalArgumentException();
//        if (site[row][col] == 0) {
//            site[row][col] = 1;
//        }
//        return;
        int row1 = row;
        int q = 2;
        int p = uf.find(row);
        uf.union(p,q);
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (site[row][col] == 1) {
            return true;
        }
        return false;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {//漏水
        if (site[row][col] == 2) {
            return true;
        }
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        int count = 0;
        for (int i = 0; i < site.length; i++) {
            for (int j = 0; j < site.length; j++) {
                if (isOpen(i,j)) count++;
            }
        }
        return count;
    }

    // does the system percolate?
    public boolean percolates() {

        return false;
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}

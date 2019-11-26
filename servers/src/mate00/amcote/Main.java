package mate00.amcote;

import java.util.List;

public class Main {

    int minimumDays(int rows, int columns, List<List<Integer>> grid) {
        if (rows == grid.size()) {
            for (List<Integer> l : grid) {
                if (l.size() != columns);
            }
        } else {
            throw new IllegalArgumentException("Illegal grid size");
        }
        int days = 0;
        // i can't iterate and update adjacent cells in one go, because that would mean i update whole grid in a single iteration
        // i want to check if there is a 'zero' cell that has adjacent 'one' cell, if so - i mark it for update
        // when done, i apply update to marked cells switching them from 0 to 1
        // this will be inefficient because of nested for loops
        // perhaps we can think of some "density" of updated cells where where we are sure that next iteration will update all remaining

        // let's mark cell for update by 2. This will save me space
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    setForUpdate(i - 1, j, grid);
                    setForUpdate(i + 1, j, grid);
                    setForUpdate(i, j - 1, grid);
                    setForUpdate(i, j + 1, grid);
                }
                System.out.print(grid.get(i).get(j));
            }
            System.out.println();
        }

        return days;
    }

    private void setForUpdate(int row, int column, List<List<Integer>> grid) {
        if (row >= grid.size() && column >= grid.get(row).size()) {
        }
    }

    private void printGrid(List<List<Integer>> grid) {
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                System.out.print(grid.get(i).get(j));
            }
            System.out.println();
        }

    }
}

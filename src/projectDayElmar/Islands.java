package projectDayElmar;

public class Islands {

    // 0 -> water
    // 1 -> land

    static int[][] map = {
        {0,1,0,1,1,0}, //0
        {0,1,0,1,1,0}, //1
        {0,0,1,0,0,0}, //2
        {1,0,0,0,1,0}, //3
        {1,1,0,0,0,0}, //4
    };

    public static int countIslands(int[][] map) {
        int count = 0;

        for(int row = 0; row < map.length; row++){
            for(int col = 0; col < map[row].length; col++) {
                if (map[row][col] == 1){
                    count++;
                    //method
                    markIsland(map, row, col);
                }
            }
        }
        return count;
    }
    private static void markIsland(int[][] map, int row, int col) {
        // method markirovki ostrovov

        if(row < 0 || col < 0 || row >= map.length || col >= map[row].length || map[row][col] == 0){
            return;
        }
        //marking logic
        map[row][col] = 0;

        //Searching logic
        map[row][col] = 0;
        markIsland(map, row + 1, col); //Down
        markIsland(map, row - 1, col); //Up
        markIsland(map, row, col + 1); //Right
        markIsland(map, row, col - 1); //Left
        markIsland(map, row + 1, col + 1); //Down-right
        markIsland(map, row + 1, col - 1); //Down-left
        markIsland(map, row - 1, col + 1); //Up-right
        markIsland(map, row  -1, col - 1); //Up-left


    }


        public static void main(String[] args) {
        System.out.println(countIslands(map));
    }
}

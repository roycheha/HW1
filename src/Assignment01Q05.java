public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = m.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];

        int[] queue = new int[n];
        queue[0] = i;
        visited[i] = true;

        int head = 0, tail = 1, curr;
        
        while (head < tail){
            curr = queue[head];
            head++;
            
            for(int neighbor = 0; neighbor < n; neighbor++){
                if(m[curr][neighbor] == 1 && !visited[neighbor]){
                    if(neighbor == j){
                        return distance[curr] + 1;
                    }

                    visited[neighbor] = true;
                    distance[neighbor] = distance[curr] + 1;
                    queue[tail] = neighbor;
                    tail++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
package Graphs_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class keysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(rooms, 0, visited);
        return visited.size() == rooms.size();
    }

    private void dfs(List<List<Integer>> rooms, int room, Set<Integer> visited) {
        visited.add(room);
        for (int key : rooms.get(room)) {
            if (!visited.contains(key)) {
                dfs(rooms, key, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        keysAndRooms solution = new keysAndRooms();
        
        // Example 1
        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1));
        rooms1.add(Arrays.asList(2));
        rooms1.add(Arrays.asList(3));
        rooms1.add(new ArrayList<>());
        
        boolean result1 = solution.canVisitAllRooms(rooms1);
        System.out.println("Can visit all rooms (Example 1): " + result1); // Expected output: true
        
        // Example 2
        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1, 3));
        rooms2.add(Arrays.asList(3, 0, 1));
        rooms2.add(Arrays.asList(2));
        rooms2.add(Arrays.asList(0));
        
        boolean result2 = solution.canVisitAllRooms(rooms2);
        System.out.println("Can visit all rooms (Example 2): " + result2); // Expected output: false
    }
}

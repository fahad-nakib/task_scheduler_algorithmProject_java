/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshedular;

/**
 *
 * @author Lenovo  taskshedular.topologicalSort
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class topologicalSort {
    //static ArrayList<Integer>[] list;   // for both
    
    //------------------Sort USint BFS---------------------BFS---BFS------------
    static int[] inDegree; static int cur_count=0;
    static Queue<Integer> que = new LinkedList<>();
    static Queue<Integer> ansQue = new LinkedList<>();
        
    //------------------Sort USint BFS---------------------BFS---BFS------------
    public static int bfs(int src,ArrayList<Integer>[] list) {
        int count = 0;
        que.add(src);
        inDegree[src] = -1;
        while (!que.isEmpty()) {
            int cur_value = que.poll();
            count++;
            ansQue.add(cur_value);
            for (int child : list[cur_value]) {
                inDegree[child]--;
                if (inDegree[child] == 0) {
                    que.add(child);
                    inDegree[child] = -1;
                }
            }
        }
        return count;
    }
    public static Queue<Integer> run_bfs(int vertex,ArrayList<Integer>[] list, int[]MinDegree)
    {
        cur_count = 0;
        inDegree = new int[vertex];  
        inDegree = MinDegree;
        ansQue.clear();
        que.clear();
        for (int i = 0; i < vertex; i++) {
            if (inDegree[i] == 0) {
                cur_count += bfs(i,list);
                que.clear();
            }
        }

        
        if (cur_count == vertex) {
            
            return ansQue;
        } else {
            System.out.println("loop exist..");
            //cur_count = 0;
            return que;
        }
    }
    
    //------------------Sort Using DFS---------------------DFS---DFS------------
    static Stack<Integer> stack = new Stack<>();
    static boolean []visited;
    //------------------Sort Using DFS---------------------DFS---DFS------------
    public static void dfs(int src,ArrayList<Integer>[] list)
    {
        visited[src] = true;
        for (int child : list[src]) {
            if (visited[child]) continue;
            dfs(child,list);
        }
        stack.push(src);
    }
    
    public static Stack<Integer> run_dfs(int vertex, ArrayList<Integer>[] list)
    {
        visited = new boolean[vertex];
        for (int i=0; i<vertex; i++)
        {
            if (visited[i]) continue;
            dfs(i,list);
        }
        return stack;
    }
//    public static void main(String[] args) {
//        // for BFS i need --> vertex, edges
//    }
}

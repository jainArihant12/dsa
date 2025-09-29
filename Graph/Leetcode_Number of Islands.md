# Number of Islands  - (LeetCode 200) – Notes

The problem is to count the number of islands in a 2D grid.  
- `'1'` represents **land**  
- `'0'` represents **water**  
- An island is formed by **connected lands** (horizontal + vertical connections only, not diagonal).  
- Task: Count how many distinct islands exist.

---

## General Idea
1. Traverse each cell of the grid.  
2. When we find an unvisited `'1'`, it means we’ve discovered a **new island** → increment the count.  
3. Explore all connected land cells (`'1'`) from this starting cell using either **BFS** or **DFS**, marking them as visited so they are not counted again.  
4. Continue until all cells are checked.

---

## BFS Thought Process
- Use a **queue** to explore neighbors in a breadth-first manner.  
- Start from the discovered `'1'` cell:  
  - Mark it visited and push into queue.  
- While the queue is not empty:  
  - Pop a cell, check its **4-directional neighbors** (up, down, left, right).  
  - If neighbor is within bounds, is `'1'`, and not visited → mark visited and push into queue.  
- This way, the BFS traversal will cover the **entire island** before moving to the next unvisited `'1'`.  

---

## DFS Thought Process
- Use **recursion** (or stack) to explore deeply.  
- When a `'1'` is found:  
  - Mark it visited.  
  - Recursively call DFS for its **4-directional neighbors** (up, down, left, right).  
- The recursion continues until no valid unvisited `'1'` is left → which means the island is fully explored.  
- Return back and continue scanning the grid.  

---

## Complexity Analysis
- **Time Complexity:** `O(m * n)` → Every cell is processed at most once.  
- **Space Complexity:**  
  - BFS → `O(min(m*n))` (queue can hold many elements).  
  - DFS → `O(m*n)` in worst case due to recursion stack (large connected island).  

---

## Key Insight
Both BFS and DFS follow the same core logic:  
- **Count new islands when encountering an unvisited land.**  
- **Explore fully to avoid recounting.**  

The difference lies only in *how* the exploration is done:  
- BFS = level by level (queue)  
- DFS = depth-first (recursion/stack)

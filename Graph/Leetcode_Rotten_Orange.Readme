# Rotten Orange (LeetCode 994) – Notes

## ✅ Thought Process

1. **Identify the type of problem**  
   - This is a **multi-source BFS** problem.  
   - Multiple rotten oranges can start spreading **simultaneously**.  
   - Each “wave” of BFS represents **one minute** of rotting.  

2. **What data structure to use**  
   - A **queue** to implement BFS.  
   - A **Cell/Node** class or structure to store:
     - Row and column of the orange  
     - Time/minute it became rotten (optional, but useful)  

3. **Initialization steps**  
   - Scan the grid:
     - Push all initially **rotten oranges** into the queue.  
     - Count **fresh oranges**.  
   - If no fresh oranges → answer is `0`.  

4. **BFS Traversal**  
   - While the queue is not empty:
     - Remove a rotten orange from the queue.  
     - Spread rot to **4 neighboring cells** (up, down, left, right).  
       - If neighbor is fresh:
         - Mark it as rotten.  
         - Push it into the queue with updated time.  
         - Decrement fresh orange count.  
     - Track **time** as the maximum minute a cell became rotten.  

5. **Return Result**  
   - After BFS ends:
     - If `fresh > 0` → some fresh oranges never rotted → return `-1`.  
     - Else → return `time` (minutes taken to rot all).  

---

## 🔹 Parts of the Main Logic

### Part 1: Cell/Node Representation
- Represents an orange.  
- Stores **row, col**, and optionally **time**.  
- Helps BFS know **when each orange rots**.  

### Part 2: Initialization
- Create a queue for BFS.  
- Store all rotten oranges initially.  
- Count fresh oranges.  
- Handle edge case: no fresh oranges → return 0.  

### Part 3: BFS Traversal
- Pop an orange from the queue.  
- Check its 4 neighbors:
  - Rot any fresh neighbors.  
  - Push neighbors into the queue with incremented time.  
- Update max time while processing each orange.  

### Part 4: Result Check
- If any fresh oranges remain → return `-1`.  
- Else → return total time required.  

---

## 🔹 Key Considerations in the Problem

1. **Boundary Checks**  
   - Always check `r >= 0 && r < m && c >= 0 && c < n`.  
   - Avoid skipping the first row or column.  

2. **Multiple Rotten Oranges**  
   - BFS handles multiple sources naturally.  

3. **Time Calculation**  
   - Can be done in **two ways**:
     1. **Level-based BFS** → increment time after each level of BFS.  
     2. **Cell-based time** → store time in each cell and take maximum at the end.  

4. **Edge Cases**
   - No oranges at all → return 0.  
   - All oranges already rotten → return 0.  
   - Fresh orange isolated → return `-1`.  

5. **Complexity**  
   - **Time:** `O(m × n)` → each cell visited at most once.  
   - **Space:** `O(m × n)` → queue may hold all cells in worst case.  

---

## for Traversal in each direction
```bash
int[] rowdir = {-1,1,0,0};
int[] coldir = {0,0,-1,1};
int r = current.row + rowdir[j];
int c = current.col + coldir[j];
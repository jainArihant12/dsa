# Heap
## What is Heap 
A Heap is a complete binary tree that follows a special ordering rule:

Min Heap → Smallest element is always at the top

Max Heap → Largest element is always at the top
## Syntax
for Max Heap ->  PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
                 PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
for Min Heap -> PriorityQueue<Integer> pq = new PriorityQueue<>();

from Array to heap -> PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(3,1,4,2));


 
### 🔹 Common Heap Operations

| Operation | Method | Time Complexity |
|---------|--------|----------------|
| Insert element | `pq.offer(x)` | `O(log n)` |
| Remove top | `pq.poll()` | `O(log n)` |
| Get top element | `pq.peek()` | `O(1)` |
| Size of heap | `pq.size()` | `O(1)` |
| Check empty | `pq.isEmpty()` | `O(1)` |
| Clear heap | `pq.clear()` | `O(n)` |

## Identification
1) K
2) smallest / Largest 
3) n log k

## Note
when K smallest element -> use MaxHeap

when K largest element -> use MinHeap



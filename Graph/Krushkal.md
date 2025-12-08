PriorityQueue<Edge> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);

int mstCost = 0;
int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < n-1) {
            Edge cur = pq.poll();

            int pu = findParent(cur.u, parent);
            int pv = findParent(cur.v, parent); // Use Union Find 

            if (pu != pv) {
                mstCost += cur.weight;
                union(cur.u, cur.v, parent, rank); // Use Union Find
                edgesUsed++;
            }
        }

        return mstCost;

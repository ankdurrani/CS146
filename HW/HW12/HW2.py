from typing import List

class Edge:
    def __init__(self, from_node, to_node, cost):
        self.from_node = from_node
        self.to_node = to_node
        self.cost = cost
    
    def __lt__(self, other):
        return self.cost < other.cost

class WaterSupplyCost:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        edges = []

        for i in range(n):
            edges.append(Edge(0, i + 1, wells[i]))

        for pipe in pipes:
            edges.append(Edge(pipe[0], pipe[1], pipe[2]))

        edges.sort()

        total_cost = 0
        parent = [i for i in range(n + 1)]

        def find(node):
            if parent[node] != node:
                parent[node] = find(parent[node])
            return parent[node]

        def union(node1, node2):
            root1 = find(node1)
            root2 = find(node2)
            parent[root1] = root2

        for edge in edges:
            root_from = find(edge.from_node)
            root_to = find(edge.to_node)

            if root_from != root_to:
                total_cost += edge.cost
                union(edge.from_node, edge.to_node)

        return total_cost

solution = WaterSupplyCost()
n = 2
wells = [1, 1]
pipes = [[1, 2, 1], [1, 2, 2]]
print(solution.minCostToSupplyWater(n, wells, pipes)) 


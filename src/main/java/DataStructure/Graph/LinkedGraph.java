package DataStructure.Graph;

import DataStructure.Queue.ArrayQueue;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class LinkedGraph<T> {
    //Vertex는 배열 형태로 가지고 있음
    //Edge는 링크드 리스트로 가지고 있음

    //둘다 배열 또는 둘다 링크드 리스트로 구현이 가능하기도 하나, 위의 방법이 일반적이다.

    private Vertex<T>[] vertexes;

    public LinkedGraph()
    {
        this.vertexes = null;
    }

    public void addVertex(Vertex<T> vertex)
    {
        if(this.vertexes == null)
        {
            this.vertexes = (Vertex<T>[]) new Vertex[1];
            this.vertexes[0] = vertex;
        }
        else
        {
            Vertex<T>[] tempVertexes = (Vertex<T>[]) new Vertex[this.vertexes.length + 1];

            System.arraycopy(this.vertexes , 0, tempVertexes, 0, this.vertexes.length);

            tempVertexes[tempVertexes.length-1] = vertex;

            this.vertexes = tempVertexes;
        }
    }

    //Recursive Call로 구현
    public void DFS(Vertex<T> vertexRoot)
    {
        if(vertexRoot.isBoolVisited() == false)
        {
            vertexRoot.setBoolVisited(true);
            System.out.print(vertexRoot.getData() + " ");

            Edge<T> edge = vertexRoot.getEdgeAdjacencyList();

            while(edge != null)
            {
                DFS(edge.getVertexTo());
                edge = edge.getEdgeNext();
            }
        }
    }

    //Queue를 사용하여 구현
    public void BFS(Vertex<T> vertexRoot)
    {
        ArrayQueue<Vertex<T>> queue = new ArrayQueue<Vertex<T>>();

        queue.enqueue(vertexRoot);

        while(!queue.isEmpty())
        {
            Vertex<T> vertex = queue.dequeue();

            if(vertex.isBoolVisited() == false)
            {
                System.out.println(vertex.getData());
                vertex.setBoolVisited(true);

                Edge<T> edge = vertex.getEdgeAdjacencyList();

                while(edge != null)
                {
                    queue.enqueue(edge.getVertexTo());
                    edge = edge.getEdgeNext();
                }
            }
        }
    }
}

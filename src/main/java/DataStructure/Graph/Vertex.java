package DataStructure.Graph;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class Vertex<T> {
    private T data;
    private Edge<T> edgeAdjacencyList;
    private boolean boolVisited;

    public Vertex(T data)
    {
        this.data = data;
        this.boolVisited = false;
        this.edgeAdjacencyList = null;
    }

    public Edge getEdgeAdjacencyList() {
        return edgeAdjacencyList;
    }

    public void setEdgeAdjacencyList(Edge<T> edgeAdjacencyList) {
        this.edgeAdjacencyList = edgeAdjacencyList;
    }

    public boolean isBoolVisited() {
        return boolVisited;
    }

    public void setBoolVisited(boolean boolVisited) {
        this.boolVisited = boolVisited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //Edge 추가 하기
    public void addEdge(Edge<T> edge)
    {
        Edge<T> tempEdge = this.edgeAdjacencyList;

        if(tempEdge == null)
        {
            this.edgeAdjacencyList = edge;
        }
        else
        {
            while(tempEdge.getEdgeNext() != null)
            {
                tempEdge = tempEdge.getEdgeNext();
            }
            tempEdge.setEdgeNext(edge);
        }
    }
}

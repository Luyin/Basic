package DataStructure;

import DataStructure.Graph.Edge;
import DataStructure.Graph.LinkedGraph;
import DataStructure.Graph.Vertex;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by myrao_000 on 2017-02-17.
 */
public class LinkedGraphTest {
    private LinkedGraph graph;
    Vertex<Integer> vertex1;
    Vertex<Integer> vertex2;
    Vertex<Integer> vertex3;
    Vertex<Integer> vertex4;
    Vertex<Integer> vertex5;
    Vertex<Integer> vertex6;
    Vertex<Integer> vertex7;

    @Before
    public void init()
    {
        graph = new LinkedGraph();

        vertex1 = new Vertex<Integer>(1);
        vertex2 = new Vertex<Integer>(2);
        vertex3 = new Vertex<Integer>(3);
        vertex4 = new Vertex<Integer>(4);
        vertex5 = new Vertex<Integer>(5);
        vertex6 = new Vertex<Integer>(6);
        vertex7 = new Vertex<Integer>(7);

        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addVertex(vertex3);
        graph.addVertex(vertex4);
        graph.addVertex(vertex5);
        graph.addVertex(vertex6);
        graph.addVertex(vertex7);

        Edge.Builder EdgeBuilder = new Edge.Builder();

        vertex1.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex1).withVertexTo(vertex2).withEdgeNext(null).builder());
        vertex1.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex1).withVertexTo(vertex3).withEdgeNext(null).builder());

        vertex2.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex2).withVertexTo(vertex4).withEdgeNext(null).builder());
        vertex2.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex2).withVertexTo(vertex5).withEdgeNext(null).builder());

        vertex3.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex3).withVertexTo(vertex4).withEdgeNext(null).builder());
        vertex3.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex3).withVertexTo(vertex6).withEdgeNext(null).builder());

        vertex4.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex4).withVertexTo(vertex5).withEdgeNext(null).builder());
        vertex4.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex4).withVertexTo(vertex7).withEdgeNext(null).builder());

        vertex5.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex5).withVertexTo(vertex7).withEdgeNext(null).builder());

        vertex6.addEdge(EdgeBuilder.withIntWeight(0).withVertexFrom(vertex6).withVertexTo(vertex7).withEdgeNext(null).builder());
    }

    @Test
    public void BFSTest()
    {
        graph.BFS(vertex1);
    }

    @Test
    public void DFSTest()
    {
        graph.DFS(vertex1);
    }
}

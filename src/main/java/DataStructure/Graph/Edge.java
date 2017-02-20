package DataStructure.Graph;

/**
 * Created by myrao_000 on 2017-02-16.
 */
public class Edge<T> {
    private int intWeight;

    private Edge<T> edgeNext;

    private Vertex<T> vertexFrom;
    private Vertex<T> vertexTo;

    private Edge(int intWeight, Edge<T> edgeNext, Vertex<T> vertexFrom, Vertex<T> vertexTo) {
        this.intWeight = intWeight;
        this.edgeNext = edgeNext;
        this.vertexFrom = vertexFrom;
        this.vertexTo = vertexTo;
    }

    public Edge<T> getEdgeNext() {
        return edgeNext;
    }

    public void setEdgeNext(Edge<T> edgeNext) {
        this.edgeNext = edgeNext;
    }

    public Vertex<T> getVertexFrom() {
        return vertexFrom;
    }

    public void setVertexFrom(Vertex<T> vertexFrom) {
        this.vertexFrom = vertexFrom;
    }

    public Vertex<T> getVertexTo() {
        return vertexTo;
    }

    public void setVertexTo(Vertex<T> vertexTo) {
        this.vertexTo = vertexTo;
    }

    public int getIntWeight() {
        return intWeight;
    }

    public void setIntWeight(int intWeight) {
        this.intWeight = intWeight;
    }

    public static class Builder<T>
    {
        private int intWeight;

        private Edge<T> edgeNext;

        private Vertex<T> vertexFrom;
        private Vertex<T> vertexTo;

        public Builder()
        {
            this.intWeight = 0;
            this.edgeNext = null;
            this.vertexFrom = null;
            this.vertexTo = null;
        }

        public Builder<T> withIntWeight(int intWeight)
        {
            this.intWeight = intWeight;
            return this;
        }

        public Builder<T> withEdgeNext(Edge<T> edgeNext)
        {
            this.edgeNext = edgeNext;
            return this;
        }

        public Builder<T> withVertexFrom(Vertex<T> vertexFrom)
        {
            this.vertexFrom = vertexFrom;
            return this;
        }

        public Builder<T> withVertexTo(Vertex<T> vertexTo)
        {
            this.vertexTo = vertexTo;
            return this;
        }

        public Edge<T> builder()
        {
            if(this.vertexFrom == null || this.vertexTo == null)
                throw new IllegalStateException("Argument is not enough");

            return new Edge<T>(this.intWeight, this.edgeNext, this.vertexFrom, this.vertexTo);
        }
    }
}

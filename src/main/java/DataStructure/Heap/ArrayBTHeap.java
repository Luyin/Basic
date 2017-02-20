package DataStructure.Heap;

/**
 * Created by myrao_000 on 2017-02-17.
 */
public class ArrayBTHeap {
    private int[] nodes;
    private int intLastIndex;

    public ArrayBTHeap()
    {
        this.nodes = null;
        this.intLastIndex = -1;
    }

    public int getSizeOfArrayOfLevel(int Level) {
        if (Level == 0) {
            return 1;
        } else {
            int result = 1;
            while(Level > 0)
            {
                result = 2*result;
                Level--;
            }
            return result;
        }
    }

    public int getNodesLevel()
    {
        int Level = 0;
        int SizeofSumOfArrayOfLevel = getSizeOfArrayOfLevel(0);
        while(nodes.length != SizeofSumOfArrayOfLevel)
        {
            SizeofSumOfArrayOfLevel = (++Level);
        }
        return Level;
    }

    public int getParentNodeIndex(int NodeIndex)
    {
        if((NodeIndex % 2) == 1)
        {
            return NodeIndex/2;
        }
        else
        {
            if(NodeIndex > 1)
            {
                return NodeIndex/2 - 1;
            }
            else
            {
                return 0;
            }

        }
    }

    public void addNode(int data)
    {
        if(nodes == null)
        {
            this.nodes = new int[1];
            this.nodes[++intLastIndex] = data;
        }
        else
        {
            // 1. get in to deep node

            // Level 0 = 1
            // Level 1 = 2*n 개 만큼 데이터가 존재 한다.

            // 빈자리가 없을 경우, 배열 크기를 늘인다.
            if((++intLastIndex) >= nodes.length)
            {
                int currentNodesLevel = getNodesLevel();
                int newNodesSize = nodes.length + getSizeOfArrayOfLevel(currentNodesLevel+1);
                int[] nodeTemp = new int[newNodesSize];

                System.arraycopy(nodes,0, nodeTemp, 0, nodes.length);

                nodeTemp[intLastIndex] = data;

                // 2. add node to deepest node
                nodes = nodeTemp;
            }
            else
            {
                // 2. add node to deepest node
                nodes[intLastIndex] = data;
            }


            // 배열 인덱스로 부터 부모 노드 인덱스를 찾는다.
            int parentNodeIndex= getParentNodeIndex(intLastIndex);
            int newNodeIndex = intLastIndex;

            // 3. compare to parent node
            while(nodes[parentNodeIndex] > nodes[newNodeIndex])
            {
                //Swap
                swap(parentNodeIndex, newNodeIndex);

                if(parentNodeIndex == 0)
                    break;

                newNodeIndex = parentNodeIndex;
                parentNodeIndex = getParentNodeIndex(parentNodeIndex);
            }
        }
    }

    public int removeNode()
    {
        int data = nodes[0];

        nodes[0] = nodes[intLastIndex--];

        int intPosition = 0;

        while(true)
        {
            int firstChildIndex = intPosition*2 +1;
            int secondChildIndex = firstChildIndex + 1;

            if(firstChildIndex > intLastIndex && secondChildIndex > intLastIndex)
                break;

            if(secondChildIndex > intLastIndex)
            {
                if(nodes[intPosition] > nodes[firstChildIndex])
                {
                    swap(intPosition, firstChildIndex);
                    intPosition = firstChildIndex;
                }
                else
                {
                    break;
                }
            }
            else
            {
                //중복데이터는 고려하지 않는다.
                if(nodes[firstChildIndex] > nodes[secondChildIndex])
                {
                    if(nodes[intPosition] > nodes[secondChildIndex])
                    {
                        swap(secondChildIndex, intPosition);
                        intPosition = secondChildIndex;
                    }
                }
                else
                {
                    if(nodes[intPosition] > nodes[firstChildIndex])
                    {
                        swap(firstChildIndex, intPosition);
                        intPosition = firstChildIndex;
                    }
                }
            }
        }

        return data;
    }

    private void  swap(int index1, int index2)
    {
        int temp = nodes[index1];
        nodes[index1] = nodes[index2];
        nodes[index2] = temp;
    }

    public void printHeap()
    {
        for(int i=0; i<intLastIndex+1; i++)
        {
            System.out.print(nodes[i] + " ");
        }
    }
}

class Node {
    static int MAX_COUNT = 2; // ����� �ִ� ũ��
    static int MIN_COUNT = MAX_COUNT/2; // ����� �ּ� ũ��

    int count;       // ��忡 ����ִ� �������� ��
    int[] data;      // ������ ���
    Node parent;     // �θ� ��忡 ���� ����
    Node[] child;    // �ڽ� ��忡 ���� ����

    Node() {
        data = new int[MAX_COUNT + 1];   // �����÷ο츦 �ӽ÷� ����� �� �ֵ��� +1
        child = new Node[MAX_COUNT + 2];
    }

    boolean isLeaf() {
        return this.child[0] == null;
    }

    boolean isNotFull() {
        return this.count < MAX_COUNT;
    }

    boolean isOverHalfFull() {
        return this.count > MIN_COUNT;
    }

    boolean overflow() {
        return this.count == MAX_COUNT + 1;
    }

    int findChildIndex(int value) {
        for (int i = 0; i < this.count; ++i)
            if (value < this.data[i]) return i;
        return this.count;
    }

    int findChildIndex(Node childNode) {
        for (int i = 0; i < this.count + 1; ++i)
            if (childNode == this.child[i]) return i;
        return -1;
    }

    void remove(int value) {
        int index = findChildIndex(value);
        ArrayUtils.removeAt(data, index);
        ArrayUtils.removeAt(child, index + 1);
        --this.count;
    }

    void removeAt(int dataIndex, int childIndex) {
        ArrayUtils.removeAt(data, dataIndex);
        ArrayUtils.removeAt(child, childIndex);
        --this.count;
    }

    void prepand(int value, Node leftChild) {
        ArrayUtils.insertAt(data, 0, value);
        ArrayUtils.insertAt(child, 0, leftChild);
        if (leftChild != null) leftChild.parent = this;
        ++this.count;
    }

    void insert(int value, Node rightChild) {
        int index = this.findChildIndex(value);
        ArrayUtils.insertAt(data, index, value);
        ArrayUtils.insertAt(child, index + 1, rightChild);
        if (rightChild != null) rightChild.parent = this;
        ++this.count;
    }
}

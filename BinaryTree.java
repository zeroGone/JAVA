/*����Ʈ�� ����*/
public class Main {

	static class Node{//��� Ŭ���� ����
		int value;
		Node leftNode;
		Node rightNode;

		public Node(int value) {//������
			this.value=value;
		}

		public void add(int value) {//��� �߰� �޼ҵ� add
			if(this.value>value) {//�������� value�� �Ķ���� value�� �� ��
				if(this.leftNode!=null) this.leftNode.add(value);//�Ķ���� value�� ������ �����ڽĳ�� ���������˻� �ڽ��� ������ �����ڽĳ���� add���ȣ��
				else this.leftNode=new Node(value);	//������ �������� �߰�
			}else if(this.value<value){//�Ķ���� value�� ũ��
				if(this.rightNode!=null) this.rightNode.add(value);//�������ڽĳ�� ���������˻� �ڽ��� ������ �����ʳ���� add���ȣ�� 
				else this.rightNode=new Node(value);//������ �������� �߰�
			}
		}

		public void print() {//����� ���� ����ϴ� �޼ҵ�
			if(this.leftNode!=null) this.leftNode.print();//���� ������ ����ϱ� ���� �����ڽ��̾����� �����ڽ��� ���ȣ��
			System.out.print(this.value+" ");//������ �ڽĺ��� �����尪�� �۱� ������ ���簪���
			if(this.rightNode!=null) this.rightNode.print();//������ �ڽ��� ������ �������ڽ� ���ȣ��
		}

		public boolean search(int value) {//�Ķ���ͷ� ������� ���� ����Ʈ���� �����ϰ� �ִ��� ã�� �޼ҵ�
			//�������� �������� ���� ������ return
			if(this.value==value) return true;
			//�ĸ����Ͱ��� ���� ũ�� �ڽ����������� ���� ���ȣ��
			if(this.value>value) {
				if(this.leftNode!=null) return this.leftNode.search(value);
			}else
				if(this.rightNode!=null) return this.rightNode.search(value);
			//������ false����
			return false;	
		}

		public void remove(int value,Node parent) {//�Ķ������ ���� �����ϴ� �޼ҵ� ���� ��尡 ������ ����� ��츦 ���� parent ��带 �Ķ���Ͱ����� �޴´�
			//������ �Ķ���� ���� ã�� ���� �̵����� �Ѵ�.
			if(this.value<value) {
				if(this.rightNode!=null) 
					 this.rightNode.remove(value, this);
			}
			else if(this.value>value) {
				if(this.leftNode!=null)
					this.leftNode.remove(value, this);
			} 
			else {//���� ã�Ҵٸ� ������ ������
				if(this.leftNode!=null&&this.rightNode!=null) {//�ڽ��� �Ѵ� �������
					int mostValue=this.leftNode.getmostvalueleftChild().value;//�����ڽĳ���� ����Ʈ���� ���� ū���� �޾ƿ�
					this.value=mostValue;//���� ����� ���� �޾ƿ� ū������ �ʱ�ȭ�ϰ�
					this.leftNode.remove(mostValue, this);//���ʳ����� �� ���� ������ �ٽ� �����Ѵ�
				}else {//�ڽ��� �ϳ� �ְų� �ϳ��� �������
					Node child = null;//�ӽ� ��� ����
					//�ڽ��� �ϳ��� ������ �ڽ��� �ӽó�忡 �ڽ����� �ʱ�ȭ
					if(this.leftNode!=null) child=this.leftNode;
					else if(this.rightNode!=null) child=this.rightNode;
					//�ӽó��� �θ��带 �̾��־ ����� ������ �Ϸ��Ų��.
					if(this==parent.leftNode) parent.leftNode=child;
					else if(this==parent.rightNode) parent.rightNode=child; 
				}
			}
		}

		public void remove_fix(int value) {//��Ʈ��嵵 ������ ���� �޼ҵ�
			Node reserve=new Node(Integer.MAX_VALUE);
			Node temp=this;
			reserve.leftNode=this;
			this.remove(value, reserve);
			if(reserve.leftNode!=this) temp=reserve.leftNode; 
		}

		private Node getmostvalueleftChild() {
			//�������� �����ʳ�尡 ���� �� �θ� ����
			if(this.rightNode==null) return this;
			return this.rightNode.getmostvalueleftChild();
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 18, 1, 12, 7, 2, 14, 6, 9, 15};
		Node root = new Node(10);
		for (int i = 0; i < a.length; ++i)
			root.add(a[i]);
		root.remove_fix(10);
		root.print();
		System.out.println();
	}
}
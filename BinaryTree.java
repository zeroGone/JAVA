/*이진트리 구현*/
public class Main {

	static class Node{//노드 클래스 구현
		int value;
		Node leftNode;
		Node rightNode;

		public Node(int value) {//생성자
			this.value=value;
		}

		public void add(int value) {//노드 추가 메소드 add
			if(this.value>value) {//현재노드의 value와 파라미터 value의 값 비교
				if(this.leftNode!=null) this.leftNode.add(value);//파라미터 value가 작으면 왼쪽자식노드 존재유무검사 자식이 있으면 왼쪽자식노드의 add재귀호출
				else this.leftNode=new Node(value);	//없으면 노드생성후 추가
			}else if(this.value<value){//파라미터 value가 크면
				if(this.rightNode!=null) this.rightNode.add(value);//오른쪽자식노드 존재유무검사 자식이 있으면 오른쪽노드의 add재귀호출 
				else this.rightNode=new Node(value);//없으면 노드생성후 추가
			}
		}

		public void print() {//노드의 값들 출력하는 메소드
			if(this.leftNode!=null) this.leftNode.print();//작은 값부터 출력하기 위해 왼쪽자식이없으면 왼쪽자식을 재귀호출
			System.out.print(this.value+" ");//오른쪽 자식보다 현재노드값이 작기 때문에 현재값출력
			if(this.rightNode!=null) this.rightNode.print();//오른쪽 자식이 있으면 오른쪽자식 재귀호출
		}

		public boolean search(int value) {//파라미터로 가지고온 값을 이진트리가 포함하고 있는지 찾는 메소드
			//종료조건 현재노드의 값과 맡으면 return
			if(this.value==value) return true;
			//파리미터값과 비교해 크면 자식존재유무에 따라 재귀호출
			if(this.value>value) {
				if(this.leftNode!=null) return this.leftNode.search(value);
			}else
				if(this.rightNode!=null) return this.rightNode.search(value);
			//없으면 false리턴
			return false;	
		}

		public void remove(int value,Node parent) {//파라미터의 값을 삭제하는 메소드 현재 노드가 삭제할 대상일 경우를 위해 parent 노드를 파라미터값으로 받는다
			//삭제할 파라미터 값을 찾기 위한 이동부터 한다.
			if(this.value<value) {
				if(this.rightNode!=null) 
					 this.rightNode.remove(value, this);
			}
			else if(this.value>value) {
				if(this.leftNode!=null)
					this.leftNode.remove(value, this);
			} 
			else {//값을 찾았다면 삭제를 진행함
				if(this.leftNode!=null&&this.rightNode!=null) {//자식이 둘다 있을경우
					int mostValue=this.leftNode.getmostvalueleftChild().value;//왼쪽자식노드의 서브트리에 가장 큰값으 받아옴
					this.value=mostValue;//현재 노드의 값을 받아온 큰값으로 초기화하고
					this.leftNode.remove(mostValue, this);//왼쪽노드부터 그 값의 삭제를 다시 진행한다
				}else {//자식이 하나 있거나 하나도 없을경우
					Node child = null;//임시 노드 생성
					//자식이 하나라도 있으면 자식을 임시노드에 자식으로 초기화
					if(this.leftNode!=null) child=this.leftNode;
					else if(this.rightNode!=null) child=this.rightNode;
					//임시노드와 부모노드를 이어주어서 노드의 삭제를 완료시킨다.
					if(this==parent.leftNode) parent.leftNode=child;
					else if(this==parent.rightNode) parent.rightNode=child; 
				}
			}
		}

		public void remove_fix(int value) {//루트노드도 삭제를 위한 메소드
			Node reserve=new Node(Integer.MAX_VALUE);
			Node temp=this;
			reserve.leftNode=this;
			this.remove(value, reserve);
			if(reserve.leftNode!=this) temp=reserve.leftNode; 
		}

		private Node getmostvalueleftChild() {
			//종료조건 오른쪽노드가 없을 시 부모를 리턴
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
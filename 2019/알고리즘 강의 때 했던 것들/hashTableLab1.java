import java.util.Arrays;

/* 해시테이블 구현 실습
 * remove 구현
 * int형 배열
 * 충돌이 일어났을 경우 
 * 그 다음 인덱스에 저장
 * */


public class Main {

    static class HashTable {

        static final int EMPTY = 0;
        static final int REMOVE = -1;
        static final int SIZE = 37;
        int[] a;

        public HashTable() {
            a = new int[SIZE];
        }

        public void add(int value) throws Exception {
            int startIndex = value % SIZE; // 저장할 위치 계산
            int count = 0;                 // 충돌 횟수
            do {
                int index = (startIndex + count) % SIZE; // 저장할 위치 계산
                if (a[index] == EMPTY||a[index]==REMOVE) { // 삭제되었거나 빈칸이면
                    a[index] = value;                    // 저장하고 리턴
                    return;
                } else if (a[index] == value) return; // 이미 그 값이 들어있으면 그냥 리턴
                ++count;                     // 여기까지 왔으면, 충돌이 일어난 상황. 충돌 횟수 증가
            } while (count < a.length);      // 충돌 횟수가 배열의 크기보다 크거나 같으면 작업 실패
            throw new Exception("공간 부족");
        }

        public void remove(int value) throws Exception {
        	int startIndex=value%SIZE;//찾는 값의 해시값을 찾음
        	int count = 0;//충돌 횟수
        	do {
                int index = (startIndex + count) % SIZE; // 삭제할 위치 계산
                if (a[index] == value) {//삭제할 값 찾았으면  
                	a[index]=REMOVE;//삭제 하고 
                	return; // 리턴
                }
                ++count;//삭제할 값 못찾았으면 다음 인덱스 찾기위해 충돌 증가            
            } while (count < a.length);      // 충돌 횟수가 배열의 크기보다 크거나 같으면 작업 실패
        	 throw new Exception("삭제할 값 없음");
        }

        public boolean contains(int value) {
            int startIndex = value % SIZE; // 저장할 위치 계산
            int count = 0;                 // 충돌 횟수
            do {
                int index = (startIndex + count) % SIZE; // 저장할 위치 계산
                if (a[index] == EMPTY||a[index]==REMOVE) return false;      // 빈 칸이면 그 값이 해시 테이블에 없음.
                else if (a[index] == value) return true;  // 찾았음.
                ++count;                  // 여기까지 왔으면, 충돌이 일어난 상황. 충돌 횟수 증가
            } while (count < a.length);   // 충돌 횟수가 배열의 크기보다 크거나 같으면 작업 실패
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        int maxValue = 200, maxCount = 10;
        HashTable hashTable = new HashTable();

        int[] data = { 4, 13, 144, 7, 9, 11, 44, 115, 107, 196 };
        for (int i = 0; i < data.length; ++i)
            hashTable.add(data[i]);

        for (int i = 1;  i <= maxValue; ++i)
            if (hashTable.contains(i)) System.out.println(i);
        
    }
}

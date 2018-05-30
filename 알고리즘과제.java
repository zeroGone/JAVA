/* �˰��� ����
 * �ܾ��� ���� Ƚ���� ���� ��
 * 1.�� �ܾ� �� �߷�
 * 2.���� Ƚ�� ���� �ܾ� 10�� ���
 * ���ǻ���:��ҹ��� ����X
 * ����1:HashMap �̿�
 * ����2:WordInfo Ŭ���� , ArrayList<WordInfo> Ŭ���� �̿�, ���� Ž��
 * ����3:���� 2�� ���� Ŭ���� �̿�, ���� Ž��
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
	private static String file = new String("C:\\Users\\pc\\Desktop\\�˰���\\shakespeare.txt");
	private static HashMap<String,Integer> map = new HashMap<String,Integer>();
	private static ArrayList<WordInfo> list = new ArrayList<WordInfo>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String word;
		while((word=getWord(reader))!=null) {//���� �ܾ ���������� �ݺ�
			word=word.toUpperCase();//��ҹ��� ����̾����Ƿ� �빮�ڷ� ����
			mapSet(word);//�ʿ� �����ϰ�
			listSet(word);//����Ʈ�� �����Ѵ�
		}

		System.out.println(map.size());//�ؽ����� �̿��Ͽ� �� �ܾ� �� ���
		mapPrint();
		System.out.println(list.size());
		listPrint();
	}
	
	private static String getWord(Reader reader) throws IOException {
		int data;
		StringBuilder builder = new StringBuilder();
		while((data=reader.read())!=-1) {
			if(Character.isAlphabetic(data)) builder.append((char)data);
			else if(builder.length()>0) return builder.toString();
		}
		return null;
	}
	
	//�ؽ��ʿ� �ܾ ����
	private static void mapSet(String word) {//�Ķ���ͷ� �ܾ �ް�
		//�ܾ �ؽ��ʿ� �����ϸ� �� �ܾ��� ������� 1���� ��Ű�� �ٽ� �����Ѵ�
		if(map.containsKey(word)) map.put(word,(int)map.get(word)+1);
		else map.put(word, 1);//�������� �ʴ´ٸ� �׳� ����
	}
	
	//����Ʈ�� �ܾ ����
	private static void listSet(String word) {
		WordInfo temp = new WordInfo(word);//�Ķ���ͷ� ���� ���ڿ��� WordInfo��ü�� ����
		if(binarySearch(temp,0,list.size()-1)) list.get(list.indexOf(temp)).count++;//���� �ܾ ����Ʈ�� ������ ����� 1���� ��Ŵ
		else listAdd(temp);
	}
	
	//����Ʈ�� �߰��ϴ� �޼ҵ�
	private static void listAdd(WordInfo value) {
		int index=0;//�ε��� ����
		
		while(index<list.size()) {//����Ʈ �ϳ��ϳ� �˻�
			if(list.get(index).compareTo(value)<0) break;//�����ϸ鼭 ������ ���� ���ǹ�
			else index++;
		}
		
		list.add(index,value);
	}

	//�ܾ ����Ʈ�� ���ԵǾ����� ����Ž������ ã�� �޼ҵ�
	private static boolean linearSearch(WordInfo wi) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(wi)) return true;//���� �ܾ ������ true ����
		}
		return false;//������ false;
	}
	
	//�ܾ ����Ʈ�� ���ԵǾ��ִ��� ����Ž������ ã�� �޼ҵ�
	private static boolean binarySearch(WordInfo value,int start,int end) {
		if(start>end) return false;
		int index=(start+end)/2;
		
		if(list.get(index).equals(value)) return true;
		else if(list.get(index).compareTo(value)>0) return binarySearch(value,start,index-1);
		else return binarySearch(value,index+1,end);
			
		/*
		int start=0;
		int end=list.size()-1;
		while(start<=end) {
			int index=(end+start)/2;
			if(list.get(index).equals(value)) return true;
			else if(list.get(index).compareTo(value)>0) end=index-1;
			else start=index+1;
		}
		return false;*/
	}
	
	private static void mapPrint(){
		Iterator itr=map.keySet().iterator();//���� ��� Ű���� ���ͷ����ͷ� ����
		String[] max=new String[10];//���� ���� ���ڵ��� �����ϱ� ���� ���ڿ� �迭
		
		for(int i=0; i<max.length; i++) {//ó�� ������ ���� 10���� �ʱ�ȭ
			max[i]=(String)itr.next();
		}
		
		while(itr.hasNext()) {
			String temp =(String)itr.next();
			for(int i=0; i<max.length; i++) {
				if(map.get(max[i])<map.get(temp)) {
					for(int j=max.length-1; j>i; j--) {
						max[j]=max[j-1];
					}
					max[i]=temp;
					break;
				}
			}
		}
		
		for(int i=0;i<max.length; i++) {//���
			System.out.println(i+1+"��°�� ���� ���� �ܾ�:"+max[i]+" Ƚ��:"+map.get(max[i]));
		}
	}
	
	private static void listPrint() {
		Iterator itr = list.iterator();
		
		WordInfo[] max=new WordInfo[10];//���� ���� ���ڵ��� �����ϱ� ���� ���ڿ� �迭
		for(int i=0; i<max.length; i++) {
			max[i]=(WordInfo)itr.next();
		}
		while(itr.hasNext()) {
			WordInfo temp=(WordInfo)itr.next();
			for(int i=0; i<max.length; i++) {
				if(max[i].count<temp.count) {
					for(int j=max.length-1; j>i; j--) {
						max[j]=max[j-1];
					}
					max[i]=temp;
					break;
				}
			}
		}
		
		for(int i=0;i<max.length; i++) {//���
			System.out.println(i+1+"��°�� ���� ���� �ܾ�:"+max[i].word+" Ƚ��:"+list.get(list.indexOf(max[i])).count);
		}
	}
}

class WordInfo { 
	String word; 
	int count; 
	public WordInfo(String word) { 
		this.word = word; 
		this.count = 1; 
	}
	
	@Override
	public boolean equals(Object e) {
		WordInfo obj=(WordInfo)e;
		if(this.word.equals(obj.word)) return true;
		else return false;
	}
	
	public int compareTo(WordInfo value) {
		if(this.word.compareTo(value.word)<0) return 1;
		else return -1;
	}
	
}

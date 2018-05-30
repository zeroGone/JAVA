/* 알고리즘 과제
 * 단어의 출현 횟수를 세는 것
 * 1.총 단어 수 추력
 * 2.출현 횟수 높은 단어 10개 출력
 * 주의사항:대소문자 구별X
 * 구현1:HashMap 이용
 * 구현2:WordInfo 클래스 , ArrayList<WordInfo> 클래스 이용, 선형 탐색
 * 구현3:구현 2와 같은 클래스 이용, 이진 탐색
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
	private static String file = new String("C:\\Users\\pc\\Desktop\\알고리즘\\shakespeare.txt");
	private static HashMap<String,Integer> map = new HashMap<String,Integer>();
	private static ArrayList<WordInfo> list = new ArrayList<WordInfo>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String word;
		while((word=getWord(reader))!=null) {//읽을 단어가 없을때까지 반복
			word=word.toUpperCase();//대소문자 상관이없으므로 대문자로 통일
			mapSet(word);//맵에 삽입하고
			listSet(word);//리스트에 삽입한다
		}

		System.out.println(map.size());//해쉬맵을 이용하여 총 단어 수 출력
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
	
	//해쉬맵에 단어를 삽입
	private static void mapSet(String word) {//파라미터로 단어를 받고
		//단어가 해쉬맵에 존재하면 그 단어의 밸류값을 1증가 시키고 다시 삽입한다
		if(map.containsKey(word)) map.put(word,(int)map.get(word)+1);
		else map.put(word, 1);//존재하지 않는다면 그냥 삽입
	}
	
	//리스트에 단어를 삽입
	private static void listSet(String word) {
		WordInfo temp = new WordInfo(word);//파라미터로 받은 문자열을 WordInfo객체로 생성
		if(binarySearch(temp,0,list.size()-1)) list.get(list.indexOf(temp)).count++;//받은 단어가 리스트에 있으면 밸류값 1증가 시킴
		else listAdd(temp);
	}
	
	//리스트에 추가하는 메소드
	private static void listAdd(WordInfo value) {
		int index=0;//인덱스 변수
		
		while(index<list.size()) {//리스트 하나하나 검사
			if(list.get(index).compareTo(value)<0) break;//정렬하면서 나가기 위한 조건문
			else index++;
		}
		
		list.add(index,value);
	}

	//단어가 리스트에 포함되었는지 선형탐색으로 찾는 메소드
	private static boolean linearSearch(WordInfo wi) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(wi)) return true;//같은 단어가 있으면 true 리턴
		}
		return false;//없으면 false;
	}
	
	//단어가 리스트에 포함되어있는지 이진탐색으로 찾는 메소드
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
		Iterator itr=map.keySet().iterator();//맵의 모든 키들을 이터레이터로 받음
		String[] max=new String[10];//많이 나온 문자들을 저장하기 위한 문자열 배열
		
		for(int i=0; i<max.length; i++) {//처음 나오는 문자 10개로 초기화
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
		
		for(int i=0;i<max.length; i++) {//출력
			System.out.println(i+1+"번째로 많이 나온 단어:"+max[i]+" 횟수:"+map.get(max[i]));
		}
	}
	
	private static void listPrint() {
		Iterator itr = list.iterator();
		
		WordInfo[] max=new WordInfo[10];//많이 나온 문자들을 저장하기 위한 문자열 배열
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
		
		for(int i=0;i<max.length; i++) {//출력
			System.out.println(i+1+"번째로 많이 나온 단어:"+max[i].word+" 횟수:"+list.get(list.indexOf(max[i])).count);
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

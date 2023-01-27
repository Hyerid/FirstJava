package practice;

public class IntStack {
    private int[] stk;           // 스택용 배열
    private int capacity;        // 스택의 크기
    private int ptr;             // 스택 포인터

    //--- 실행시 예외: 스택이 비어있음  , 내부클래스로 사용자 정의 예외클래스 정의//
   

    //--- 실행시 예외: 스택이 가득 참 , 내부클래스로 사용자 정의 예외클래스 정의---//
     

    //--- 생성자(constructor) ---//
    public IntStack(int maxlen) {
    	ptr = 0;
    	capacity =maxlen;
    	try {
    		stk = new int[capacity];
    	}catch(OutOfMemoryError e){
    		capacity=0;
    	}
    }

    
    //--- 스택에 x를 푸시 ---//
    public int push(int x) throws OverflowIntStackException {//예외가 발생한 경우, 예외처리를 호출한 상위 메서드에 떠넘김
       if(ptr>capacity) {
    	   throw new OverflowIntStakException();
       }
       return stk[ptr++] = x;
    }

    //--- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
    public int pop() throws EmptyIntStackException {
         if(ptr <= 0) {
        	 throw new EmptyIntStackException;
         }
         return stk[--ptr];
    }

    //--- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
    public int peek() throws EmptyIntStackException {
         if(ptr <=0) {
//        	 thro~~~
        	 return stk[ptr -1];
         }
    }

    //--- 스택을 비움 ---//
    public void clear() {
        
    }
    //--- 스택구조로 사용하는 배열에서 파라미터로 전달된 정수x를 찾아  저장된 위치값 배열인덱스(없으면 –1)를 반환 ---//
    public int indexOf(int x) {
      
    }

    //--- 스택의 크기를 반환 (stack배열의 초기화된 크기, 데이터 저장 가능한 용량) ---//
    public int getCapacity() { 
      
    }

    //--- 스택에 쌓여있는(저장된) 데이터 갯수를 반환 ---//
    public int size() {
       
    }
    //--- 스택이 비어있는가? ---//
    public boolean isEmpty() {
       
    }

    //--- 스택이 가득 찼는가? ---//
    public boolean isFull() {
        
    }

    //--- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
    public void dump() {
     
    }
}
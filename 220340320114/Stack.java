class Stack{
		private int max;
		private long[] s1;
		private int top;
		Stack{int s}{
			top=-1;
			max=s;
			s1=newlong[max];
		}
		public void push(long x){
			s1[++top]=x;
		}
		public long pop(){
			return s1[top--];
		}
		public long peek(){
			return s1[top];
		}
		public bollean isEmpty(){
			return (top == -1);
		}
		public boolean isFull(){
			return top>=(max-1);
		}
		public void display(){
			for(int i=0;i<topii++){
				System.out.pritnln(s1[i]);
			}
		}
	public static void main(String args[]){
	    Stack s1=new Stack();
		Stack s2=new Stack();
	}
}
package StackOdev;

public class Stack {
	int size;
	int top;
	int[] veriler;
	int [] tempVeriler;
	int [] tempVeriler2;
	
	Stack(int sizeP){
		this.size=sizeP;
		this.top=-1;
		veriler=new int[size];
	}
	
	void push(int data) {
		if(isFull()) {
			System.out.println("Stack dolu!");
		}
		else {
			this.top++;
			this.veriler[this.top]=data;
		}
	}
	
	
	public int popViaIndex(int ındex) {
		if(this.top==-1) {
			System.out.println("Stack Bos!");
			return -1;
		}
		else {
			
			this.top=ındex-1;
			return this.veriler[ındex];
		}
	}
	
	void reset() {
		this.top=-1;
	}
	public void swap() {
		if(top<1) {
			return;
		}
		int temp=veriler[0];
		veriler[0]=veriler[top];
		veriler[top]=temp;
	}
	
	public int popViaIndex2(int ındex) {
		if(this.top==-1) {
			System.out.println("Stack Bos!");
			return -1;
		}
		else {
			int cıkarılan=veriler[ındex];
			int top2=top;
			this.top=ındex-1;
			tempVeriler=new int[top2-ındex];
			int t=ındex+1;
			for(int p=0;p<top2-ındex;p++) {
				tempVeriler[p]=veriler[t];
				t++;
			}
			for(int k=0;k<top2-ındex;k++) {
				push(tempVeriler[k]);
			}
			
			System.out.print("CIKAN ELEMAN: "+cıkarılan);
			System.out.println();
			return this.veriler[ındex];
			
		}
	}
	
	public int wantedPop(int say) {
		if(this.top==-1) {
			System.out.println("Stack Bos!");
			return -1;
		}
		int top3=top;
		int sira=0;
		for(int m=top;m>-1;m--) {
			if(veriler[m]==say) {
				this.top=m-1;
				int cıkarılan=veriler[m];
				System.out.print("CIKAN ELEMAN: "+cıkarılan);
				System.out.println();
			}
			else 
				sira++;
			
		}
		int sayacc=sayac(say);
		//top3--;
		tempVeriler2=new int[top3-sayacc];
		int f=sayacc+1;
		for(int b=0;b<top3-sayacc;b++) {
			tempVeriler2[b]=veriler[f];
			f++;
		}
		for(int n=0;n<top3-sayacc;n++) {
			push(tempVeriler2[n]);
		}
		return this.veriler[sira];

	}

	public int sayac(int say) {
		int sayac=0;
		for(int z=top;z>-1;z--) {
			if(veriler[z]==say) {
				
			}
			else {
				sayac++;
			}
		}		
		return sayac;
	}
		
	void print() {
		if(isEmpty()) {
			System.out.println("Stack Bos!");
		}
		else {
			for(int i=this.top;i>-1;i--) {
				System.out.print(veriler[i]+" ");
			}
		}
			
	}
	
	boolean isFull() {
		if(this.top==(this.size-1))
			return true;
		else 
			return false;
		
	}
	
	boolean isEmpty() {
		if(this.top==-1) 
			return true;
		else 
			return false;
	}
	

}
//stack mantığında stackin boş olduğunu belirtmek için top -1 atanıyor ama stack aynı zamanda da bir array olduğu için ilk eleman eklendiğinde top 1 arttırılarak array[0] a atanmış oluyor

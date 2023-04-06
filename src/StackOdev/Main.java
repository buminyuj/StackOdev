package StackOdev;

public class Main {

	public static void main(String[] args) {
		Stack stackOrnek=new Stack(5);
		stackOrnek.push(17);
		stackOrnek.push(36);
		stackOrnek.push(47);
		stackOrnek.push(13);
		stackOrnek.push(55);
		stackOrnek.print();
		System.out.println();
		System.out.println("----------------");
		//stackOrnek.swap();
		//int cıkanEleman=stackOrnek.popViaIndex(2);  // en alttaki eleman 0. indis olacak şekilde çalışır
		//System.out.print("CIKAN ELEMAN: "+cıkanEleman);
		//System.out.println();
		//System.out.print("Yeni Stack: ");
		        //stackOrnek.popViaIndex2(4); 
		stackOrnek.wantedPop(55);
				System.out.print("Yeni Stack: ");
				stackOrnek.print();
				System.out.println();
				System.out.println("----------------");
				stackOrnek.wantedPop(36);
				System.out.print("Yeni Stack: ");
				
		stackOrnek.print();
		System.out.println();
		System.out.println("----------------");
		stackOrnek.swap();
		stackOrnek.print();

	}

}

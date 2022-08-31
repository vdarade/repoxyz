package program;

public class Demo4 {

	public static void main(String[] args) {
		//find duplicate elememnt in array
		int a[]= {30,50,20,30,20,10};
		int count;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}

	}

}

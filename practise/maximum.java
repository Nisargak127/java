package practise;

public class maximum {
	public  static int find(int num[]){
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++){
		    if(largest<num[i]){
		       largest=num[i];}
		}
		return largest;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={1,2,3,4,5,6,7,8,9};
		System.out.println("the maximum element is"+" "+find(num));
		
	}

}

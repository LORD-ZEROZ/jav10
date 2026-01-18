public class Operf{
	public void print(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j%2==0)
					System.out.print("#");
				else if(j%2!=0)
					System.out.print("@");
			}
			System.out.println();
		}
	}
	public double print(double a, double b){
		double diff = 0.5;
		double sum = 0.0;
		for(; a<=b; a+=0.5){
			sum += a;
		}
		return sum;
	}
	public int print(char ch1,char ch2){
		if(ch1>ch2)
			return (int)ch1;
		else
			return (int)ch2;
	}
	public static void main(String[] args){
		Operf Ov = new Operf();
		Ov.print();
		System.out.println(Ov.print(1.0, 4.0));
		System.out.println(Ov.print('a', 'A'));
	}
}
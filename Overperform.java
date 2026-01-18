class Overperform{
		void perform(int x[]){
			int len = x.length;
			int largest=x[0];
			for(int i =0; i<len; i++){
				if(x[i] > largest)
					largest = x[i];
			}
			System.out.println("The largest no is: "+largest);
		}
		void perform(String s, char ch){
			int len = s.length();
			if(ch == 'F'){
			String first_subs = s.substring(0,5);
			System.out.println("The first_subs is: "+first_subs);
		}
			else if(ch == 'L'){
			String last_subs = s.substring(len-5,len);
			System.out.println("The last_subs is: "+last_subs);
		}
		}
		void perform(int n){
			String s = Integer.toString(n);
			int len = s.length();
			int first_no = s.charAt(0)-'0';
			int last_no = s.charAt(len-1)-'0';
			System.out.println("The product is: "+ (first_no*last_no));
		}
		public static void main(String[] args){
			Overperform ov = new Overperform();
			int ar[] = {5,4,1,8,4,6,9};
			int n = 567534;
			String s = "JOHANJS";
			char ch = 'F';
			ov.perform(ar);
			ov.perform(s,ch);
			ov.perform(n);
		}
	}

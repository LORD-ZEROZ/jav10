public class CelestialBBsorting{
	public static void sorting(String[] bodies, int[] distance){
		int len = bodies.length;
		for(int i=0; i<len; i++){
			for(int j=i+1; j<len; j++){
				if(distance[i]>distance[j]){
					int temp = distance[i]; 
					distance[i] = distance[j];
					distance[j] = temp;
					String str = bodies[i];
					bodies[i] = bodies[j];
					bodies[j] = str;
				}
			}
		}
		for(int i=0; i<len; i++)
			System.out.print(bodies[i]+"\t");
		System.out.println();
		for(int i=0; i<len; i++)
			System.out.print(distance[i]+"\t");
	}
	public static void main(String[] args){
		String[] celestialbodies = {"Mars","Venus","Jupiter","Mercury"};
		int[] distance = {228,108,778,58};
		sorting(celestialbodies,distance);
	}
}

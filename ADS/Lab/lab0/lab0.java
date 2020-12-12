public class lab0{
	static int[] age;
	public static int [] resize(int length){
		int[] array = new int[length];

	for(int i=0; i<age.length; i++){
		array[i] = age[i];
		}
		array[length -1] =4;
		age = array;
		return age;
	}
	public static void main(String[] args){
		age = new int[3];
		age[0] = 23;
		age[1] = 12;
		age[2] = 17;
		int[] newage = resize(4);
		for(int i=0; i<newage.length; i++){
			System.out.println(newage[i]);
		}
	}

}
package ie.gmit.ch;

public class Challenge_2 {
	public static void main(String[] args) {
		int[] tower = {3,0,2,0,1,1};
		
		System.out.println(jumpable(tower));
	}
	
	public static boolean jumpable(int[] tower) {
		boolean canJump = false;
		int pos = 0;
		
		for (int i = 0; i < tower.length; i++) {
			pos += tower[i];
			
			System.out.println(tower[i]);
		}

		System.out.println(pos);
		return canJump;
	}
}

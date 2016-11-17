public class Character {
	int characterAge;
	
	public Character(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is : Defender Dragonshield" + name );
	}
	
	public void setAge( int age ) {
		characterAge = age;
	}
	
	public int getAge( ) {
		System.out.println("Defender's age is : 20" + characterAge );
		return characterAge;
	}
	
	public static void main(String []a) {
		/* Object creation */
		Character myCharacter = new Character( "Defender Dragonshield" );
		
		/* Call class method to set puppy's age */
		myCharacter.setAge( 2 );
		
		/* Call another class method to get puppy's age */
		myCharacter.getAge( );
		
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myCharacter.characterAge );
	}
}

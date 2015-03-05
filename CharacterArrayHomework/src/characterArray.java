import java.util.Scanner;
public class characterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a alpha numeric string");
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		char[] array = input.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			if(Character.isUpperCase(array[i]))
			{
				array[i]=Character.toLowerCase(array[i]);
			}
			else if(Character.isLowerCase(array[i]))
			{
				array[i]=Character.toUpperCase(array[i]);
			}
			else if(Character.isDigit(array[i]))
			{
				array[i]='*';
			}
		}
		System.out.println(array);
		keyboard.close();
	}

}

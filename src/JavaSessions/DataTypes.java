package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {

		//data types:
		//primitive data types: primitive means they will directly take the space in the memory the moment you declare them -  we don't need to create the object here 
		//Integer family: byte, short, long, int
		//floating family: double, float
		//character: char
		//boolean: true/false
		
		
		//1. byte
		//size: 8 bits = 1 byte
		//range: -128 to 127
		byte b = 10;//memory allocation
		b = 20;
		
		byte b1 = 0;
		byte b2 = -10;
		
		//2. short:
		//size: 16 bits = 2 bytes
		//range: -32768 to 32767
		short s = 10;
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2^31 to 2^32-1
		int i = 10;
		int i1 = -10;
		int i2 = 1000;
		int i3 = 0;
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: -2^63 to 2^63-1
		long phone = 80330034;
		long distance = 11233545;
		
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after point it can take up to 7 digits
		float f = 12.22f;
		float g = (float)23.45;
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: range: after point it can take up to 15 digits
		double d = 12.345666;
		double d1 = -23.123;
		double d2 = 100;//100.00
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		//7. char: only single digit value
		//size: 2 bytes = 16 bits
		char c = 'a';
		char c1 = '1';
		char c2 = '@';
		char gender = 'f';
		
		//8. boolean: 
		//size: ~ 1 bit
		boolean flag = false;
		boolean flag1 = true; 
	}

}

package JavaSessions;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		//There are two types of arrays: static array and dynamic array
		//Each array has the lowest index, the highest index and the length
		//ArrayOutOfBoundException -- we can't go beyond the size of array
		//We can't have negative indexing
		
		//What is the need of static array? when the data is always fixed, we use static array -- for example: number of days in a week, board of members...
		//What is the need of dynamic array? When the data is dynamic (changes frequently), we use dynamic array 

		//int Array
		//Limitations of static Array:
		//1. size is fixed: static array: to overcome this we should use ArrayList (collections)
		//2. similar data types you can be stored: to overcome this issue,  we can use Object Array (static in nature)
		//but we can use ArrayList<Object> - collection.
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//interview question: in Java can we go beyond the index in array?
		// No, in Java we can't go beyond the highest and the lowest index and the lowest index is always 0 - and can't use negative numbers
		
		int len = i.length;
		
		System.out.println("length is: " + len);
		
		System.out.println("highest index is: " + (len-1));
		
		System.out.println(i[0]);
		
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		
		//How to print all the values from array? use for loop
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}

		System.out.println("=======================");
		//for each loop:
		for(int e : i) {
			System.out.println(e);
		}
		
		System.out.println("=======================");
		//double array
		
		double d [] = new double[2];
		d[0] = 12.12;
		d[1] = 11.11;
		
		double length = d.length;
		System.out.println("length is: " + length);
		
		System.out.println(d[0]);
		
		System.out.println("=======================");
		for(int d1=0; d1<d.length; d1++) {
			System.out.println(d[d1]);
		}
		
		System.out.println("=======================");
		for(double d2 : d) {
			System.out.println(d2);
		}
		
		//char array:
		char c[] = new char[3];
		
		System.out.println("=======================");
		
		//string array;
		String lang[] = new String[3];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "Ruby";
		
		for(int j=0; j<lang.length; j++) {
			System.out.println(lang[j]);//arrayName: lang -- index:j
		}
		
		System.out.println("=======================");
		for(String p1 : lang) {
			System.out.println(p1);
		}
		
		
		System.out.println("=======================");
		//interview question: in which case we should not use array? when the data is dynamic - changes frequently
		//what can we use instead? instead we can use ArrayList or ObjectArray
		
		//Object Array -- static 
		Object ob[] = new Object[5];
		ob[0] = "Salar";
		ob[1] = 25;
		ob[2] = 'm';
		ob[3] = 12.12;
		ob[4] = true;
		
		for(Object e : ob) {
			System.out.println(e);
		}
		
		System.out.println("=======================");
		for(int obj=0; obj<ob.length; obj++) {
			System.out.println(ob[obj]);
		}
		
		System.out.println("=======================");
		//Practice
		System.out.println("PRACTICE PART");
		
		int num [] = new int [4];//int array
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		
		int len1 = num.length;
		System.out.println(len1);//length of array
		
		System.out.println(num[3]);//printing index 3
		
		for(int arr=0; arr<num.length; arr++) {
			System.out.println(num[arr]);//printing all the indexes values
		}
		
		for(int arra : num) {
			System.out.println(arra);//printing all the indexes values using for-each loop
		}
		
		System.out.println("=======================");
		String str[] = new String[3];//string array
		str[0] = "Medhi";
		str[1] = "Medho";
		str[2] = "Medha";
		
		for (int stri=0; stri<str.length; stri++) {//normal for loop
			System.out.println(str[stri]);
		}
		
		for(String strin : str) {//for-each loop
			System.out.println(strin);
		}
		
		System.out.println("=======================");
		Object obje[] = new Object[3];//different data types
		
		obje[0] = "Salar";
		obje[1] = 26;
		obje[2] = 'm';
		
		for(Object objec : obje) {
			System.out.println(objec);
		}
				
		
	}

}

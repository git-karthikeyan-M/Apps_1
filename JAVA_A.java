import java.util.*;



public class JAVA_A {

	public static void main(String[] args) {
		Integer[]arrays= {1,2,3,4,5,6,7};
		List<Integer>List=Arrays.asList(arrays);
		Collections.shuffle(List);
		List.toArray(arrays);
		System.out.println(Arrays.toString(arrays));
	}

}

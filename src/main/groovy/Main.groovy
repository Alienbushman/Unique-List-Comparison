import org.codehaus.groovy.runtime.NumberAwareComparator

final NumberAwareComparator<Comparable> COMPARABLE_NUMBER_AWARE_COMPARATOR = new NumberAwareComparator<>();
import java.util.Timer;

//conclusion, it is not superior due to the generic comparison, and when objects are not primitive types, then the isunique is needed
static void main(String[] args) {
	System.out.println("Hello world")
	ArrayList<Integer> testArr = GenearteList(3)

	long startTime = System.nanoTime()
	testArr.unique(false)

	long endTime = System.nanoTime()



	long durationOriginal = (endTime - startTime)

	startTime = System.nanoTime()

	unique(testArr)
	endTime = System.nanoTime()
	long durationNew = (endTime - startTime)

	println("Brute force ${durationOriginal}")
	println("HashSet ${durationNew}")
	println("Done")



}
static ArrayList<Integer> GenearteList(int zeros){
	ArrayList<Integer> testArr = new ArrayList<>()

	int counter = 1
	for (int i = 0; i < zeros; i++) {
		counter *= 10
	}
	for (int i = 0; i < counter; i++) {
		testArr.add(Math.random() * 10000 as Integer)
	}
	return testArr
}

static  <T> List<T> unique(List<T> list) {

	HashSet<T> uniqueSet = Collections.emptySet()
	for (int i = list.size() - 1; i > 0; i--) {
		T elem = list.get(i)
		if (uniqueSet.contains(elem))
			list.remove(i)
		else
			uniqueSet.add(elem)
	}
	return list
}
static void main(String[] args) {
    ArrayList<Integer> testArr = GenerateList(7)

    long startTime = System.nanoTime()
    testArr.unique(false)
    long endTime = System.nanoTime()

    long durationOriginal = (endTime - startTime)

    startTime = System.nanoTime()
    unique(testArr)
    endTime = System.nanoTime()

    long durationNew = (endTime - startTime)

    startTime = System.nanoTime()
    uniqueGeneric(testArr)
    endTime = System.nanoTime()

    long durationGeneric = (endTime - startTime)


    println("Brute force ${durationOriginal}")
    println("HashSet ${durationNew}")
    println("HashSet generic${durationGeneric}")
    println("Optemisation ${durationNew - durationOriginal}")
}

static ArrayList<Integer> GenerateList(int zeros) {
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

static <T> List<T> uniqueGeneric(List<T> list) {

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

static List<Integer> unique(List<Integer> list) {

    HashSet<Integer> uniqueSet = Collections.emptySet()
    for (int i = list.size() - 1; i > 0; i--) {
        int elem = list.get(i)
        if (uniqueSet.contains(elem))
            list.remove(i)
        else
            uniqueSet.add(elem)
    }
    return list
}

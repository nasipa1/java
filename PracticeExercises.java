import java.util.*;

public class PracticeExercises {
    public static void main(String[] args) {
        System.out.println("Array List Exercises: ");
        // 15
        System.out.println("1. Write a Java program to join two array lists:");
        List<String> a1 = new ArrayList<>();
        List<String> a2 = new ArrayList<>();
        a1.add("lalala");
        a1.add("lololo");
        a2.add("lelele");
        a2.add("lululu");
        System.out.println("Array list 1: " + a1);
        System.out.println("Array list 2: " + a2);

        for (String s : a2) {
            a1.add(s);
        }
        System.out.println(a1 + "\n");


        // 21
        System.out.println("2. Write a Java program to replace the second element of an ArrayList with the specified element:");
        System.out.println(a1);
        for (int i = 0; i < a1.size(); i++) {
            if (i == 1) {
                a1.set(i, "okay");
            }
        }
        System.out.println(a1 + "\n");


        // 13
        System.out.println("3. Write a Java program to compare two array lists:");
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add("lalala");
        l1.add("lololo");
        l1.add("lelele");
        l2.add("lilili");
        l2.add("lululu");
        l2.add("lelele");
        System.out.println("array list 1: " + l1);
        System.out.println("array list 2: " + l2);

        if (l1.equals(l2)) {
            System.out.println("The two array lists are the same.");
        } else {
            System.out.println("The two array lists are not the same.");
        }
        System.out.println("\n");

        // 17
        System.out.println("4. Write a Java program to empty an array list: ");
        System.out.println("before clearing: " + l1);
        l1.clear();
        System.out.println("after clearing: " + l1 + "\n");

        // 18
        System.out.println("5. Write a Java program to test whether an array list is empty or not: ");
        System.out.println("Array list: " + l1);

        if (l1.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list is not empty.");
        }
        System.out.println("\n");

        // 22
        System.out.println("6. Write a Java program to print all the elements of an ArrayList using the elements' position:");
        System.out.println("Array list: " + l2);

        for (int i = 0; i < l2.size(); i++) {
            System.out.println("Element at position " + i + ": " + l2.get(i));
        }
        System.out.println("\n");


        System.out.println("Linked List Exercises: ");

        // 14
        System.out.println("1. Write a Java program to remove all elements from a linked list:");
        LinkedList<Integer> l6 = new LinkedList<>();
        l6.add(1);
        l6.add(2);
        l6.add(3);
        System.out.println("Before removing: " + l6);
        l6.clear();
        System.out.println("After removing: " + l6 + "\n");

        // 18
        System.out.println("2. Write a Java program to copy a linked list to another linked list:");
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        LinkedList<Integer> b = new LinkedList<>();
        b.addAll(a);
        System.out.println("Linked list 1: " + a);
        System.out.println("Linked list 2: " + b + "\n");

        // 26
        System.out.println("3. Write a Java program to replace an element in a linked list:");
        LinkedList<String> l7 = new LinkedList<>();
        l7.add("lalala");
        l7.add("lololo");
        l7.add("lelele");
        System.out.println("Before replacing: " + l7);
        l7.set(2, "okay");
        System.out.println("After replacing: " + l7 + "\n");

        // 22
        System.out.println("4. Write a Java program to check if a particular element exists in a linked list:");
        System.out.println("Linked list: " + l7);
        String s = "lololo";
        if (l7.contains(s)) {
            System.out.println(s + " exists in the list");
        } else {
            System.out.println(s + " does not exist");
        }
        System.out.println("\n");

        // 19
        System.out.println("5. Write a Java program to remove and return the first element of a linked list:");
        System.out.println("Before removing: " + l7);
        String first = l7.removeFirst();
        System.out.println("After removing: " + l7);
        System.out.println("Removed element: " + first + "\n");

        // 23
        System.out.println("6. Write a Java program to convert a linked list to an array list:");
        System.out.println("Linked list: " + l7);
        List<String> l8 = new ArrayList<>(l7);
        System.out.println("Array list: " + l8);
        System.out.println("\n");

        System.out.println("Hash Set Exercises: ");

        // 7
        System.out.println("1. Write a Java program to convert a hash set to an array:");
        HashSet<String> h1 = new HashSet<>();
        h1.add("lalala");
        h1.add("lololo");
        h1.add("lelele");
        System.out.println("Hash set: " + h1);
        String[] arr = new String[h1.size()];
        h1.toArray(arr);
        System.out.println("Array: " + Arrays.toString(arr) + "\n");

        // 8
        System.out.println("2.  Write a Java program to convert a hash set to a tree set:");
        HashSet<Integer> h2 = new HashSet<>();
        h2.add(1);
        h2.add(2);
        h2.add(10);
        System.out.println("Hash set: " + h2);
        TreeSet<Integer> t1 = new TreeSet<>(h2);
        System.out.println("Tree set: " + t1 + "\n");

        // 9
        System.out.println("3. Write a Java program to find numbers less than 7 in a tree set.");
        System.out.println("Tree set: " + t1);
        System.out.println("Numbers less than 7: ");
        for (int i : t1) {
            if (i < 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 10
        System.out.println("\n4. Write a Java program to compare two hash set:");
        HashSet<String> h3 = new HashSet<>();
        h3.add("lalala");
        h3.add("lololo");
        System.out.println("Hash set 1: " + h3);
        HashSet<String> h4 = new HashSet<>();
        h4.add("lalala");
        h4.add("lelele");
        System.out.println("Hash set 2: " + h4);
        if (h3.equals(h4)) {
            System.out.println("The two hash sets are the same.");
        } else {
            System.out.println("The two hash sets are not the same.");
        }
        System.out.println("\n");

        // 11
        System.out.println("5. Write a Java program to compare two sets and retain elements that are the same:");
        System.out.println("Hash set 1: " + h3);
        System.out.println("Hash set 2: " + h4);
        h3.retainAll(h4);
        System.out.println("Retained elements: " + h3 + "\n");

        // 12
        System.out.println("6. Write a Java program to remove all elements from a hash set.");
        System.out.println("Hash set: " + h2);
        h2.clear();
        System.out.println("After removing: " + h2 + "\n");


        System.out.println("Tree Set Exercises: ");
        // 10
        System.out.println("1. Write a Java program to get the element in a tree set which is greater than or equal to the given element: ");
        t1.add(100);
        System.out.println("Tree set: " + t1);
        int n = 2;
        for (int i : t1) {
            if (i >= n) {
                System.out.println("Element greater than or equal to " + n + " = " + i);
            }
        }
        System.out.println("\n");

        // 11
        System.out.println("2. Write a Java program to get the element in a tree set less than or equal to the given element.");
        System.out.println("Tree set: " + t1);
        int n1 = 5;
        for (int i : t1) {
            if (i <= n1) {
                System.out.println("Element greater than or equal to " + n1 + " = " + i);
            }
        }
        System.out.println("\n");

        // 12
        System.out.println("3. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.");
        System.out.println("Tree set: " + t1);
        int n2 = 2;
        for (int i : t1) {
            if (i > n2) {
                System.out.println("Element greater than " + n2 + " = " + i);
            }
        }

        // 14
        System.out.println("4. Write a Java program to retrieve and remove the first element of a tree set:");
        System.out.println("Tree set: " + t1);
        int firstElement = t1.pollFirst();
        System.out.println("First element: " + firstElement);
        System.out.println("After removing: " + t1 + "\n");

        // 15
        System.out.println("5. Write a Java program to retrieve and remove the last element of a tree set:");
        System.out.println("Tree set: " + t1);
        int lastElement = t1.pollLast();
        System.out.println("Last element: " + lastElement);
        System.out.println("After removing: " + t1 + "\n");

        // 15
        System.out.println("6. Write a Java program to remove a given element from a tree set:");
        System.out.println("Tree set: " + t1);
        int n3 = 10;
        t1.remove(n3);
        System.out.println("After removing " + n3 + ": " + t1 + "\n");


        System.out.println("Priority Queue Exercises: ");

        // 7
        System.out.println("1. Write a Java program to compare two priority queues: ");
        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.add("lalala");
        p1.add("lololo");
        System.out.println("Priority queue 1: " + p1);
        PriorityQueue<String> p2 = new PriorityQueue<>();
        p2.add("lalala");
        p2.add("lelele");
        System.out.println("Priority queue 2: " + p2);
        if (p1.equals(p2)) {
            System.out.println("The two priority queues are the same.");
        } else {
            System.out.println("The two priority queues are not the same.");
        }
        System.out.println("\n");

        // 8
        System.out.println("2. Write a Java program to retrieve the first element of the priority queue:");
        System.out.println("Priority queue: " + p1);
        String firstElement1 = p1.peek();
        System.out.println("First element: " + firstElement1 + "\n");

        // 9
        System.out.println("3. Write a Java program to retrieve and remove the first element:");
        System.out.println("Priority queue: " + p1);
        String firstElement2 = p1.poll();
        System.out.println("First element: " + firstElement2);
        System.out.println("After removing: " + p1 + "\n");

        // 10
        System.out.println("4. Write a Java program to convert a priority queue to an array containing all its elements:");
        System.out.println("Priority queue: " + p2);
        String[] arr1 = new String[p2.size()];
        p2.toArray(arr1);
        System.out.println("Array: " + Arrays.toString(arr1) + "\n");

        // 11
        System.out.println("5. Write a Java program to convert a Priority Queue element to string representations:");
        System.out.println("Priority queue: " + p2);
        for (String s1 : p2) {
            System.out.println(s1);
        }
        System.out.println("\n");

        // 12
        System.out.println("6. Write a Java program to change priorityQueue to maximum priority queue:");
        PriorityQueue<Integer> p3 = new PriorityQueue<>();
        p3.add(1);
        p3.add(2);
        p3.add(3);
        p3.add(4);
        System.out.println("Priority Queue: " + p3);
        PriorityQueue<Integer> p4 = new PriorityQueue<>(Collections.reverseOrder());
        p4.addAll(p3);
        System.out.println("Maximum Priority Queue: " + p4 + "\n");


        System.out.println("Hash Map Exercises: ");
        // 7
        System.out.println("1. Write a Java program to test if a map contains a mapping for the specified key:");
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1 , "lalala");
        m1.put(2 , "lololo");
        System.out.println("Map: " + m1);
        int key = 2;
        if (m1.containsKey(key)) {
            System.out.println("contains the key " + key);
        } else {
            System.out.println("does not contain the key " + key);
        }

        // 8
        System.out.println("2. Write a Java program to test if a map contains a mapping for the specified value:");
        System.out.println("Map: " + m1);
        String value = "lolole";
        if (m1.containsValue(value)) {
            System.out.println("contains the value " + value);
        } else {
            System.out.println("does not contain the value " + value);
        }

        // 9
        System.out.println("3.  Write a Java program to create a set view of the mappings contained in a map:");
        System.out.println("Map: " + m1);
        Set set = m1.entrySet();
        System.out.println("Set view: " + set + "\n");

        // 10
        System.out.println("4. Write a Java program to get the value of a specified key in a map:");
        System.out.println("Map: " + m1);
        int key1 = 1;
        System.out.println("Value of key " + key1 + " = " + m1.get(key1) + "\n");

        // 11
        System.out.println(("5. Write a Java program to get a set view of the keys contained in this map:"));
        System.out.println("Map: " + m1);
        Set<Integer> keys = m1.keySet();
        System.out.println("Set view of keys: " + keys + "\n");

        // 12
        System.out.println("6. Write a Java program to get a collection view of the values contained in this map:");
        System.out.println("Map: " + m1);
        Collection<String> values = m1.values();
        System.out.println("Collection view of values: " + values + "\n");


        System.out.println("Tree Map Exercises: ");
        // 15
        System.out.println("1. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key:");
        TreeMap<Integer, String> t2 = new TreeMap<>();
        t2.put(1, "lalala");
        t2.put(2, "lololo");
        t2.put(3, "lelele");
        System.out.println("Tree map: " + t2);
        int key2 = 2;
        System.out.println("Least key strictly greater than " + key2 + " = " + t2.higherKey(key2) + "\n");

        //18
        System.out.println("2. Write a Java program to get a NavigableSet view of keys in a map:");
        System.out.println("Tree map: " + t2);
        NavigableSet<Integer> nks = t2.navigableKeySet();
        System.out.println("Navigable set view of keys: " + nks + "\n");

        //19
        System.out.println("3. Write a Java program to remove and get a key-value mapping associated with the least key in a map:");
        System.out.println("Tree map: " + t2);
        Map.Entry<Integer, String> e = t2.pollFirstEntry();
        System.out.println("Removed key-value mapping: " + e);
        System.out.println("After removing: " + t2 + "\n");

        //20
        System.out.println("4. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map:");
        System.out.println("Tree map: " + t2);
        Map.Entry<Integer, String> e1 = t2.pollLastEntry();
        System.out.println("Removed key-value mapping: " + e1);
        System.out.println("After removing: " + t2 + "\n");

        //21
        System.out.println("5. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).");
        t2.put(7, "lalala");
        t2.put(6, "lelele");
        t2.put(5, "lilili");

        System.out.println("Tree map: " + t2);
        System.out.println("Portion of map: " + t2.subMap(5, 8) + "\n");

        //22
        System.out.println("6. Write a Java program to get the portion of a map whose keys range from a given key to another key:");
        System.out.println("Tree map: " + t2);
        System.out.println("Portion of map: " + t2.subMap(5, true, 8, true) + "\n");

    }
}



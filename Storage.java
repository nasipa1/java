import java.util.List;

public class Storage<T> {
    T[] arr;

    public Storage(T[] arr) {
        this.arr = arr;
    }

    public void display() {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    public void addItem(T item) {
        T[] arr1 = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr.length] = item;
        arr = arr1;

    }

    public void getItem(int index) {
        System.out.println(arr[index]);
    }

    public void removeItem(int index){
        T[] arr1 = (T[]) new Object[arr.length - 1];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int i = index; i < arr1.length; i++) {
            arr1[i] = arr[i + 1];
        }
        arr = arr1;
    }

    public int size() {
        return arr.length;
    }
    public void printItem(List<T> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Storage<Integer> storage = new Storage<>(arr);
        System.out.println("Initial array:");
        storage.display();
        System.out.println("After adding 6:");
        storage.addItem(6);
        storage.display();
        System.out.println("After removing second item:");
        storage.getItem(2);
        storage.removeItem(2);
        storage.display();
        System.out.println("Size of array:");
        System.out.println(storage.size());
    }


}

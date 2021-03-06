import java.util.Arrays;
public class Faltoo {
    int[] list = new int[10];

    public static void main(String[] args) {
        Faltoo l1 = new Faltoo();
        System.out.println(Arrays.toString(l1.list));
        l1.insert(42);
        System.out.println(Arrays.toString(l1.list));
        l1.remove(0);
        l1.isEmpty();
        l1.isFull();
    }

    void insert(int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }
    }

    void remove(int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        list[list.length - 1] = 0;
    }

    boolean isEmpty() {
        if (list[0] == 0) {
            return true;
        } else {
            return false;
        }

    }

    boolean isFull() {
        if (list[list.length - 1] == 0) {
            return true;
        } else {
            return false;
        }
    }
}



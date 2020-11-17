import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
// Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
//        In ra danh sách tài sản đã nhập
        System.out.print("Property list: ");
        for (int e : array) {
            System.out.println(e + "\t");
        }
//        Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}

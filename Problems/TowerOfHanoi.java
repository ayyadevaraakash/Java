import java.util.Scanner;

public class TowerOfHanoi {

    static void towerOfHanoi(int disks, char source, char dest, char aux) {
        if (disks == 1) {
            System.out.println(source + " -> " + dest);
            return;
        }
        towerOfHanoi(disks - 1, source, aux, dest);
        System.out.println(source + " -> " + dest);
        towerOfHanoi(disks - 1, aux, dest, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int disks = sc.nextInt();
        System.out.println("Source: A, Destination: B, Auxiliary: C");
        towerOfHanoi(disks, 'A', 'B', 'C');
        sc.close();
    }
}

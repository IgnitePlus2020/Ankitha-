import java.util.*;
class q29 {
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        q29 ob = new q29();
        int [] arr = new int[40];
        int n =input.nextInt();
        for(int i =0; i<n;i++){
            arr[i]=input.nextInt();
        }
        int x = input.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

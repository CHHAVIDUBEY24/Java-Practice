import java.util.ArrayList;

public class Merge2BST {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node build(int[] arr, int s, int e) {

        if (s > e) {
            return null;
        }

        int mid = s + (e - s) / 2;

        Node root = new Node(arr[mid]);

        root.left = build(arr, s, mid - 1);
        root.right = build(arr, mid + 1, e);

        return root;
    }

    public static Node build(ArrayList<Integer> arr, int s, int e) {

        if (s > e) {
            return null;
        }

        int mid = s + (e - s) / 2;

        Node root = new Node(arr.get(mid));

        root.left = build(arr, s, mid - 1);
        root.right = build(arr, mid + 1, e);

        return root;
    }

    public static void inOrder(Node root, ArrayList<Integer> temp) {

        if (root == null) {
            return;
        }

        inOrder(root.left, temp);
        temp.add(root.val);
        inOrder(root.right, temp);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 9, 6, 5, 2, 3};
        int[] arr2 = {2, 7, 9};

        Node r1 = build(arr1, 0, arr1.length - 1);
        Node r2 = build(arr2, 0, arr2.length - 1);

        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        inOrder(r1, temp1);
        inOrder(r2, temp2);

        ArrayList<Integer> merged = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < temp1.size() && j < temp2.size()) {

            if (temp1.get(i) <= temp2.get(j)) {
                merged.add(temp1.get(i));
                i++;
            } else {
                merged.add(temp2.get(j));
                j++;
            }
        }

        while (i < temp1.size()) {
            merged.add(temp1.get(i));
            i++;
        }

        while (j < temp2.size()) {
            merged.add(temp2.get(j));
            j++;
        }

        Node r3 = build(merged, 0, merged.size() - 1);

        ArrayList<Integer> result = new ArrayList<>();
        inOrder(r3, result);

        System.out.println(result);
    }
}
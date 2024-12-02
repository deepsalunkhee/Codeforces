import java.lang.*;
import java.util.*;
import java.io.*;
class minSGTree {
    private int[] seg;

    public minSGTree(int n) {
        seg = new int[4 * n + 1];
    }

    public void build(int ind, int low, int high, int[] arr) {
        if (low == high) {
            seg[ind] = arr[low];
            return;
        }

        int mid = (low + high) / 2;
        build(2 * ind + 1, low, mid, arr);
        build(2 * ind + 2, mid + 1, high, arr);
        seg[ind] = Math.min(seg[2 * ind + 1], seg[2 * ind + 2]);
    }

    public int query(int ind, int low, int high, int l, int r) {
        // No overlap
        if (r < low || high < l) return Integer.MAX_VALUE;

        // Complete overlap
        if (low >= l && high <= r) return seg[ind];

        // Partial overlap
        int mid = (low + high) / 2;
        int left = query(2 * ind + 1, low, mid, l, r);
        int right = query(2 * ind + 2, mid + 1, high, l, r);
        return Math.min(left, right);
    }

    public void update(int ind, int low, int high, int i, int val) {
        if (low == high) {
            seg[ind] = val;
            return;
        }

        int mid = (low + high) / 2;
        if (i <= mid) {
            update(2 * ind + 1, low, mid, i, val);
        } else {
            update(2 * ind + 2, mid + 1, high, i, val);
        }
        seg[ind] = Math.min(seg[2 * ind + 1], seg[2 * ind + 2]);
    }
}

class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg){
		
		int n,q;
		n=sc.nextInt();
		q=sc.nextInt();
		
		int[]arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		
		minSGTree Sgt= new minSGTree(n);
		Sgt.build(0,0,n-1,arr);
		
		
		while(q!=0){
			int l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			int minval=Sgt.query(0,0,n-1,l,r);
			System.out.println(minval);
			q--;
		}
		
		
	}
}
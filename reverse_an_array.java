class reverse_an_array {
 public static void main(String args[]) {
  int arr[] = { 1, 2, 4, 5, 6 };
  int n = arr.length;
  int last = n - 1;

  for (int first = 0; first < last; first++, last--) {
   arr[first] = arr[last] + arr[first] - (arr[last] = arr[first]);

  }
  System.out.println("reversed array is :-");
  for (int i = 0; i < n; i++) {
   System.out.print(arr[i] + " ");
  }
 }
}

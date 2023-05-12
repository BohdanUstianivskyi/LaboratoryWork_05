public class Exercise_04 {
        public static void main(String[] args) {
            int[] arr = {0, 3, 2, 9, 10, 1, 23};
            int max = MaxNumber(arr);
            System.out.println("The largest number in the array: " + max);
        }

        public static int MaxNumber(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }



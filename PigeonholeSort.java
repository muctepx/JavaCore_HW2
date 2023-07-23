package JavaCore.HW2;

public class PigeonholeSort {
        public static int[] pigeonhole_sorting(int[] my_arr, int n) {
            int min_element = my_arr[0];
            int max_element = my_arr[0];
            int my_range, i, j, index;
            for (int a = 0; a < n; a++) {
                if (my_arr[a] > max_element)
                    max_element = my_arr[a];
                if (my_arr[a] < min_element)
                    min_element = my_arr[a];
            }
            my_range = max_element - min_element + 1;
            int[] sorted_arr = new int[my_range];
            for (i = 0; i < n; i++)
                sorted_arr[my_arr[i] - min_element]++;
            index = 0;
            for (j = 0; j < my_range; j++)
                while (sorted_arr[j]-- > 0)
                    my_arr[index++] = j + min_element;
            return my_arr;
        }
    }


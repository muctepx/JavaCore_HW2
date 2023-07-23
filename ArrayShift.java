package JavaCore.HW2;

public class ArrayShift {
    public static int[] shift(int[] array, int shift) {
        if (array == null) {
            return null;
        } else if (array.length == 1) {
            return array;
        } else if (array.length >= Math.abs(shift)) {
            int length = array.length;
            int[] result = new int[length];
            int offset = checkShift(array, shift);
            System.arraycopy(array, offset, result, 0, length - offset);
            System.arraycopy(array, 0, result, length - offset, offset);
            return result;
        } else {
            return shift(array, (array.length - checkShift(array, shift)) * -1);
        }
    }

    private static int checkShift(int[] array, int shift) {
        if (shift >= 0) {
            return shift;
        } else if (array.length > Math.abs(shift)) {
            return array.length + shift;
        }
        return (array.length + shift) * -1;
    }
}

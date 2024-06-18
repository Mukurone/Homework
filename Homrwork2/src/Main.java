public class Main {
    public static int sumArr(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4){
            throw new ArraySizeException("Не правильный размер массива. Ожидается массив размером 4x4");
        }

        for (String[] row : array) {
            if (row.length != 4){
                throw new ArraySizeException("Не правильный размер массива. Ожидается массив размером 4x4");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Не правильные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args){
        String[][] array = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","jkhkjhk","16"},
        };

        try {
            int result = sumArr(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (ArrayDataException e){
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}
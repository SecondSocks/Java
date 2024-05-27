package learning;

public class multimensionalArrays {
    

    public static void main(String[] args) {
        
        int[][] array = {{1,2,3}, 
                         {4,5,6}, 
                         {7,8,9},
                           {0}};

        System.out.println(array[1][2] + "\n"); // [массив][элемент]

        for(int[] a : array) {  // Вывод двумерного массива
            for(int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < array.length; i++) {  // Вывод двумерного массива
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

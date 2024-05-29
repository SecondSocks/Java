package tasks;
import java.util.ArrayList;


public class task1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();

        for(int x = 0; x < 10000; x++) {
            for(int y = 0; y < 10000; y++) {
                for(int z = 0; z < 10000; z++) {
                    if( (x+y) * (x+y+z) == 601 && (y+z) * (y+z+x) == 705 && (z+x) * (z+x+y) == 616 ) {
                        nums.add(x+y+z);
                    }
                }
            }
        }

        for(int i : nums) {
            System.out.print(i +" ");
        }
    }
}

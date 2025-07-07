
public class Exercise401 {
	public static void main(String[] args) {
        int[] numbers = {
          5, 1, 2, 8, 6, 4, 3, 7, 20, 21, 22, 25, 50, 51, 52, 53, 10, 11, 12, 13, 100, 99, 98, 97, 96, 80, 81, 82, 83, 84
        };
        // TODO
        int max = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = 0; j < numbers.length - (i + 1); j++) {
        		if(numbers[j] > numbers[j + 1]) {
        			int temp = numbers[j];
        			numbers[j] = numbers[j + 1];
        			numbers[j + 1] = temp;
        		}
        	}
        }
        
        for(int i = 0; i < numbers.length - 1; i++) {
        	int count = 1;
        	for(int j = 0; j < numbers.length - (i + 1); j++) {
        		if(numbers[j] + 1 == numbers[j + 1] ) {
        			count++;
        		}
        		else {
        			if(max < count) {
        				max = count;
        			}
        			break;
        		}
        	}
        }
        
        System.out.println("最も長いものの長さ : " + max);
    }
}

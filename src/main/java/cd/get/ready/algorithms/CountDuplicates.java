package cd.get.ready.algorithms;

import java.util.HashMap;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        HashMap<String, Integer> mapInput = new HashMap<String, Integer>();
        int duplicateCount = 0;

        for (int i = 0; i < input.length; i++) {
            if(!mapInput.containsKey(input[i])) {
                mapInput.put(input[i],1);
            }
            else {
                Integer currentValueAtKey = mapInput.get(input[i]);
                if(currentValueAtKey == 1) {
                    duplicateCount += 1;
                }
                currentValueAtKey++;
                mapInput.put(input[i], currentValueAtKey);
            }
        }
        return duplicateCount;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        HashMap<Integer, Integer> mapInput = new HashMap<Integer, Integer>();
        int duplicateCount = 0;

        for (int i = 0; i < input.length; i++) {
            if(!mapInput.containsKey(input[i])) {
                mapInput.put(input[i],1);
            }
            else {
                Integer currentValueAtKey = mapInput.get(input[i]);
                if(currentValueAtKey == 1) {
                    duplicateCount += 1;
                }
                currentValueAtKey++;
                mapInput.put(input[i], currentValueAtKey);
            }
        }
        return duplicateCount;
    }
}

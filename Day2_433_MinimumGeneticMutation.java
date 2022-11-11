package leetcodeNov2022;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: November 2022, Day 2
 * Problem 433: Minimum Genetic Mutation
 *
 */

class Day2_433_MinimumGeneticMutation {
    
    public int minMutation(String startGene, String endGene, String[] bank) {
        List <String> bankList = Arrays.asList(bank);
        if (!bankList.contains(endGene))
            return -1;
        
        int ans = 0;
        for (int i=0; i<8; i++)
            if (startGene.charAt(i) != endGene.charAt(i))
                ans ++;
        
        return ans;
    }
}
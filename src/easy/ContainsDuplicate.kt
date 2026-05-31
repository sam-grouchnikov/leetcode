package easy

import java.util.HashMap

class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashMap<Int, Int>()
        for (num in nums) {
            if (seen.containsKey(num)) {return true} else {seen.put(num, 1)}
        }
        return false
    }
}
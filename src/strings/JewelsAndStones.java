package strings;

/**
 * Задача на leetcode - 771. Jewels and Stones
 *
 * @see <a href="https://leetcode.com/problems/jewels-and-stones/description/">771. Jewels and Stones</a>
 */
public class JewelsAndStones {

    /**
     * @param jewels драгоценные камени
     * @param stones камни, которые есть у нас
     * @return кол-ва драгоценных камней
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        char[] stonesCharArray = stones.toCharArray();
        for (Character stone : stonesCharArray) {
            if(jewels.contains(stone.toString())) num ++;
        }
        return num;
    }
}

// 2416. Sum of Prefix Scores of Strings
// Date: 25/09/24

import java.util.Arrays;

public class PrefixScoresSum {
    public static void main(String[] args) {
        String[] str = {"abc","ab","bc","b"};
        System.out.println(Arrays.toString(sumPrefixScores(str)));
    }
    static class TrieNode {
        TrieNode[] children;
        int count;

        TrieNode() {
            children = new TrieNode[26];
            count = 0;
        }
    }
    static int[] sumPrefixScores(String[] words) {
        TrieNode root = new TrieNode();


        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
                node.count++;
            }
        }
        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            TrieNode node = root;
            int score = 0;
            for (char c : words[i].toCharArray()) {
                node = node.children[c - 'a'];
                score += node.count;
            }
            result[i] = score;
        }

        return result;
    }
}

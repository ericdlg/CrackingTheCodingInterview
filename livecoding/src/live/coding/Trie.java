package live.coding;


public class Trie {

    public static final String END_OF_STRING = "$";

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode("");
    }

    public void insertString(String str) {
        TrieNode currentNode = root;

        for (int i = 0; i < str.length(); ++i) {
            String letter = str.substring(i, i + 1);

            TrieNode child = currentNode.geChild(letter);

            if (null == child) {
                currentNode.addChild(letter);
            } else {
                currentNode = child;
            }




        }

        root.addEndOfString();
    }

    boolean inTrie(String str) {
        // TODO: new to be implemented
        return true;
    }
}

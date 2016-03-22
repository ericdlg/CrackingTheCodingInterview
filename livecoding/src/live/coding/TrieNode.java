package live.coding;

import java.util.Map;
import java.util.TreeMap;

public class TrieNode {

    private TreeMap<String, TrieNode> child;
    private String data;

    public TrieNode(String letter) {
        this.child = new TreeMap<String, TrieNode>();
        this.data = letter;

        addChild(letter);
    }

    public void addChild(String letter) {
        this.child.put(letter, new TrieNode(letter));
    }

    public TrieNode geChild(String letter) {
        return this.child.get(letter);
    }

    public int totalChilds() {
        return child.size();
    }

    public TrieNode childAtIndex(int index) {
        if (index < totalChilds()) {
            int i = 0;
            for (Map.Entry<String, TrieNode> entry : child.entrySet()) {
                if (i == index) return entry.getValue();
                ++i;
            }
        }

        return null;
    }

    public void addEndOfString() {
        addChild(Trie.END_OF_STRING);
    }

    public boolean isEndOfString() {
        return null != this.geChild(Trie.END_OF_STRING);
    }
}

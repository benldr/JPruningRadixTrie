package pruningRadixTrie;

import java.util.List;

//Trie node class
public class Node
{
    private List<NodeChild> children;

    //Does this node represent the last character in a word? 
    //0: no word; >0: is word (termFrequencyCount)
    private long termFrequencyCount;
    private long termFrequencyCountChildMax;

    public Node(long termfrequencyCount)
    {
        this.termFrequencyCount = termfrequencyCount;
    }

	@Override
	public String toString() {
		return "Node [children=" + children + ", termFrequencyCount=" + termFrequencyCount
				+ ", termFrequencyCountChildMax=" + termFrequencyCountChildMax + "]";
	}

	public List<NodeChild> getChildren() {
		return children;
	}

	public void setChildren(List<NodeChild> children) {
		this.children = children;
	}

	public long getTermFrequencyCount() {
		return termFrequencyCount;
	}

	public void setTermFrequencyCount(long termFrequencyCount) {
		this.termFrequencyCount = termFrequencyCount;
	}

	public long getTermFrequencyCountChildMax() {
		return termFrequencyCountChildMax;
	}

	public void setTermFrequencyCountChildMax(long termFrequencyCountChildMax) {
		this.termFrequencyCountChildMax = termFrequencyCountChildMax;
	}
    
    
}
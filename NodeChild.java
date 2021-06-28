package pruningRadixTrie;

public class NodeChild {
	private String key;
	
	private Node node;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	@Override
	public String toString() {
		return "NodeChild [key=" + key + ", node=" + node + "]";
	}

	public NodeChild(String key, Node node) {
		super();
		this.key = key;
		this.node = node;
	}
}

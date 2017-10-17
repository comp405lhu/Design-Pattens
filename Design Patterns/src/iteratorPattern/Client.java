package iteratorPattern;

public class Client {

	public  class Node{
		String str;
		 Node(String str) {
			this.str = str;
		}
		
		@Override
		public String toString() {
			return str;
		}
	}
	
	public static void main(String[] args) {

		Double[] array = {0.0, 1.1, 2.2, 3.3};
		
		MyBuffer<Double> buffer = new MyBuffer<>(array);
		
		for (double i : buffer){
			System.out.println(i + " ");
		}
		
		Node[] nodes = {new Client().new Node("A"), new Client().new Node("B"), new Client().new Node("C")};
		
		MyBuffer<Node> buffer2 = new MyBuffer<>(nodes);
		
		for (Node node : buffer2) {
			System.out.println(node);
		}

	}

}

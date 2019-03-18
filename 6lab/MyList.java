package examples;

public class MyList<T>
{
	class Node<T> //inner class
    {
        Node<T> next;
        T data;
    }
    
    static class Node<T> //static
    {
        Node<T> next;
        T data;
    }
    
    MyList()
    {
        class Node<T> //local
        {
            Node<T> next;
            T data;
        }
    }
    
	Node<T> first;
	
	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = first;
		first = node;
	}
	
	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = first;
		
		while (temp != null) {
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		
		return s + "]";
	}

}

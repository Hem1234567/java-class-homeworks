public class StringBufferDemo {
    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(6, 17);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length
        System.out.println("Length: " + sb.length());

        // Capacity
        System.out.println("Capacity: " + sb.capacity());
    }
}
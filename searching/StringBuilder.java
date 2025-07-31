package searching;

public class StringBuilder {
    private char[] value;
    private int count;
    private static final int DEFAULT_CAPACITY = 16;

    public StringBuilder() {
        value = new char[DEFAULT_CAPACITY];
    }

    public StringBuilder(int capacity) {
        value = new char[capacity];
    }

    public StringBuilder(String str) {
        value = new char[str.length() + DEFAULT_CAPACITY];
        append(str);
    }

    public StringBuilder append(String str) {
        if (str == null) str = "null";
        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    private void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            int newCapacity = value.length * 2 + 2;
            if (newCapacity < minimumCapacity) {
                newCapacity = minimumCapacity;
            }
            char[] newValue = new char[newCapacity];
            System.arraycopy(value, 0, newValue, 0, count);
            value = newValue;
        }
    }

    public String toString() {
        return new String(value, 0, count);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.toString());
    }
}

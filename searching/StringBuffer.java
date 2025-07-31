package searching;

public class StringBuffer {
    private char[] value;
    private int count;

    public StringBuffer() {
        value = new char[16];
        count = 0;
    }

    public synchronized StringBuffer append(String str) {
        if (str == null) {
            str = "null";
        }
        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }

    private void ensureCapacity(int minimumCapacity) {
        if (minimumCapacity > value.length) {
            int newCapacity = (value.length * 2) + 2;
            if (newCapacity < minimumCapacity) {
                newCapacity = minimumCapacity;
            }
            char[] newValue = new char[newCapacity];
            System.arraycopy(value, 0, newValue, 0, count);
            value = newValue;
        }
    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello ");
        sb.append("World!");
        System.out.println(new String(sb.value, 0, sb.count));
    }
}

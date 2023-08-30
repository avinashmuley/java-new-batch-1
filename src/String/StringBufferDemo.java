package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("java");
        stringBuffer.append("is on");
        stringBuffer.append("Object");
        stringBuffer.append("Oriented");
        stringBuffer.append("Language");
        System.out.println(stringBuffer.toString());


        System.out.println("Capacity:"+stringBuffer.capacity());
        stringBuffer.insert(0, "****");
        System.out.println(stringBuffer.toString());

        System.out.println("Reverse:"+stringBuffer.reverse());
    }
}

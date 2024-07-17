import java.util.ArrayList;
import java.util.List;

class ReflectionExample {
    public static void main(String[] args) {
        try {
            

            Object[] objectArray = new Long[1];
            objectArray[0] = "Long에 문자열 넣기";  

            List<Long> objectList = new ArrayList<Long>();
            //objectList.add("Long에 문자열 넣기");   


            // 클래스 정보 얻기
            Class<?> clazz = Class.forName("java.util.ArrayList");
            
            // 클래스 이름 출력
            System.out.println("Class Name: " + clazz.getName());
            
            // 수퍼 클래스 출력
            System.out.println("Superclass: " + clazz.getSuperclass().getName());
            
            // 클래스의 인터페이스 출력
            Class<?>[] interfaces = clazz.getInterfaces();
            for (Class<?> iface : interfaces) {
                System.out.println("Interface: " + iface.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

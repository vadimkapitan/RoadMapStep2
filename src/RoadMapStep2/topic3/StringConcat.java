package RoadMapStep2.topic3;

public class StringConcat {
    public static void main(String[] args) {

        String hello = "Hello";
        String space = " ";
        String World = "World";
        String result = hello + space + World;

        System.out.println(hello.concat(space).concat(World));
        System.out.println(result);

    }
}

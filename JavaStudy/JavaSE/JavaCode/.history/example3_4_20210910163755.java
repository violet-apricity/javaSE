/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-10 16:11:50
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-10 16:37:55
 * @FilePath: \apricityd:\ALL_Project-DevelopTools\Forjava\Project\example3_4.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
import java.util.Scanner;//封装的类，创造对象调用方法读取命令行输入
class People {
    int age;
    float weight;
    final int class_ = 202;
    float birthDate = 2001.0525f;
    void speak() {
        System.out.println("My age :" + age );
        System.out.println("My weight :" + weight );
        System.out.println("My calss :" + class_ );
        System.out.println("My birthDate :" + birthDate );
    }
}
//eample3_4 用Scanner创造对象读取输入
public class example3_4 {
    public static void main(String args[]) {
        People zpx = new People();
        Scanner reader = new Scanner(System.in);
        System.out.println("Input age:");
        zpx.age = reader.nextInt();
        System.out.println("Input werght:");
        zpx.weight = reader.nextFloat();
        zpx.speak();
    }
}
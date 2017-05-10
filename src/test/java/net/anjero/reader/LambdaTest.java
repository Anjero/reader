package net.anjero.reader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ///////////////////////////////////////
 * <p>Create by 2017/5/10</p>
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 *
 * @author :anjero
 * @version :1.0
 */
public class LambdaTest {

    public static void main(String[] args) {

//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("1");
//        strings.add("2");
//        strings.add("3");
//        strings.add("4");
//        strings.add("5");
//        strings.add("6");
//        strings.forEach(
//                (String st) ->
//                        System.out.println(st)
//        );


        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);

        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime.now()));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}

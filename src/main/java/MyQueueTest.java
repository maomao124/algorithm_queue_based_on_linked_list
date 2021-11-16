import java.util.Scanner;

/**
 * Project name(项目名称)：算法_基于链表的队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyQueueTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 21:47
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyQueueTest
{
    public static void main(String[] args)
    {
        MyQueue<String> queue = new MyQueue<String>();
        /*
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String item = in.next();
            if (!item.equals("-"))
            {
                q.enqueue(item);
            }
            else
            {
                System.out.print(q.dequeue() + " ");
            }
        }
        System.out.println();
        System.out.println(q.size());

         */
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("3");
        queue.display();
        System.out.println(queue.dequeue());
        queue.enqueue("4");
        System.out.println(queue.dequeue());
        queue.display();
    }
}

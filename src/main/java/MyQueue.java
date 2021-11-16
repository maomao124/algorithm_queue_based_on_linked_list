import java.util.NoSuchElementException;

/**
 * Project name(项目名称)：算法_基于链表的队列
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyQueue
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/16
 * Time(创建时间)： 21:47
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyQueue<T>
{
    private Node<T> head;// 头结点，不存数据
    private Node<T> front;//指向队头结点
    private Node<T> tail;//指向队尾结点
    private int size;


    public MyQueue()
    {
        head = new Node<T>();
        front = tail = null;
        size = 0;
    }

    /**
     * 入队
     *
     * @param item
     */
    public void enqueue(T item)
    {
        /********** Begin *********/
        if (size == 0)
        {
            Node<T> node = new Node<>();
            node.item = item;
            node.next = null;
            head.next = node;
            front = node;
            size++;
            tail = node;
            return;
        }
        Node<T> node = new Node<>();
        node.item = item;
        node.next = null;
        tail.next = node;
        size++;
        tail = node;

        /********** End *********/

    }

    /**
     * 出队
     *
     * @return
     */
    public T dequeue()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("队列为空！");
        }

        /********** Begin *********/
        T result = head.next.item;
        head.next = head.next.next;
        front = head.next;
        size--;
        return result;

        /********** End *********/

    }

    /**
     * 返回队列中元素数量
     *
     * @return
     */
    public int size()
    {
        return size;
    }

    /**
     * 判断一个队列是否为空
     *
     * @return
     */
    public boolean isEmpty()
    {
        return (front == null);
    }

    public void display()
    {
        Node<T> node = front;
        while (node != tail)
        {
            System.out.print(node.item + " ");
            node = node.next;
        }

        System.out.println(node.item);
    }

    /**
     * 链表结点内部类
     */
    private static class Node<E>
    {
        private E item;
        private Node<E> next;
    }
}

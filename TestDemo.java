import java.util.*;

public class TestDemo {
    /**
     * 题目描述：
     *链接：https://www.nowcoder.com/questionTerminal/02d8d42b197646a5bbd0a98785bb3a34?f=discussion
     * 来源：牛客网
     *
     * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
     * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
     * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
     *
     * 输入描述:
     * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区间)。
     *
     *
     * 输出描述:
     * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
     * 示例1
     * 输入
     * 1 -2 3 4
     * 输出
     * 2 1 3
     *
     */
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if(0.0 == 0){
                System.out.println("111");
            }
            float x;
            float y;
            float z;
            x = (a + c)/2;
            y = (b + d)/2;
            z = (d - b)/2;
            if(x - (a + c)/2 != 0){
                System.out.println("No");
                System.out.println(x - (a + c)/2);
                return;
            }
            if(y - (b + d)/2 != 0 || y -(c-a)/2 != 0){
                System.out.println("No");
                System.out.println(y - (b + d)/2);
                return;
            }
            if(z - (d - b)/2 != 0){
                System.out.println("No");
                System.out.println(z - (d - b)/2 != 0);
                return;
            }
            System.out.println((int)x + " " + (int)y + " " + (int)z);
        }
    }

    /**
     * String里的函数 charAt(int index) ------ 取得指定索引位置的字符，索引从0 开始。
     * 在String中使用"+"来进行字符串连接，但是这个操作在StringBuffer类中需要更改为append()方法：
     * StringBuffer sb = new StringBuffer();  ---StringBuffer 使用方法。（比较两个字符串必须用equals（）函数且使用.toString函数）。
     * String和StringBuffer最大的区别在于：String的内容无法修改，而StringBuffer的内容可以修改。频繁修改字符串的
     * 情况考虑使用StingBuffer。
     * 字符串反转：.reverse()(自身的值发生改变)
     * 删除指定范围的数据:.delete(int start, int end)
     * 插入数据:. insert(int offset, 各种数据类型 b)
     *题目：给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数。
     *
     * 输入描述：
     * 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
     * 输出描述：
     * 为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，则对应的数字规则参考16进制（比如，10
     * 用A表示，等等）
     * 示例1:
     * 输入
     * 7 2
     * 输出
     * 111
     **/




     /**
     * 标题：统计回文
     * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。花花非常喜欢这种拥有
     * 对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。现在她非常好奇有没有办法将字符
     * 串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，帮助她寻找有多少种插入办法可以使新
     * 串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
     *
     * A = “aba”，B = “b”。这里有4种把B插入A的办法：
     *
     * 在A的第一个字母之前: “baba” 不是回文
     * 在第一个字母‘a’之后: “abba” 是回文
     * 在字母‘b’之后: “abba” 是回文
     * 在第二个字母’a’之后 “abab” 不是回文
     * 所以满足条件的答案为2
     *
     *
     *
     **/
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String a = in.nextLine();
            String b = in.nextLine();
            int result = 0;
            for(int i = 0; i < a.length();i++){
                StringBuffer sb = new StringBuffer("");
                sb.append(a);
                sb.insert(i,b);
                if(sb.toString().equals(sb.reverse().toString())){
                    result++;
                }
            }
            StringBuffer sb = new StringBuffer("");
            if(sb.append(a).append(b).toString().equals(sb.reverse().toString())){
                result++;
            }
            System.out.println(result);
        }
    }

    public static void main3(String[] args) {
        StringBuffer sb = new StringBuffer("ddddd");
        StringBuffer sb2 = new StringBuffer("ddddd");
        if(sb.toString().equals(sb2.toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        String s="abc";
        String s1="abc";
        if(s1 == s){
            System.out.println("111");
        }

    }


    /**
     *输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     *
     * 要求时间复杂度为O(n)。 
     *
     * 示例1:
     *
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */

    public static void main4(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] nums = new int[a];
            for(int i = 0; i < a;i++){
                nums[i] = in.nextInt();
            }
            int res = maxSubArray(nums);
            System.out.println(res);
        }
    }

    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    /**
     * 题目描述：
     * 二货小易有一个W*H的网格盒子，网格的行编号为0H-1，网格的列编号为0W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
     * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
     * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
     * 小易想知道最多可以放多少块蛋糕在网格盒子里。
     * 输入描述:
     * 每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
     * 输出描述:
     * 输出一个最多可以放的蛋糕数
     *
     *思路：用贪心的思想来做，开始将棋盘a全置为0，0代表放入蛋糕，-1代表不能放入
     *     从左向右从上到下遍历棋盘开始依此放蛋糕，然后将该块蛋糕上下左右欧几里得距离为2的点全部标记为-1，
     *     意思为该点不能再放入蛋糕，如果下一步扫到的-1，则跳过该点，
     *     如果扫到0，则count++, 继续把周围距离为2的点标记为-1。
     */
    public static void main5(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] arr = new int[a][b];
            int count = 0;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (arr[i][j] == 0) {
                        count++;
                        if (i + 2 < a) {
                            arr[i + 2][j] = -1;
                        }
                        if (j + 2 < b) {
                            arr[i][j + 2] = -1;
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }

    /**
     *Java代码实现多个数的最小公倍数
     *
     *
     *
     */
    public static void main6(String[] args) {
        //测试
        int arr[] = {4,6,8,9};
        System.out.println(getMinMultiCommonMultiple(arr));
    }
    //先求两个数的最大公约数（使用辗转相除法）
    public static int getMaxCommonDivisor(int a,int b) {
        //定义一个交换站值
        int temp =0;
        while(a%b!=0) {
            temp = a%b;
            a = b;
            b =temp;
        }
        return b;
    }
    //求两个数的最小公倍数（两个数相乘再除以最大公约数）
    public static int getMinCommonMultiple(int a,int b) {
        return a*b/getMaxCommonDivisor(a,b);
    }
    //求多个数的最小公倍数
    public static int getMinMultiCommonMultiple(int []arrays) {
        int val = arrays[0];
        //实现原理：拿前两个数的最小公约数和后一个数比较，求他们的公约数以此来推。。。
        for(int i =1;i<arrays.length;i++) {
            val = getMinCommonMultiple(val,arrays[i]);
        }
        return val;
    }

    /**
     *题目描述：
     * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
     * 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
     *
     * 示例：
     * 输入 8
     * 输出 6
     *
     */
    //方法1：这也是我觉得代码简单好理解的一条思路，定义一个boolean数组，每隔两个将其置为true，
    // 如此循环直到最后输出的index就是最后一个删除的了
    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            boolean[] delete = new boolean[n];
            int count = 0;
            int index = 0;
            int num = 0;
            while (count < n) {
                for (int i = 0; i != n; ++i) {
                    if (delete[i] == false) {
                        ++num;
                        if (num == 3) {
                            delete[i] = true;
                            num = 0;
                            ++count;
                            index = i;
                        }
                    }
                }
            }
            System.out.println(index);
        }


    }
    //方法2：利用队列来做也不是很难，每隔两个将其出队列，其余的再放回去，如此往复剩下的最后一个就是我们所要的了。
    //队列：Queue<Object>  list=new LinkedList<>();
    //入队列：offer(e);
    //出队列：poll();--有返回值
    //队首元素：peek();--有返回值
    //队列长度：size();
    public static void main8(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            if(a >= 1000){
                a = 999;
            }
            Queue<Object> list=new LinkedList<>();
            for (int i = 0; i < a ; i++) {
                list.offer(i);
            }
            while(list.size() != 1){
                for (int j = 0; j < 2 ; j++) {
                    list.offer(list.poll());
                }
                list.poll();
            }
            System.out.println(list.poll());
        }
    }

    /**
     *
     *题目：找出n个数里最小的k个
     *
     * 题目链接：https://www.nowcoder.com/questionTerminal/cc727473d1e248ccb674eb31bd8683dc
     *
     * 输入描述：每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n 不超过100。
     *
     * 输出描述：输出n个整数里最小的k个数。升序输出
     *
     * 示例1
     *
     * 输入  3 9 6 8 -10 7 -11 19 30 12 23 5
     *
     * 输出  -11 -10 3 6 7
     *
     * 思路：
     *
     * 第一步：设一个List，将输入的数存入list中，这里面，输入的最后一个数为k值，所以要把他分割出来，然后删除；
     *
     * 第二步：创建一个数组，将将更新后的list的数存入list中，然后对数组进行排序（从小到大）；
     *
     * 第三步：打印出数组的前k个，此处注意打印出的数字打印在同一行并且之间相隔一个空格，但是最后一个数字后面不需要空格；
     *
     * @param args
     */


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(scanner.hasNext()){
            list.add(scanner.nextInt());
        }
        int k=list.get(list.size()-1);
        list.remove(list.size()-1);
        int [] array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        Arrays.sort(array);
        for(int i=0;i<k-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(array[k-1]);
    }
    //方法2：
    public static void main9(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int[] arr = new int[a];
            for(int i = 0;i < a;i++){
                arr[i] = in.nextInt();
            }
            int k = arr[a-1];
            int[] arr2 = new int[a-1];
            for(int i = 0;i < a-1;i++){
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            for(int i = 0;i < k; i++){
                System.out.println(arr2[i]);
            }
        }
    }



}











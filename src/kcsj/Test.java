package kcsj;

class Test {
    static int count = 0;

    Test() { count++; }
    public static void main(String arr[])
    {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println("Total " + count
                + " objects created");
    }
}

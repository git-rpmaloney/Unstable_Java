class callstatictest{
    public static void main(String x[]){
        statictest test;
        test = new statictest();
        test.A = 15;
        statictest.boom();
    }
}
class paintapp{
    public static void main(String[] args){
        paint application = new paint();
        application.addToScreen(new rect());
        application.addToScreen(new circle());
        application.addToScreen(new triangle());
    }
}
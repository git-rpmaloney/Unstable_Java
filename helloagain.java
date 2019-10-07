class helloagain{
    public helloagain(){
        this(7,4);
        System.out.println("PUBLIC THIS NO VAR");
    }
    public helloagain(int a, int b){
        this(7,5,4);
        System.out.println("PUBLIC THIS WITH 2 INT");
    }
    public helloagain(int a, int b, int c){
        System.out.println("PUBLIC THIS WITH 3 INT");
    }
}
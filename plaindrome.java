class Main {
    public static void main(String[] args) {
        int last,n=121,rev=0,temp=n;
        while(n>0){
           last=n%10;
           rev=rev*10+last;
           n=n/10;
        }
        System.out.println(rev);
    if(temp==rev){
        System.out.println("it is a plaindrone");
    }else{
        System.out.println("it is not a plaindrone");
    }
}
}

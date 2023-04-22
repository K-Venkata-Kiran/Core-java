public class LikesDemo {
    static int No_of_Likes=0;

    public static void main(String[] args) {
        LikesDemo.No_of_Likes++; // 1
        System.out.println(No_of_Likes);


        LikesDemo user1=new LikesDemo();
        user1.No_of_Likes++; //1
        LikesDemo user2=new LikesDemo();
        user2.No_of_Likes++; //1
        LikesDemo user3=new LikesDemo();
        user3.No_of_Likes++; //1
        LikesDemo user4=new LikesDemo();
        user4.No_of_Likes--;//-1
        System.out.println("Likes :"+No_of_Likes);
    }
}

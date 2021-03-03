package com.MyTrial.javaexamples;

public class Apps {
    public static void main(String[] args){
        Book book1=new Book();
        book1.read();

        Story story1=new Story("aladdin and the magic lamp");
        story1.showhero();

        Showinfo info =book1;
        info.showinfo();;
        System.out.println();
        Publisher pub=book1;
        pub.Nameofpublisher();;
        System.out.println();
        Publisher pub1=story1;
        pub1.Nameofpublisher();

        Showinfo info1=story1;
        info1.showinfo();
        System.out.println();
        outputinfo(book1);
        outputinfo(story1);
        System.out.println();
        out(book1);
        out(story1);
    }
    public static void outputinfo( Showinfo cba){
        cba.showinfo();
    }
    public static void out(Publisher a){
        a.Nameofpublisher();
    }


}

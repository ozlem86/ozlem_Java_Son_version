package day18varargsstringbuilderstringbuffer;

public class StringBuilder01 {
    // Stringbuilder is a class in Java we use it to create Strings.
   // We have string class to create string why java crate a strinBuilder class to create string?
    //String class is "immutable"(sabit,degismez,uppdate yapilmaz,original value korunur,
    // her yeni uppdate de yeni container olusturur)
    // we sometimes need "mutable(degisken,original valueyi kaybedersin,uppdateler orginal value uzerinden yapilir)
    // strings thats why java crate Strinbuilder class.(memoryde daha az yer kaplar)

    //** Stringbuilder isnot "thread safe"( mean; being able to do "multiple thread(tasks)
    // and is not "synchronized" at the same time.

    // If you need a string to use in "multi thread" use Stringbuffer" it is a class in Java used to create Strings
    //to create a string we have three options
    //String class:if you need "immutable string" use it
    //StringBuilder class:if you need "mutable(degisken) string"and dont need multi thread and synchronization use it
    //StringBuffer class:if you need "mutable string"and  multi thread and synchronization use it
    //StringBuilder is faster than  StringBuffer



    public static void main(String[] args) {
        String s ="Java";
        String t =s.concat("!");
        System.out.println(s);

        //create a StringBuilder(Mutable String)
        StringBuilder sb1= new StringBuilder("Java");
        System.out.println(sb1);

        // orjinal value uppdate oldu
        sb1.append("!").append("...");// append() add yapar
        System.out.println(sb1);
        sb1.insert(4," is love");//offset 4--> skip first 4 character and insert(arasina koymak,eklemek ....
        System.out.println(sb1);
        sb1.insert(2,"money",1,4);
        System.out.println(sb1);//Jaoneva is love!...
        //Offset demek karakter sayisi ile calismaktir. index ile calismaz.

        sb1.replace(2,5,"1");
        System.out.println(sb1);
        sb1.deleteCharAt(2);
        System.out.println(sb1);
        sb1.delete(7,12);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        //"reverse a String" question is asked to you in an interview, dont forget to mention
        // about reverse method in Stringbuilder.ayni zamanda stringi loop ile de yapariz


        //*** Önemli
        String newS= sb1.toString(); // stringe convert eder ama stringe dönebilmek icin
        // memoride yeni bir alan acmak gerekiyor.

        StringBuilder sb2= new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Kava");
        int r1= sb2.compareTo(sb3);
        System.out.println(r1);//-2 // eksi once demek j k dan bir once
        // compareTo methodu iki stringbuilderi lexicographically karsilastirir. o yuzden int data döner.
        //buyuk kucuk harflerde ascii degerleri alir


    }
}

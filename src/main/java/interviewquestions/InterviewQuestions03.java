package interviewquestions;

import java.util.Arrays;
import java.util.HashMap;

public class InterviewQuestions03 {
    public static void main(String[] args) {


        //Example: bir stringdeki kelimelerin görunum sayilarinin kac tane oldugunu gösteren bir kod yaziniz


        HashMap<String,Integer> wordsMap = new HashMap<>();

        String str1= "ALi yazar veli yazar, ali gelir veli gelir";
        str1= str1.replaceAll("\\p{Punct}","");// \\p{Punct} noktalama isaretleri

        System.out.println(str1);

        String[]wordsArr= str1.split(" ");
        System.out.println(Arrays.toString(wordsArr)); //[ALi, yazar, veli, yazar, ali, gelir, veli, gelir]

        for(String w: wordsArr){
            Integer numOfOccurrence= wordsMap.get(w);// get methodu eger obje o mapte yoksa bana null dondurur

            if(numOfOccurrence==null){
                wordsMap.put(w,1);// map e put methoduyla entry eklerken key(w)=value(1) olarak ekler

            }else{
                wordsMap.replace(w,numOfOccurrence+1);//mape put methoduyla entry eklerken key(w)=value(numOfOccurrence+1)

            }

        }System.out.println(wordsMap);

        // bir cumledeki harflerin gorunum sayisini gosteren bir kod yaziniz
        // Java is Java----> j=2 a=4 ..( maps goruntusu)

        HashMap<String, Integer> lettersMap= new HashMap<>();
        System.out.println(lettersMap);
        String sentence="java is java.";

        sentence=sentence.replaceAll("[^a-zA-Z]","");//javaisjava
        System.out.println(sentence);

        String[] lettersArray= sentence.split("");
        System.out.println(Arrays.toString(lettersArray));//[j, a, v, a, i, s, j, a, v, a]

        for(String w:lettersArray){
            Integer numOfOccurrence= lettersMap.get(w);// eger letterMapte o "key" yok ise null döndurur.
            if(numOfOccurrence==null){

                lettersMap.put(w,1);

            }else{
                lettersMap.replace(w,numOfOccurrence+1);
            }

        }
        System.out.println(lettersMap);




    }
}

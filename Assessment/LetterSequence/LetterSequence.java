import java.util.*;
class LetterSequence{
    private String sentence;
    LetterSequence(String sentence){
        this.sentence=sentence;
    }
    public TreeMap<Character,Integer> computeFrequency(){
        TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch==' ')
                continue;
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        return map;
    }
    public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap){
        for(Map.Entry<Character,Integer> entry:frequencyMap.entrySet()){
            System.out.print(entry.getKey()+":");
            for(int i=1;i<=entry.getValue();i++)
                System.out.print("*");
            System.out.println();
        }
    }
}

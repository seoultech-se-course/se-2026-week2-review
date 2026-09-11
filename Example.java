import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        Example e = new Example();
        String s = e.reverse("abc", new ArrayList<>());        
        System.out.println(s);        
    }

    public String reverse(String str, List<String> list) {
        // str 자체가 null로 올수도 있다.
        if (str == null){
            throw new IllegalArgumentException("str must be not null");
        }
        
        if(list == null)
            list = new ArrayList<>();
        // length는 절대로 음수가 될 수 없기 떄문에 str.length() < 0는 항상 false를 반환ㄴ
        if (str.length() == 0) {  
            StringBuffer sb = new StringBuffer();
            for (String s : list) {
                sb.append(s);
            }
            return sb.toString();          
            
        }
        list.add(str.substring(str.length()-1));
        return reverse(str.substring(0, str.length()-1), list);            
    }
}

import com.sun.org.apache.xalan.internal.utils.FeatureManager;
import com.sun.org.apache.xpath.internal.Arg;

/**
 * Created by miser on 10/4/2016.
 */
public class String3SamesEnds {

    public static String sameEnds(String string){
        int len = string.length();
        String fin = "";
        String tmp = "";

        for (int i = 0; i < len; i++) {
            tmp += string.charAt(i);
            int tmplen = tmp.length();
            if (i < len / 2 && tmp.equals(string.substring(len - tmplen, len))){
                fin = tmp;
            }
        }
        return fin;
    }

    public static void main(String[] args){
        String test = sameEnds("abXYab");
        System.out.println(test);
    }
}

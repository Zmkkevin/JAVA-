package Swardtooffer;

public class offer05_replaceBlankspace {
    public static void main(String[] args) {
        String s =
                "We are happy.";
        char[] c = s.toCharArray();
        String result = "";
        for(char i:c){
            if(i==' '){
                result = result + "%20";
            }else{
                result = result +i;
            }
        }
        System.out.println(result);
    }
}

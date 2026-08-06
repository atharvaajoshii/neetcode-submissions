class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            int len = str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }
        String encoded_string = sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> decoded_strs = new ArrayList<>();

        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            i=j+len+1;
            decoded_strs.add(word);
        }
        return decoded_strs;
    }
}

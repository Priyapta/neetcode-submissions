class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String word: strs){
            if (word.equals("")) {
            result +=  "5" + "0#"; 
            continue;
            }
            result +=  word + "0#"; 

        }


        return result;
    }

    public List<String> decode(String str) {
        if(str == ""){
           return new ArrayList<>();
        }
        List<String> result = Arrays.asList(str.split("0#"));
        for(int i = 0  ; i < result.size();i++){
            if(result.get(i).equals("5")){
                result.set(i,"");
            }
        }
        
        return result;

    }
}

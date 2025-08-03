class SqueakyClean {
    static String clean(String identifier) {
       
    String regex = "[^0-9a-zA-Z_-]";
        
        String cleanWhitespace = identifier.replaceAll(" ", "_").replaceAll("4", "a").replaceAll("3", "e").replaceAll("0", "o").replaceAll("1", "l").replaceAll("7", "t").replaceAll(regex, "");
       
        
        if (cleanWhitespace.contains("-")) {
                String[] words = cleanWhitespace.split("-");
                for (int i = 1; i< words.length; i++){
                    words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                    return String.join("", words);                
                }
        }
            

        return cleanWhitespace;
    }
}

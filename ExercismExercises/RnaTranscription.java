class RnaTranscription {
    String transcribe(String dnaStrand) {
        String result = "";
        for(char letter : dnaStrand.toCharArray())
            {
                if(letter=='G')
                    result+='C';
                if(letter=='C')
                    result+='G';
                if(letter=='T')
                    result+='A';
                if(letter=='A')
                    result+='U';
            }
        return result;
    }
}
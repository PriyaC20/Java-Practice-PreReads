class TwelveDays {
    String verse(int verseNumber) {
                
                String result="";
                result +="On the ";
                switch(verseNumber)
                {
                    case 1:
                        result += "first ";
                        break;
                    case 2:
                        result += "second ";
                        break;
                    case 3:
                        result += "third ";
                        break;
                    case 4:
                        result += "fourth ";
                        break;
                    case 5:
                        result += "fifth ";
                        break;
                    case 6:
                        result += "sixth ";
                        break;
                    case 7:
                        result += "seventh ";
                        break;
                    case 8:
                        result += "eighth ";
                        break;
                    case 9:
                        result += "ninth ";
                        break;
                    case 10:
                        result += "tenth "; 
                        break;
                    case 11:
                        result += "eleventh ";
                        break;
                    case 12:
                        result += "twelfth "; 
                        break;         
                }
                result += "day of Christmas my true love gave to me: ";
        
                if(verseNumber==1)
                {
                    result += "a Partridge in a Pear Tree.\n";
                    return result;
                }  
                for(int i=verseNumber; i>=1; i--) 
                {
                    switch(i)
                    {
                        case 1:
                            result += "and a Partridge in a Pear Tree.\n";
                            break;
                        case 2:
                            result += "two Turtle Doves, ";
                            break;
                        case 3:
                            result += "three French Hens, ";
                            break;
                        case 4:
                            result += "four Calling Birds, ";
                            break;
                        case 5:
                            result += "five Gold Rings, ";
                            break;
                        case 6:
                            result += "six Geese-a-Laying, ";
                            break;
                        case 7:
                            result += "seven Swans-a-Swimming, ";
                            break;
                        case 8:
                            result += "eight Maids-a-Milking, ";
                            break;
                        case 9:
                            result += "nine Ladies Dancing, ";
                            break;
                        case 10:
                            result += "ten Lords-a-Leaping, "; 
                            break;
                        case 11:
                            result += "eleven Pipers Piping, ";
                            break;
                        case 12:
                            result += "twelve Drummers Drumming, ";
                            break;
                    }
                }
            return result;
        }
    
    
        String verses(int startVerse, int endVerse) {
            String result="";
            for(int i=startVerse; i<endVerse; i++)
            {
                result += verse(i);
                result+="\n";
            }
            result += verse(endVerse);
            return result;
        }
    
        String sing() {
            String result="";
            for(int i=1; i<12; i++)
            {
                result += verse(i);
                result+="\n";
            }
            result += verse(12);
            return result;
        }
}

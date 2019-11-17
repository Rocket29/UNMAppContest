public class Util {

    public static String printArray(int[] intArr){
        String returnVal ="";
        if (intArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (int value : intArr) {
                returnVal = returnVal + value + "\n";
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static String printArray(String[] stringArr){
        String returnVal ="";
        if (stringArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (String s : stringArr) {
                if (s != null) {
                    returnVal = returnVal + s + "\n";
                }
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static String printArray(char[] charArr){
        String returnVal ="";
        if (charArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (char c : charArr) {
                returnVal = returnVal + c + "\n";
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }
    public static String printArray(Issues[] issuesArr){
        String returnVal ="";
        if (issuesArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (Issues issues : issuesArr) {
                returnVal = returnVal + ((issues.toString())) + "\n";
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static String printArray(Elections[] electionsArr){
        String returnVal ="";
        if (electionsArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (Elections elections : electionsArr) {
                returnVal = returnVal + ((elections.toString())) + "\n";
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static String printArray(VotingDistrict[] votingDistrictArr){
        String returnVal ="";
        if (votingDistrictArr.length == 0){
            returnVal = "No array passed in.";
        } else {

            for (VotingDistrict votingDistrict : votingDistrictArr) {
                if (votingDistrict != null) {
                    returnVal = returnVal + votingDistrict.toString() + "\n";
                }
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static String printArray(SchoolDistrict[] SchoolDistrictArr){
        String returnVal ="";
        if (SchoolDistrictArr.length == 0){
            returnVal = "No array passed in.";
        } else {
            for (SchoolDistrict schoolDistrict : SchoolDistrictArr) {
                returnVal = returnVal + ((schoolDistrict.toString())) + "\n";
            }
        }
        System.out.println(returnVal);
        return returnVal;
    }

    public static void main (String[] args){
        int[] ints = new int[40];
        for (int i = 0; i < ints.length; i++){
         ints[i] = (int)(Math.random() * 10);
        }
        char[] chars = new char[26];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';
        chars[5] = 'f';
        chars[6] = 'g';
        chars[7] = 'h';
        chars[8] = 'i';
        chars[9] = 'j';
        chars[10] = 'k';
        chars[11] = 'l';
        chars[12] = 'm';
        chars[13] = 'n';
        chars[14] = 'o';
        chars[15] = 'p';
        chars[16] = 'q';
        chars[17] = 'r';
        chars[18] = 's';
        chars[19] = 't';
        chars[20] = 'u';
        chars[21] = 'v';
        chars[22] = 'w';
        chars[23] = 'x';
        chars[24] = 'y';
        chars[25] = 'z';

        Util.printArray(chars);

    }


}

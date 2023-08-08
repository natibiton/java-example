package org.practice;

import java.util.ArrayList;
import java.util.List;

//This class will get a string of numbers and will return all possible combinations of it (reading from left to right) in IPV4 format
//i.e. 0-255.0-255.0-255.0-255
public class IPProvider {
    private static IPProvider ipProviderInstance = new IPProvider();
    private IPProvider(){}

    public static IPProvider getIPProviderInstance(){
        return ipProviderInstance;
    }

    //a whole number greater than 1 whose only factors are 1 and itself
    public List<String> getIPV4ListOutOf(String numbers){
        List<String> ipv4 = new ArrayList<>();

        for(int ipIndex1 = 1; ipIndex1 < 4; ipIndex1++){
            StringBuilder ipPart1 = new StringBuilder();
            if(getIPV4Portion(numbers, 0, ipIndex1, ipPart1)){
                for(int ipIndex2 = 1; ipIndex2 < 4; ipIndex2++){
                    StringBuilder ipPart2 = new StringBuilder();
                    if(getIPV4Portion(numbers, ipIndex1, ipIndex1 + ipIndex2, ipPart2)) {
                        for(int ipIndex3 = 1; ipIndex3 < 4; ipIndex3++){
                            StringBuilder ipPart3 = new StringBuilder();
                            if(getIPV4Portion(numbers, ipIndex1 + ipIndex2, ipIndex1 + ipIndex2 + ipIndex3, ipPart3)){
                                StringBuilder ipPart4 = new StringBuilder();
                                if(getIPV4Portion(numbers, ipIndex1 + ipIndex2 + ipIndex3, 0, ipPart4)){
                                    ipv4.add(ipPart1 + "." + ipPart2 + "." + ipPart3 + "." + ipPart4);
                                }
                            }
                        }
                    }
                }
            }
        }

        return ipv4;
    }

    private boolean getIPV4Portion(String numbers, int startIndex, int endIndex, StringBuilder ipPortion){
        if(startIndex > numbers.length() || endIndex > numbers.length()){
            return Boolean.FALSE;
        }

        if(endIndex != 0) {
            ipPortion.append(numbers.substring(startIndex, endIndex));
        }
        else{
            ipPortion.append(numbers.substring(startIndex));
        }

        int intValue = Integer.valueOf(ipPortion.toString());
        if( intValue < 0 || 255 < intValue){
            return Boolean.FALSE;
        }

        if(ipPortion.length() > 1 && ipPortion.charAt(0) == '0'){
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }


}

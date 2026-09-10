class Solution {
    public boolean canTransform(String start, String end) {
    //     if (start.equals(result)) return true;
    //     while (start.contains("XL") || start.contains("RX")) {
    //         start = start.replace("XL", "LX");
    //         start = start.replace("RX", "XR");
    //     }
    // return start.equals(result);
    if(!start.replace("X","").equals(end.replace("X","")))
       return false;
    int pointer1=0,pointer2=0;
    while(pointer1<start.length()&&pointer2<end.length()){
    while(pointer1<start.length()&&start.charAt(pointer1)=='X')
        pointer1++;
    while(pointer2<end.length()&&end.charAt(pointer2)=='X')
        pointer2++;
    if(pointer1==start.length()&&pointer2==end.length())
        return true;
    if(pointer1==start.length()||pointer2==end.length())
        return false;
    if(start.charAt(pointer1)!=end.charAt(pointer2))
        return false;
    if(start.charAt(pointer1)=='L'&&pointer2>pointer1)
        return false;
    if(end.charAt(pointer2)=='R'&&pointer1>pointer2)
        return false;
    pointer1++;
    pointer2++;
}
return true;
    }
}
package town;

public enum Objects {
    MALISHI("малышек"),
    CARROT("морковку"),
    ROOT("с корнем"),
    ROPE("веревку"),
    WATER("вода");
    private String val;
    private Objects(String v){
        val = v;
    }
    public String GetValue(){
        return val;
    }
}

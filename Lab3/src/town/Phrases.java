package town;

public enum Phrases {
    HOME("домой"),
    DVOR("во дворе"),
    TOWN("В Зеленом городе");
    private String val;
    private Phrases (String v){
        val = v;
    }
    public String GetValue() {
        return val;
    }

}

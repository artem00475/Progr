package town;

public enum Phrases {
    HOME("домой"),
    DVOR("во дворе"),
    TOWN("В Зеленом городе"),
    MOON("на поверхности Луны");
    private String val;
    Phrases (String v){
        val = v;
    }
    public String GetValue() {
        return val;
    }

}

package town.house;
import town.Objects;

public class House {
    String houseName;
    public House(String nam){houseName=nam;
    }
    public void water(Objects obj){System.out.println("В "+houseName+" была "+obj.GetValue());}
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        House house = (House) obj;
        return this.houseName == house.houseName;
    }
    public int hashCode() {
        return this.houseName.hashCode();
    }
    public String toString() {
        return this.houseName;
    }
    public static class Yard{
        String yardName;
        public Yard(String nam){yardName=nam;}
        public void is(House house){System.out.println("В "+house.houseName+" был "+yardName);}
        @Override
        public boolean equals(Object obj) {
            if (this.getClass() != obj.getClass())
                return false;
            Yard yard = (Yard) obj;
            return this.yardName == yard.yardName;
        }
        public int hashCode() {
            return this.yardName.hashCode();
        }
        public String toString() {
            return this.yardName;
        }

        public static class Garden{
            String gardenName;
            public Garden(String nam){gardenName=nam;}
            public void is(House.Yard yard){System.out.println("В "+yard.yardName+" был "+gardenName);}
            @Override
            public boolean equals(Object obj) {
                if (this.getClass() != obj.getClass())
                    return false;
                Garden garden = (Garden) obj;
                return this.gardenName == garden.gardenName;
            }
            public int hashCode() {
                return this.gardenName.hashCode();
            }
            public String toString() {
                return this.gardenName;
            }
        }
    }
}

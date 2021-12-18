package town.house;
import town.Objects;

public class House {
    String houseName;
    public House(String nam){houseName=nam;
    }
    public void water(Objects obj){
        System.out.println("В "+houseName+" была "+obj.GetValue());
        Toilet toilet = new Toilet();
        toilet.works();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return houseName.equals(house.houseName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(houseName);
    }
    @Override
    public String toString() {
        return this.houseName;
    }
    private class Toilet{
        private void works(){System.out.println("Туалет работает");}
    }
    public static class Yard{
        String yardName;
        public Yard(String nam){yardName=nam;}
        public void is(House house){System.out.println("В "+house.houseName+" был "+yardName);}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Yard yard = (Yard) o;
            return yardName.equals(yard.yardName);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(yardName);
        }
        @Override
        public String toString() {
            return this.yardName;
        }

        public static class Garden{
            String gardenName;
            public Garden(String nam){gardenName=nam;}
            public void is(House.Yard yard){System.out.println("В "+yard.yardName+" был "+gardenName);}

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Garden garden = (Garden) o;
                return gardenName.equals(garden.gardenName);
            }

            @Override
            public int hashCode() {
                return java.util.Objects.hash(gardenName);
            }
            @Override
            public String toString() {
                return this.gardenName;
            }
        }
    }
}

package Session8;

public class StaticExample2 {

    static class Config{
        static int defaulfValue;
        static {
            defaulfValue = 100;
        }

        public static int getDefaulfValue(){
            return defaulfValue;
        }
        public void setDefaulfValue(int value){
            defaulfValue = value;
        }
    }
    public static void main(String[] args) {
        Config c  = new Config();
        Config c2 = new Config();
        System.out.println(c.getDefaulfValue());
        c2.setDefaulfValue(200);
        System.out.println(c.getDefaulfValue());

    }
}

package J28_Interface;

public interface DısDonanım {

    void kapi(); // public abstract methodddur.

    public abstract void kaporta(); // public abstract method

    String RENK="gırmızı"; // public static final String renk = "gırmızı";

    public default String sisLamp (){// public concrete method-->obj ile call
        return "sisli havada mutlaka kullan";
    }


    public static void anten(){// public static concrete method --> interfacename call
        System.out.println("köpek balığı anten");
    }



}

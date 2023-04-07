package Interface;

public class Nokia implements Phone{
    @Override
    public String Screen() {
        return "LED";
    }

    @Override
    public String RAM() {
        return "8GB";
    }

    @Override
    public String Processor() {
        return "QS801";
    }

    @Override
    public String ROM() {
        return "226GB";
    }

    @Override
    public String OS() {
        return "Android Lolipop";
    }
}

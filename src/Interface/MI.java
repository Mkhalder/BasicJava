package Interface;

public class MI implements Phone{
    @Override
    public String Screen() {
        return "LCD";
    }

    @Override
    public String RAM() {
        return "16GB";
    }

    @Override
    public String Processor() {
        return "MT6765";
    }

    @Override
    public String ROM() {
        return "132GB";
    }

    @Override
    public String OS() {
        return "Android 8.1 Oreo";
    }
}

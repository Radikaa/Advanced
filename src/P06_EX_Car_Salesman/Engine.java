package P06_EX_Car_Salesman;

public class Engine {
    private String EngineModel;
    private String EnginePower;

    private String Displacement;

    private String Efficiency;

    public Engine(String engineModel, String enginePower, String displacement, String efficiency) {
        EngineModel = engineModel;      
        EnginePower = enginePower;
        Displacement = displacement;
        Efficiency = efficiency;
    }
}
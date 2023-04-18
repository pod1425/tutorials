package lesson_interractions.dependency;

public class Part {
    public String state;
    private int turnsToAssemble;
    public String name;

    public Part(String name, int turnsToAssemble) {
        state = "Unassembled";
        this.name = name;
        this.turnsToAssemble = turnsToAssemble;
    }

    public boolean assemble(int turns) {
        if (turns == turnsToAssemble) {
            state = "Assembled";
            return true;
        }
        if (turns > turnsToAssemble) {
            state = "Broken";
        }
        return false;
    }
}

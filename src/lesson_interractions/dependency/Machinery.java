package lesson_interractions.dependency;

public class Machinery {
    private int turnsToAssemble;

    public Machinery(int turnsToAssemble) {
        this.turnsToAssemble = turnsToAssemble;
    }

    public void assemblePart(Part part) {
        part.assemble(turnsToAssemble);
    }
}

package sample.parser.Model;

public class Items {
    private String declarationNumber;

    public Items(String declarationNumber){
        this.declarationNumber = declarationNumber;
    }

    public void setDeclarationNumber(String declarationNumber) {
        this.declarationNumber = declarationNumber;
    }

    public String getDeclarationNumber() {
        return declarationNumber;
    }
    @Override
    public String toString() {
        return (declarationNumber);
    }
}

package PrototypeRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    IntelligentStudent(){
    }
    IntelligentStudent(IntelligentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }


}

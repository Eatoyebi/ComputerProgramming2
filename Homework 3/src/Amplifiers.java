 class Amplifier {

    protected double R1;
    protected double R2;

    public Amplifier(double R1, double R2) {
        this.R1 = R1;
        this.R2 = R2;
    }
    public double getGain() {
        return 0;
    }
    public String getDescription() {
        return " ";
    }
}

class InvertingAmplifier extends Amplifier {
    public InvertingAmplifier(double R1, double R2) {
        super(R1, R2);
    }

    @Override
    public double getGain() {
        return -R2 / R1;
    }

    @Override
    public String getDescription() {
        return "Inverting amplifier";
    }
}

class NoninvertingAmplifier extends Amplifier {
    public NoninvertingAmplifier(double R1, double R2) {
        super(R1, R2);
    }

    @Override
    public double getGain() {
        return 1 + (R2 / R1);
    }

    @Override
    public String getDescription() {
        return "Noninverting amplifier";
    }
}
class VdivAmplifier extends Amplifier {
    public VdivAmplifier(double R1, double R2) {
        super(R1, R2);
    }
    @Override
    public double getGain() {
        return R2 / (R1 + R2);
    }
    @Override
    public String getDescription(){
        return "Voltage Divider and Voltage Follower";
    }
}

class AmplifiersApp {
    public static void main(String[] args) {
        Amplifier[] amplifiers = {
                new InvertingAmplifier(4.0,20.0),
                new NoninvertingAmplifier(4.0,20.0),
                new VdivAmplifier(4.0,20.0)
        };

        for (Amplifier amplifier: amplifiers) {
            System.out.println(amplifier.getDescription() + ": R1 = " + amplifier.R1 + ", R2 = " + amplifier.R2);
            System.out.println("Gain: " + amplifier.getGain());
            System.out.println();
        }
    }
}
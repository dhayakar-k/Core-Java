package inheritance.multiple.others;

public class ClassC implements InterA, InterB{
    @Override
    public void execute(int c) {
       // InterA.super.execute(5);
        c = c + '7';
        System.out.println("Value: "+c);
    }
}

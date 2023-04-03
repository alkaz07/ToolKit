public class Radar implements IDistanceMeasurer{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("если один из объект отражает радиоволны," +
                "то всё получится, а иначе нет");
        return 0;
    }
}

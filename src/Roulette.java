public class Roulette implements IDistanceMeasurer{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("���������� ������� ����� "
                            + a.toString()
                            + ", ���������� �� �� "+ b);
        return 0;
    }
}

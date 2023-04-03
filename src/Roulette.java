public class Roulette implements IDistanceMeasurer{
    @Override
    public double measureDistance(Object a, Object b) {
        System.out.println("закрепляем рулетку возле "
                            + a.toString()
                            + ", дотягиваем ее до "+ b);
        return 0;
    }
}

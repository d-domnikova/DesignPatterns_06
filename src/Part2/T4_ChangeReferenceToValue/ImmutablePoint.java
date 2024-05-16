package Part2.T4_ChangeReferenceToValue;

public record ImmutablePoint(Point point) {
    public ImmutablePoint(Point point) {
        this.point = new Point(point.getX(), point.getY());
    }
}

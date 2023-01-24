interface Polygon {
    abstract double volume();
    class Rectangle implements Polygon{
        @Override
        public double volume() {
            double l=8,b=5;
           double volume=(l*b);

            return volume;
        }

    }

    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        System.out.println(obj.volume());

    }
}

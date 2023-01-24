interface Language1 {
    abstract void talk();
}
interface Language2 {
    abstract void write();
}

    class MotherTounge implements Language1,Language2 {
        public void talk() {
            System.out.println("my mother tounge is tamil");
        }

        @Override
        public void write() {
            System.out.println("my mother tounge is good to write");
        }

        public static void main(String[] args) {
        MotherTounge obj=new MotherTounge();

        obj.talk();
        obj.write();
    }
}


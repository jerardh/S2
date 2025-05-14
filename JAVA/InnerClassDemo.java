
class CPU {

    float price;

    public CPU(float price) {
        this.price = price;
    }

    class Processor {

        int coreCount;
        String manufacturer;

        public Processor(int coreCount, String manufacturer) {
            this.coreCount = coreCount;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Manufacturer=" + manufacturer);
            System.out.println("Core Count=" + coreCount);
        }

    }

    static class RAM {

        int memory;
        String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Memory=" + memory + " GB");
            System.out.println("Manufacturer=" + manufacturer);
        }

    }

    void display() {
        System.out.println("CPU Price=" + price);
    }

}

class InnerClassDemo {

    public static void main(String[] args) {
        CPU cpu = new CPU(15000);
        CPU.Processor processor = cpu.new Processor(4, "Intel");//requires outer class instance to create non static inner class instance
        CPU.RAM ram = new CPU.RAM(8, "HP");// does not requires outer class instance to create  static inner class instance
        cpu.display();
        processor.display();
        ram.display();
    }
}

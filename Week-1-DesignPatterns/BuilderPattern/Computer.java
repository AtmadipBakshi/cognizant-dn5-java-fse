class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
    }

    static class Builder {
        private String CPU;
        private String RAM;
        private String storage;

        Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}
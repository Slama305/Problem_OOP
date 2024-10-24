class OfficeWorker implements IWorker , IPesonalWork{
    @Override
    public void work() {
        System.out.println("Office worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Office worker is eating lunch");
    }

    @Override
    public void takeBreak() {
        System.out.println("Office worker is taking a break");
    }
}
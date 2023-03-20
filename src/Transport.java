public abstract class Transport implements Diagnostable {

    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }


        @Override
        public void service() {
        for (int i = 0;i < wheelsCount; i++){
            updateTyre();
        }
    }
}

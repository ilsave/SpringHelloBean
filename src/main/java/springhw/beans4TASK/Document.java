package springhw.beans4TASK;

abstract class Document {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                '}';
    }
}

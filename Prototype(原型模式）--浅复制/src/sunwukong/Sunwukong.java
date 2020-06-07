package sunwukong;



public class Sunwukong implements Cloneable {
    private String name;


    public Sunwukong(String name) {
        this.name = name;
    }


    public void display() {
        System.out.println(name);

    }
        @Override
        public Sunwukong clone()
        {
            try {
                return (Sunwukong) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

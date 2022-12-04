public class Gospodin_Pek extends Human implements Appearable, Runnable_a_program {
    public Gospodin_Pek(String name) {
        super(name);
    }


    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (this.hashCode() != obj.hashCode()) return false;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this.name == ((Human) obj).name) return true;
        else return false;

    }

    @Override
    public String toString() {
        return "Имя: " + get_name();
    }

    @Override
    public void appear(String where) {
        System.out.println( where+ " появился " +get_name() + ".") ;
    }

    public void run_program(String what){
        System.out.println(get_name()+ " вел " + what+ ".");
    }


}